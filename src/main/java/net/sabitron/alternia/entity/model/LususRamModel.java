package net.sabitron.alternia.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.sabitron.alternia.entity.LususRamEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class LususRamModel extends GeoModel<LususRamEntity> {
	@Override
	public ResourceLocation getAnimationResource(LususRamEntity entity) {
		return new ResourceLocation("alternia", "animations/ram_noodle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LususRamEntity entity) {
		return new ResourceLocation("alternia", "geo/ram_noodle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LususRamEntity entity) {
		return new ResourceLocation("alternia", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(LususRamEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
