package net.sabitron.alternia.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.sabitron.alternia.entity.FairyBullEntity;

import net.minecraft.resources.ResourceLocation;

public class FairyBullModel extends GeoModel<FairyBullEntity> {
	@Override
	public ResourceLocation getAnimationResource(FairyBullEntity entity) {
		return new ResourceLocation("alternia", "animations/fairy_bull.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FairyBullEntity entity) {
		return new ResourceLocation("alternia", "geo/fairy_bull.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FairyBullEntity entity) {
		return new ResourceLocation("alternia", "textures/entities/" + entity.getTexture() + ".png");
	}

}
