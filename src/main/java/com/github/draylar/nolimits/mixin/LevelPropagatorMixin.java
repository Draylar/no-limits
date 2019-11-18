package com.github.draylar.nolimits.mixin;

import com.github.draylar.nolimits.util.mixin.PendingUpdate;
import com.github.draylar.nolimits.util.mixin.PendingUpdates;
import it.unimi.dsi.fastutil.longs.Long2ByteFunction;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import net.minecraft.world.chunk.light.LevelPropagator;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelPropagator.class)
public class LevelPropagatorMixin {

    @Mutable @Shadow @Final private int levelCount;

    @Mutable @Shadow @Final private LongLinkedOpenHashSet[] pendingIdUpdatesByLevel;

    @Mutable@Shadow @Final private Long2ByteFunction pendingUpdates;

    @Mutable@Shadow private int minPendingLevel;

    @Inject(at = @At("RETURN"), method = "<init>")
    private void init(int levelCount, int expectedLevelSize, int expectedTotalSize, CallbackInfo ci) {
        if (levelCount >= 254) {
            throw new IllegalArgumentException("Level count must be < 254.");
        } else {
            this.levelCount = levelCount;
            this.pendingIdUpdatesByLevel = new LongLinkedOpenHashSet[levelCount];

            for(int i = 0; i < levelCount; ++i) {
                this.pendingIdUpdatesByLevel[i] = new PendingUpdate(expectedLevelSize * 2);
            }

            this.pendingUpdates = new PendingUpdates(expectedTotalSize);
            this.pendingUpdates.defaultReturnValue((byte)-1);
            this.minPendingLevel = levelCount;
        }
    }
}
