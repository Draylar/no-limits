package com.github.draylar.nolimits.mixin;

import net.minecraft.world.chunk.light.ChunkLightProvider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChunkLightProvider.class)
public class ChunkLightProviderMixin {

    @ModifyConstant(
            method = "<init>",
            constant = @Constant(intValue = 256)
    )
    public int modifyExpectedLevelSize(int original) {
        return 512;
    }
}
