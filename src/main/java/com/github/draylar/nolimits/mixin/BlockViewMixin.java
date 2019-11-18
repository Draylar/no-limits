package com.github.draylar.nolimits.mixin;

import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(BlockView.class)
public interface BlockViewMixin {

    @Overwrite
    default int getHeight() {
        return 512;
    }
}
