package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import java.util.Map;

public class WormholeFrameUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ResourceKey<Level> dimension) {
		if (dimension == null)
			return;
		if (!(dimension == (ResourceKey.create(Registries.DIMENSION, new ResourceLocation("alternia:alternia"))) || dimension == Level.OVERWORLD)) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = AlterniaModBlocks.DARKSANDSTONE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
