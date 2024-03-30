package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ForcegrowSeedsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.SHATTERGRAIN_STAGE_1.get().defaultBlockState(), 3);
	}
}
