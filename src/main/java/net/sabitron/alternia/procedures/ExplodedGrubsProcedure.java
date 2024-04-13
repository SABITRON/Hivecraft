package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;

public class ExplodedGrubsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 5, 6); index0++) {
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, (x + 0.5), y, (z + 0.5), new ItemStack(AlterniaModItems.RAW_GRUB_MEAT.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
