package net.sabitron.alternia.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.sabitron.alternia.entity.GrubEntity;

import net.minecraft.resources.ResourceLocation;

public class GrubModel extends GeoModel<GrubEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrubEntity entity) {
		return new ResourceLocation("alternia", "animations/grub.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrubEntity entity) {
		return new ResourceLocation("alternia", "geo/grub.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrubEntity entity) {
		return new ResourceLocation("alternia", "textures/entities/" + entity.getTexture() + ".png");
	}

}
