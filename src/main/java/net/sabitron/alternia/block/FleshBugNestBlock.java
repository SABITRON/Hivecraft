
package net.sabitron.alternia.block;

import net.sabitron.alternia.procedures.CollectFliesProcedure;
import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.common.util.ForgeSoundType;

import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Collections;

public class FleshBugNestBlock extends Block {
	public FleshBugNestBlock() {
		super(BlockBehaviour.Properties.of().ignitedByLava().instrument(NoteBlockInstrument.BASS).mapColor(MapColor.COLOR_GREEN)
				.sound(new ForgeSoundType(1.0f, 1.0f, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.break")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.step")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.hit")),
						() -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.rooted_dirt.fall"))))
				.strength(2f, 10f));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u00A77An insect nest baited with rotten flesh. Smells terrible to you, but maybe not to some flies"));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(AlterniaModBlocks.EMPTY_BUG_NEST.get()));
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		CollectFliesProcedure.execute(world, x, y, z);
		world.scheduleTick(pos, this, 1);
	}
}
