package com.github.draylar.nolimits.mixin;

import net.minecraft.world.BlockView;
import net.minecraft.world.StructureHolder;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkSection;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Chunk.class)
public interface ChunkMixin extends BlockView, StructureHolder {

    @Shadow ChunkSection[] getSectionArray();

    default void method_12228(int i, int j, CallbackInfoReturnable<Boolean> cir) {
        if (i < 0) {
            i = 0;
        }

        if (j >= 512) {
            j = 511;
        }

        for(int k = i; k <= j; k += 16) {
            if (!ChunkSection.isEmpty(this.getSectionArray()[k >> 4])) {
                cir.setReturnValue(false);
            }
        }

        cir.setReturnValue(true);
    }
}
