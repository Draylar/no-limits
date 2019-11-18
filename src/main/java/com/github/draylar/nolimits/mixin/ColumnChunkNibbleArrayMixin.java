package com.github.draylar.nolimits.mixin;

import net.minecraft.world.chunk.ChunkNibbleArray;
import net.minecraft.world.chunk.ColumnChunkNibbleArray;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ColumnChunkNibbleArray.class)
public class ColumnChunkNibbleArrayMixin extends ChunkNibbleArray {

    @ModifyConstant(
            method = "asByteArray",
            constant = @Constant(intValue = 2048)
    )
    public int asByteArray(int original) {
        return 2048 * 2;
    }

    @ModifyConstant(
            method = "asByteArray",
            constant = @Constant(intValue = 16)
    )
    public int asByteArray16(int original) {
        return 32;
    }

}
