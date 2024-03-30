
package net.sabitron.alternia.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.List;

public class IndigoHemoglassPaneBlock extends IronBarsBlock {
	public IndigoHemoglassPaneBlock() {
		super(BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.HAT).mapColor(MapColor.COLOR_BLUE).sound(SoundType.GLASS).strength(1f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).noLootTable());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}
}
