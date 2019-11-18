package com.github.draylar.nolimits.mixin;

import net.minecraft.world.chunk.ProtoChunk;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ProtoChunk.class)
public class ProtoChunkMixin {

    @ModifyConstant(
            method = "<init>(Lnet/minecraft/util/math/ChunkPos;Lnet/minecraft/world/chunk/UpgradeData;[Lnet/minecraft/world/chunk/ChunkSection;Lnet/minecraft/world/ChunkTickScheduler;Lnet/minecraft/world/ChunkTickScheduler;)V",
            constant = @Constant(intValue = 16)
    )
    public int modifyChunkArray(int original) {
        return 32;
    }

    @ModifyConstant(
            method = "getLightSourcesBySection",
            constant = @Constant(intValue = 16)
    )
    public int getLightSourcesBySection(int original) {
        return 32;
    }
}
