package com.github.draylar.nolimits.mixin;

import net.minecraft.world.storage.SerializingRegionBasedStorage;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(SerializingRegionBasedStorage.class)
public class SerializingRegionBasedStorageMixin {

    @ModifyConstant(
            method = "method_20436",
            constant = @Constant(intValue = 16)
    )
    private static int method_20436(int original) {
        return 32;
    }

    @ModifyConstant(
            method = "method_20367",
            constant = @Constant(intValue = 16)
    )
    private static int method_20367(int original) {
        return 32;
    }

    @ModifyConstant(
            method = "method_20368",
            constant = @Constant(intValue = 16)
    )
    private static int method_20368(int original) {
        return 32;
    }
}
