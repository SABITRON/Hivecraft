package net.sabitron.alternia.procedures;

import net.sabitron.alternia.network.AlterniaModVariables;
import net.sabitron.alternia.AlterniaMod;

import net.minecraft.world.level.LevelAccessor;

public class AlterniaDaytimeValueReturnProcedure {
	public static void execute(LevelAccessor world) {
		AlterniaMod.LOGGER.info("Time of day on Alternia:");
		AlterniaMod.LOGGER.info(AlterniaModVariables.MapVariables.get(world).TimeOfDayAlternia);
		AlterniaMod.LOGGER.info("Alternia's daylight handler:");
		AlterniaMod.LOGGER.info(AlterniaModVariables.MapVariables.get(world).DaylightHandler);
		AlterniaMod.LOGGER.info("Minecraft's Internal Daytime:");
		AlterniaMod.LOGGER.info(world.dayTime());
		AlterniaMod.LOGGER.info("Current ingame day:");
		AlterniaMod.LOGGER.info(Math.floor(world.dayTime() / 24000));
	}
}
