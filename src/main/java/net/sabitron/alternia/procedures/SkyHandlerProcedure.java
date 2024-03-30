package net.sabitron.alternia.procedures;

import net.sabitron.alternia.network.AlterniaModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SkyHandlerProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double Days = 0;
		Days = Math.floor(world.dayTime() / 24000);
		AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia = world.dayTime() - 24000 * Days;
		AlterniaModVariables.MapVariables.get(world).syncData(world);
		if (AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia < 12140) {
			AlterniaModVariables.MapVariables.get(world).DaylightHandler = 1530;
			AlterniaModVariables.MapVariables.get(world).syncData(world);
		}
		if (12140 < AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia && AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia < 13670 && (AlterniaModVariables.MapVariables.get(world).DaylightHandler == 0) == false) {
			AlterniaModVariables.MapVariables.get(world).DaylightHandler = AlterniaModVariables.MapVariables.get(world).DaylightHandler - 1;
			AlterniaModVariables.MapVariables.get(world).syncData(world);
		}
		if (13670 < AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia && AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia < 22430) {
			AlterniaModVariables.MapVariables.get(world).DaylightHandler = 0;
			AlterniaModVariables.MapVariables.get(world).syncData(world);
		}
		if (22430 < AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia && AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia < 23961 && (AlterniaModVariables.MapVariables.get(world).DaylightHandler == 1530) == false) {
			AlterniaModVariables.MapVariables.get(world).DaylightHandler = AlterniaModVariables.MapVariables.get(world).DaylightHandler + 1;
			AlterniaModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
