package net.sabitron.alternia.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.sabitron.alternia.entity.RamLususEntity;

import net.minecraft.resources.ResourceLocation;

public class RamLususModel extends GeoModel<RamLususEntity> {
	@Override
	public ResourceLocation getAnimationResource(RamLususEntity entity) {
		return new ResourceLocation("alternia", "animations/ram_noodle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RamLususEntity entity) {
		return new ResourceLocation("alternia", "geo/ram_noodle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RamLususEntity entity) {
		return new ResourceLocation("alternia", "textures/entities/" + entity.getTexture() + ".png");
	}

}
