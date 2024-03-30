
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.fluid.SoporSlimeFluid;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class AlterniaModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, AlterniaMod.MODID);
	public static final RegistryObject<FlowingFluid> SOPOR_SLIME = REGISTRY.register("sopor_slime", () -> new SoporSlimeFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_SOPOR_SLIME = REGISTRY.register("flowing_sopor_slime", () -> new SoporSlimeFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(SOPOR_SLIME.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_SOPOR_SLIME.get(), RenderType.translucent());
		}
	}
}
