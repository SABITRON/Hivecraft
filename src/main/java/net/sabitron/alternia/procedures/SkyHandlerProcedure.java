package net.sabitron.alternia.procedures;

import net.sabitron.alternia.network.AlterniaModVariables;

import net.minecraft.world.level.LevelAccessor;

public class SkyHandlerProcedure {
	public static void execute(LevelAccessor world) {
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
