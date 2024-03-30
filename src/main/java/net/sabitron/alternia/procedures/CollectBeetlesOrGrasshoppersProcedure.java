package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class CollectBeetlesOrGrasshoppersProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (1 == Mth.nextInt(RandomSource.create(), 1, 5000)) {
			if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
				world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.BUG_NEST_BEETLES.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.BUG_NEST_GRASSHOPPERS.get().defaultBlockState(), 3);
			}
		}
	}
}
