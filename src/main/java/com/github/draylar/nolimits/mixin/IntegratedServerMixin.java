package com.github.draylar.nolimits.mixin;

import net.minecraft.server.integrated.IntegratedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {

    @ModifyConstant(
            method = "<init>",
            constant = @Constant(intValue = 256, ordinal = 0)
    )
    public int modifyChunkArray(int original) {
        return 512;
    }
}
