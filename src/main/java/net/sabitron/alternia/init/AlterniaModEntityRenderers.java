
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.client.renderer.ZombieTrollRenderer;
import net.sabitron.alternia.client.renderer.LususSpiderRenderer;
import net.sabitron.alternia.client.renderer.LususRamRenderer;
import net.sabitron.alternia.client.renderer.LususCrabRenderer;
import net.sabitron.alternia.client.renderer.LususCatRenderer;
import net.sabitron.alternia.client.renderer.GrubRenderer;
import net.sabitron.alternia.client.renderer.FairyBullRenderer;
import net.sabitron.alternia.client.renderer.AhabsCrosshairsBeamRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlterniaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AlterniaModEntities.GRUB.get(), GrubRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.ZOMBIE_TROLL.get(), ZombieTrollRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.LUSUS_CRAB.get(), LususCrabRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.LUSUS_RAM.get(), LususRamRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.FAIRY_BULL.get(), FairyBullRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.LUSUS_CAT.get(), LususCatRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.LUSUS_SPIDER.get(), LususSpiderRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.AHABS_CROSSHAIRS_BEAM.get(), AhabsCrosshairsBeamRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.FLUORITE_OCTET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(AlterniaModEntities.FAKE_DICE.get(), ThrownItemRenderer::new);
	}
}
