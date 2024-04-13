package net.sabitron.alternia.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.sabitron.alternia.entity.CrabLususEntity;

import net.minecraft.resources.ResourceLocation;

public class CrabLususModel extends GeoModel<CrabLususEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrabLususEntity entity) {
		return new ResourceLocation("alternia", "animations/giant_crab_guy.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrabLususEntity entity) {
		return new ResourceLocation("alternia", "geo/giant_crab_guy.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrabLususEntity entity) {
		return new ResourceLocation("alternia", "textures/entities/" + entity.getTexture() + ".png");
	}

}
