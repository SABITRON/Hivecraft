package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LitDarkstoneRedstoneOreResetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.DARKSTONE_REDSTONE_ORE.get().defaultBlockState(), 3);
	}
}
