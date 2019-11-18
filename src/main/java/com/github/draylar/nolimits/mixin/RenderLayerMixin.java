package com.github.draylar.nolimits.mixin;

import net.minecraft.client.render.RenderLayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(RenderLayer.class)
public class RenderLayerMixin {

    @ModifyConstant(
            method = "getEntitySolid",
            constant = @Constant(intValue = 256)
    )
    private static int getEntitySolid(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityCutout",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityCutout(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityCutoutNoCull",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityCutoutNoCull(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityTranslucentCull",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityTranslucentCull(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityTranslucent",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityTranslucent(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityForceTranslucent",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityForceTranslucent(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntitySmoothCutout",
            constant = @Constant(intValue = 256)
    )
    private static int getEntitySmoothCutout(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getBeaconBeam",
            constant = @Constant(intValue = 256)
    )
    private static int getBeaconBeam(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityDecal",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityDecal(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityNoOutline",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityNoOutline(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEntityAlpha",
            constant = @Constant(intValue = 256)
    )
    private static int getEntityAlpha(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEyes",
            constant = @Constant(intValue = 256)
    )
    private static int getEyes(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEnergySwirl",
            constant = @Constant(intValue = 256)
    )
    private static int getEnergySwirl(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getOutline",
            constant = @Constant(intValue = 256)
    )
    private static int getOutline(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getBlockBreaking",
            constant = @Constant(intValue = 256)
    )
    private static int getBlockBreaking(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getText",
            constant = @Constant(intValue = 256)
    )
    private static int getText(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getTextSeeThrough",
            constant = @Constant(intValue = 256)
    )
    private static int getTextSeeThrough(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getEndPortal",
            constant = @Constant(intValue = 256)
    )
    private static int getEndPortal(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "getLines",
            constant = @Constant(intValue = 256)
    )
    private static int getLines(int original) {
        return 512;
    }

    @ModifyConstant(
            method = "<clinit>",
            constant = @Constant(intValue = 256)
    )
    private static int modifyChunkArray(int original) {
        return 512;
    }
}
