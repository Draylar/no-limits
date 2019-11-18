package com.github.draylar.nolimits.mixin;

import net.minecraft.client.render.BuiltChunkStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(BuiltChunkStorage.class)
public class BuiltChunkStorageMixin {

    @ModifyConstant(
            method = "setViewDistance",
            constant = @Constant(intValue = 16)
    )
    private static int setViewDistance(int original) {
        return 32;
    }
}
