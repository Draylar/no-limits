package com.github.draylar.nolimits.mixin;

import net.minecraft.world.ChunkSerializer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChunkSerializer.class)
public class ChunkSerializerMixin {

    @ModifyConstant(
            method = "deserialize",
            constant = @Constant(intValue = 16)
    )
    private static int modifyChunkArray(int original) {
        return 32;
    }
}
