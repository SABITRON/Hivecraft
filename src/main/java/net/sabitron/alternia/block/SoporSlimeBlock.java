
package net.sabitron.alternia.block;

import net.sabitron.alternia.procedures.SoporSlimeEffectProcedure;
import net.sabitron.alternia.init.AlterniaModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class SoporSlimeBlock extends LiquidBlock {
	public SoporSlimeBlock() {
		super(() -> AlterniaModFluids.SOPOR_SLIME.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		SoporSlimeEffectProcedure.execute(entity);
	}
}
