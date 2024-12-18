
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.block.entity.FoodBugNestBlockEntity;
import net.sabitron.alternia.block.entity.FleshBugNestBlockEntity;
import net.sabitron.alternia.block.entity.BugNestGrasshoppersBlockEntity;
import net.sabitron.alternia.block.entity.BugNestFliesBlockEntity;
import net.sabitron.alternia.block.entity.BugNestBeetlesBlockEntity;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class AlterniaModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AlterniaMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FLESH_BUG_NEST = register("flesh_bug_nest", AlterniaModBlocks.FLESH_BUG_NEST, FleshBugNestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FOOD_BUG_NEST = register("food_bug_nest", AlterniaModBlocks.FOOD_BUG_NEST, FoodBugNestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUG_NEST_FLIES = register("bug_nest_flies", AlterniaModBlocks.BUG_NEST_FLIES, BugNestFliesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUG_NEST_BEETLES = register("bug_nest_beetles", AlterniaModBlocks.BUG_NEST_BEETLES, BugNestBeetlesBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> BUG_NEST_GRASSHOPPERS = register("bug_nest_grasshoppers", AlterniaModBlocks.BUG_NEST_GRASSHOPPERS, BugNestGrasshoppersBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
