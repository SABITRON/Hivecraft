package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

public class BonemealVioletFlowerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(AlterniaModBlocks.VIOLET_HEMO_FLOWER.get()));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
