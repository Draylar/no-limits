package com.github.draylar.nolimits.mixin;

import net.minecraft.client.render.WorldRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @ModifyConstant(
            method = "getAdjacentChunkRenderer",
            constant = @Constant(intValue = 256, ordinal = 0)
    )
    public int modifyChunkArray(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "renderWorldBorder",
            constant = @Constant(intValue = 256)
    )
    public int renderWorldBorder(int original) {
        return 512;
    }
}
