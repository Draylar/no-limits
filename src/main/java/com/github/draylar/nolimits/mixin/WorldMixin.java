package com.github.draylar.nolimits.mixin;

import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(World.class)
public class WorldMixin {

    @Inject(at = @At("HEAD"), method = "isHeightInvalid(I)Z", cancellable = true)
    private static void isHeightInvalid(int y, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(y < 0 || y >= 512);
    }
}
