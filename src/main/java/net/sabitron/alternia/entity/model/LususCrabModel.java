package net.sabitron.alternia.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.sabitron.alternia.entity.LususCrabEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class LususCrabModel extends GeoModel<LususCrabEntity> {
	@Override
	public ResourceLocation getAnimationResource(LususCrabEntity entity) {
		return new ResourceLocation("alternia", "animations/giant_crab_guy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LususCrabEntity entity) {
		return new ResourceLocation("alternia", "geo/giant_crab_guy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LususCrabEntity entity) {
		return new ResourceLocation("alternia", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(LususCrabEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
