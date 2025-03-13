package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class SoporSlimeBeforeReplacingABlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == Blocks.LAVA || blockstate.getBlock() == Blocks.LAVA) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.fire.extinguish")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			AlterniaMod.queueServerWork(1, () -> {
				world.setBlock(BlockPos.containing(x, y, z), AlterniaModBlocks.COBBLED_DARKSTONE.get().defaultBlockState(), 3);
			});
		}
	}
}
