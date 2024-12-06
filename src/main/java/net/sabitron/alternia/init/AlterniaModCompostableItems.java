
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.block.ComposterBlock;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlterniaModCompostableItems {
	@SubscribeEvent
	public static void addComposterItems(FMLCommonSetupEvent event) {
		ComposterBlock.COMPOSTABLES.put(AlterniaModItems.SHATTERGRAIN.get(), 0.65f);
		ComposterBlock.COMPOSTABLES.put(AlterniaModItems.SHATTERFLOUR.get(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(AlterniaModItems.INSECT_FOOD.get(), 0.5f);
		ComposterBlock.COMPOSTABLES.put(AlterniaModBlocks.SHATTERGRAIN_SEEDS.get().asItem(), 0.3f);
		ComposterBlock.COMPOSTABLES.put(AlterniaModBlocks.ORACLE_LEAVES.get().asItem(), 0.3f);
	}
}
