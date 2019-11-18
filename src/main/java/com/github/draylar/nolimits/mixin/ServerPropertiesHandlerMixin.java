package com.github.draylar.nolimits.mixin;

import net.minecraft.server.dedicated.ServerPropertiesHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ServerPropertiesHandler.class)
public class ServerPropertiesHandlerMixin {

    @ModifyConstant(
            method = "<init>",
            constant = @Constant(intValue = 256, ordinal = 0)
    )
    public int modifySize(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "<init>",
            constant = @Constant(intValue = 256, ordinal = 1)
    )
    public int modifySize2(int original) {
        return 512;
    }
}
