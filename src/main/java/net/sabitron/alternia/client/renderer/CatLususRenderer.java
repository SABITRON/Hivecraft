
package net.sabitron.alternia.client.renderer;

import net.sabitron.alternia.entity.CatLususEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.OcelotModel;

import com.mojang.blaze3d.vertex.PoseStack;

public class CatLususRenderer extends MobRenderer<CatLususEntity, OcelotModel<CatLususEntity>> {
	public CatLususRenderer(EntityRendererProvider.Context context) {
		super(context, new OcelotModel(context.bakeLayer(ModelLayers.OCELOT)), 0.5f);
	}

	@Override
	protected void scale(CatLususEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(CatLususEntity entity) {
		return new ResourceLocation("alternia:textures/entities/cat_lusus.png");
	}
}
