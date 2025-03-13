package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GreenSporesGrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.1) {
			world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.GREEN_MUSHROOM.get().defaultBlockState(), 3);
		}
	}
}
