
package net.sabitron.alternia.client.renderer;

import net.sabitron.alternia.entity.LususSpiderEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import com.mojang.blaze3d.vertex.PoseStack;

public class LususSpiderRenderer extends MobRenderer<LususSpiderEntity, SpiderModel<LususSpiderEntity>> {
	public LususSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.5f);
	}

	@Override
	protected void scale(LususSpiderEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(LususSpiderEntity entity) {
		return new ResourceLocation("alternia:textures/entities/spider_lusus.png");
	}
}
