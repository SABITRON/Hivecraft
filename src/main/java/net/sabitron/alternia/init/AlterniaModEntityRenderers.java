
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.client.renderer.ZombieTrollRenderer;
import net.sabitron.alternia.client.renderer.SpiderLususRenderer;
import net.sabitron.alternia.client.renderer.GrubRenderer;
import net.sabitron.alternia.client.renderer.CatLususRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlterniaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlterniaModEntities.GRUB.get(), GrubRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.ZOMBIE_TROLL.get(), ZombieTrollRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.CAT_LUSUS.get(), CatLususRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.SPIDER_LUSUS.get(), SpiderLususRenderer::new);
	}
}
