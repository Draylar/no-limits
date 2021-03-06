package com.github.draylar.nolimits.mixin;

import net.minecraft.world.chunk.ChunkNibbleArray;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChunkNibbleArray.class)
public class ChunkNibbleArrayMixin {

    @ModifyConstant(
            method = "<init>([B)V",
            constant = @Constant(intValue = 2048)
    )
    public int init(int original) {
        return 2048 * 2;
    }

    @ModifyConstant(
            method = "set(II)V",
            constant = @Constant(intValue = 2048)
    )
    public int set(int original) {
        return 2048 * 2;
    }

    @ModifyConstant(
            method = "asByteArray",
            constant = @Constant(intValue = 2048)
    )
    public int asByteArray(int original) {
        return 2048 * 2;
    }
}
