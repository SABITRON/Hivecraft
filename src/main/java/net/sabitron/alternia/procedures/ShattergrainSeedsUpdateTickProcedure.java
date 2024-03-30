package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class ShattergrainSeedsUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (1 == Mth.nextInt(RandomSource.create(), 1, 50)) {
			world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.SHATTERGRAIN_STAGE_1.get().defaultBlockState(), 3);
		}
	}
}
