
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.item.VioletHemodyeItem;
import net.sabitron.alternia.item.TrollHornItem;
import net.sabitron.alternia.item.TealHemodyeItem;
import net.sabitron.alternia.item.SulfurItem;
import net.sabitron.alternia.item.SoporSlimeItem;
import net.sabitron.alternia.item.ShattergrainItem;
import net.sabitron.alternia.item.ShatterflourItem;
import net.sabitron.alternia.item.SaltItem;
import net.sabitron.alternia.item.RustHemodyeItem;
import net.sabitron.alternia.item.RottenTrollFleshItem;
import net.sabitron.alternia.item.RawGrubMeatItem;
import net.sabitron.alternia.item.RawCobaltItem;
import net.sabitron.alternia.item.PurpleHemodyeItem;
import net.sabitron.alternia.item.PoseidonsEntenteItem;
import net.sabitron.alternia.item.PiePlateItem;
import net.sabitron.alternia.item.PaperConeItem;
import net.sabitron.alternia.item.OliveHemodyeItem;
import net.sabitron.alternia.item.ModIconItem;
import net.sabitron.alternia.item.MatriorbItem;
import net.sabitron.alternia.item.LususMeatItem;
import net.sabitron.alternia.item.LususHideItem;
import net.sabitron.alternia.item.LiveGrubItem;
import net.sabitron.alternia.item.LimeHemodyeItem;
import net.sabitron.alternia.item.JadeHemodyeItem;
import net.sabitron.alternia.item.InsectFoodItem;
import net.sabitron.alternia.item.IndigoHemodyeItem;
import net.sabitron.alternia.item.HemospectrumTabIconItem;
import net.sabitron.alternia.item.GoldHemodyeItem;
import net.sabitron.alternia.item.GlassyShattergrainItem;
import net.sabitron.alternia.item.FuchsiaHemodyeItem;
import net.sabitron.alternia.item.EyeDropsItem;
import net.sabitron.alternia.item.DarkstoneDustItem;
import net.sabitron.alternia.item.CullingForkItem;
import net.sabitron.alternia.item.CrushedRawCobaltItem;
import net.sabitron.alternia.item.CookedGrubMeatItem;
import net.sabitron.alternia.item.CookedGrubItem;
import net.sabitron.alternia.item.CobaltSwordItem;
import net.sabitron.alternia.item.CobaltShovelItem;
import net.sabitron.alternia.item.CobaltSheetItem;
import net.sabitron.alternia.item.CobaltPickaxeItem;
import net.sabitron.alternia.item.CobaltNuggetItem;
import net.sabitron.alternia.item.CobaltIngotItem;
import net.sabitron.alternia.item.CobaltHoeItem;
import net.sabitron.alternia.item.CobaltHemodyeItem;
import net.sabitron.alternia.item.CobaltDustItem;
import net.sabitron.alternia.item.CobaltAxeItem;
import net.sabitron.alternia.item.CobaltArmorItem;
import net.sabitron.alternia.item.BugJarItem;
import net.sabitron.alternia.item.BronzeHemodyeItem;
import net.sabitron.alternia.item.BeetleItem;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

public class AlterniaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlterniaMod.MODID);
	public static final RegistryObject<Item> ALTERNIAN_GRASS_BLOCK = block(AlterniaModBlocks.ALTERNIAN_GRASS_BLOCK);
	public static final RegistryObject<Item> ALTERNIAN_SOIL = block(AlterniaModBlocks.ALTERNIAN_SOIL);
	public static final RegistryObject<Item> ALTERNIAN_FARMLAND = block(AlterniaModBlocks.ALTERNIAN_FARMLAND);
	public static final RegistryObject<Item> DARKSTONE = block(AlterniaModBlocks.DARKSTONE);
	public static final RegistryObject<Item> DARKSTONE_BOULDER = block(AlterniaModBlocks.DARKSTONE_BOULDER);
	public static final RegistryObject<Item> DARKSTONE_BOULDER_SMALL = block(AlterniaModBlocks.DARKSTONE_BOULDER_SMALL);
	public static final RegistryObject<Item> DARKSTONE_STAIRS = block(AlterniaModBlocks.DARKSTONE_STAIRS);
	public static final RegistryObject<Item> DARKSTONE_SLAB = block(AlterniaModBlocks.DARKSTONE_SLAB);
	public static final RegistryObject<Item> DARKSTONE_WALL = block(AlterniaModBlocks.DARKSTONE_WALL);
	public static final RegistryObject<Item> DARKSTONE_COAL_ORE = block(AlterniaModBlocks.DARKSTONE_COAL_ORE);
	public static final RegistryObject<Item> DARKSTONE_IRON_ORE = block(AlterniaModBlocks.DARKSTONE_IRON_ORE);
	public static final RegistryObject<Item> DARKSTONE_GOLD_ORE = block(AlterniaModBlocks.DARKSTONE_GOLD_ORE);
	public static final RegistryObject<Item> DARKSTONE_DIAMOND_ORE = block(AlterniaModBlocks.DARKSTONE_DIAMOND_ORE);
	public static final RegistryObject<Item> DARKSTONE_REDSTONE_ORE = block(AlterniaModBlocks.DARKSTONE_REDSTONE_ORE);
	public static final RegistryObject<Item> DARKSTONE_QUARTZ_ORE = block(AlterniaModBlocks.DARKSTONE_QUARTZ_ORE);
	public static final RegistryObject<Item> DARKSTONE_COPPER_ORE = block(AlterniaModBlocks.DARKSTONE_COPPER_ORE);
	public static final RegistryObject<Item> DARKSTONE_LAPIS_ORE = block(AlterniaModBlocks.DARKSTONE_LAPIS_ORE);
	public static final RegistryObject<Item> DARKSTONE_EMERALD_ORE = block(AlterniaModBlocks.DARKSTONE_EMERALD_ORE);
	public static final RegistryObject<Item> DARKSTONE_CRUXITE_ORE = block(AlterniaModBlocks.DARKSTONE_CRUXITE_ORE);
	public static final RegistryObject<Item> DARKSTONE_URANIUM_ORE = block(AlterniaModBlocks.DARKSTONE_URANIUM_ORE);
	public static final RegistryObject<Item> DARKSTONE_SALT_ORE = block(AlterniaModBlocks.DARKSTONE_SALT_ORE);
	public static final RegistryObject<Item> DARKSTONE_COBALT_ORE = block(AlterniaModBlocks.DARKSTONE_COBALT_ORE);
	public static final RegistryObject<Item> DARKSTONE_SULFUR_ORE = block(AlterniaModBlocks.DARKSTONE_SULFUR_ORE);
	public static final RegistryObject<Item> DARKSTONE_ZINC_ORE = block(AlterniaModBlocks.DARKSTONE_ZINC_ORE);
	public static final RegistryObject<Item> MONAZITE = block(AlterniaModBlocks.MONAZITE);
	public static final RegistryObject<Item> MONAZITE_BOULDER = block(AlterniaModBlocks.MONAZITE_BOULDER);
	public static final RegistryObject<Item> MONAZITE_BOULDER_SMALL = block(AlterniaModBlocks.MONAZITE_BOULDER_SMALL);
	public static final RegistryObject<Item> POLISHED_MONAZITE = block(AlterniaModBlocks.POLISHED_MONAZITE);
	public static final RegistryObject<Item> DARKSAND = block(AlterniaModBlocks.DARKSAND);
	public static final RegistryObject<Item> DARKSANDSTONE = block(AlterniaModBlocks.DARKSANDSTONE);
	public static final RegistryObject<Item> IRIDESCENT_SAND = block(AlterniaModBlocks.IRIDESCENT_SAND);
	public static final RegistryObject<Item> IRIDESCENT_SANDSTONE = block(AlterniaModBlocks.IRIDESCENT_SANDSTONE);
	public static final RegistryObject<Item> ORACLE_LOG = block(AlterniaModBlocks.ORACLE_LOG);
	public static final RegistryObject<Item> STRIPPED_ORACLE_LOG = block(AlterniaModBlocks.STRIPPED_ORACLE_LOG);
	public static final RegistryObject<Item> ORACLE_WOOD = block(AlterniaModBlocks.ORACLE_WOOD);
	public static final RegistryObject<Item> STRIPPED_ORACLE_WOOD = block(AlterniaModBlocks.STRIPPED_ORACLE_WOOD);
	public static final RegistryObject<Item> ORACLE_PLANKS = block(AlterniaModBlocks.ORACLE_PLANKS);
	public static final RegistryObject<Item> ORACLE_LEAVES = block(AlterniaModBlocks.ORACLE_LEAVES);
	public static final RegistryObject<Item> ORACLE_STAIRS = block(AlterniaModBlocks.ORACLE_STAIRS);
	public static final RegistryObject<Item> ORACLE_SLAB = block(AlterniaModBlocks.ORACLE_SLAB);
	public static final RegistryObject<Item> ORACLE_FENCE = block(AlterniaModBlocks.ORACLE_FENCE);
	public static final RegistryObject<Item> ORACLE_FENCE_GATE = block(AlterniaModBlocks.ORACLE_FENCE_GATE);
	public static final RegistryObject<Item> ORACLE_PRESSURE_PLATE = block(AlterniaModBlocks.ORACLE_PRESSURE_PLATE);
	public static final RegistryObject<Item> ORACLE_BUTTON = block(AlterniaModBlocks.ORACLE_BUTTON);
	public static final RegistryObject<Item> BRAMBLE_LOG = block(AlterniaModBlocks.BRAMBLE_LOG);
	public static final RegistryObject<Item> STRIPPED_BRAMBLE_LOG = block(AlterniaModBlocks.STRIPPED_BRAMBLE_LOG);
	public static final RegistryObject<Item> BRAMBLE_WOOD = block(AlterniaModBlocks.BRAMBLE_WOOD);
	public static final RegistryObject<Item> STRIPPED_BRAMBLE_WOOD = block(AlterniaModBlocks.STRIPPED_BRAMBLE_WOOD);
	public static final RegistryObject<Item> BRAMBLE_PLANKS = block(AlterniaModBlocks.BRAMBLE_PLANKS);
	public static final RegistryObject<Item> BRAMBLE_LEAVES = block(AlterniaModBlocks.BRAMBLE_LEAVES);
	public static final RegistryObject<Item> BRAMBLE_STAIRS = block(AlterniaModBlocks.BRAMBLE_STAIRS);
	public static final RegistryObject<Item> BRAMBLE_SLAB = block(AlterniaModBlocks.BRAMBLE_SLAB);
	public static final RegistryObject<Item> BRAMBLE_FENCE = block(AlterniaModBlocks.BRAMBLE_FENCE);
	public static final RegistryObject<Item> BRAMBLE_FENCE_GATE = block(AlterniaModBlocks.BRAMBLE_FENCE_GATE);
	public static final RegistryObject<Item> BRAMBLE_PRESSURE_PLATE = block(AlterniaModBlocks.BRAMBLE_PRESSURE_PLATE);
	public static final RegistryObject<Item> BRAMBLE_BUTTON = block(AlterniaModBlocks.BRAMBLE_BUTTON);
	public static final RegistryObject<Item> COBBLED_DARKSTONE = block(AlterniaModBlocks.COBBLED_DARKSTONE);
	public static final RegistryObject<Item> COBBLED_DARKSTONE_STAIRS = block(AlterniaModBlocks.COBBLED_DARKSTONE_STAIRS);
	public static final RegistryObject<Item> COBBLED_DARKSTONE_SLAB = block(AlterniaModBlocks.COBBLED_DARKSTONE_SLAB);
	public static final RegistryObject<Item> COBBLED_DARKSTONE_WALL = block(AlterniaModBlocks.COBBLED_DARKSTONE_WALL);
	public static final RegistryObject<Item> SMOOTH_DARKSTONE = block(AlterniaModBlocks.SMOOTH_DARKSTONE);
	public static final RegistryObject<Item> SMOOTH_DARKSTONE_STAIRS = block(AlterniaModBlocks.SMOOTH_DARKSTONE_STAIRS);
	public static final RegistryObject<Item> SMOOTH_DARKSTONE_SLAB = block(AlterniaModBlocks.SMOOTH_DARKSTONE_SLAB);
	public static final RegistryObject<Item> SMOOTH_DARKSTONE_WALL = block(AlterniaModBlocks.SMOOTH_DARKSTONE_WALL);
	public static final RegistryObject<Item> DARKSTONE_BRICKS = block(AlterniaModBlocks.DARKSTONE_BRICKS);
	public static final RegistryObject<Item> DARKSTONE_BRICK_STAIRS = block(AlterniaModBlocks.DARKSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> DARKSTONE_BRICK_SLAB = block(AlterniaModBlocks.DARKSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> DARKSTONE_BRICK_WALL = block(AlterniaModBlocks.DARKSTONE_BRICK_WALL);
	public static final RegistryObject<Item> CRACKED_DARKSTONE_BRICKS = block(AlterniaModBlocks.CRACKED_DARKSTONE_BRICKS);
	public static final RegistryObject<Item> CRACKED_DARKSTONE_BRICK_STAIRS = block(AlterniaModBlocks.CRACKED_DARKSTONE_BRICK_STAIRS);
	public static final RegistryObject<Item> CRACKED_DARKSTONE_BRICK_SLAB = block(AlterniaModBlocks.CRACKED_DARKSTONE_BRICK_SLAB);
	public static final RegistryObject<Item> CRACKED_DARKSTONE_BRICK_WALL = block(AlterniaModBlocks.CRACKED_DARKSTONE_BRICK_WALL);
	public static final RegistryObject<Item> DARKSTONE_TILES = block(AlterniaModBlocks.DARKSTONE_TILES);
	public static final RegistryObject<Item> DARKSTONE_TILES_STAIRS = block(AlterniaModBlocks.DARKSTONE_TILES_STAIRS);
	public static final RegistryObject<Item> DARKSTONE_TILES_SLAB = block(AlterniaModBlocks.DARKSTONE_TILES_SLAB);
	public static final RegistryObject<Item> DARKSTONE_TILES_WALL = block(AlterniaModBlocks.DARKSTONE_TILES_WALL);
	public static final RegistryObject<Item> PACKED_DARKSTONE = block(AlterniaModBlocks.PACKED_DARKSTONE);
	public static final RegistryObject<Item> PACKED_DARKSTONE_STAIRS = block(AlterniaModBlocks.PACKED_DARKSTONE_STAIRS);
	public static final RegistryObject<Item> PACKED_DARKSTONE_SLAB = block(AlterniaModBlocks.PACKED_DARKSTONE_SLAB);
	public static final RegistryObject<Item> PACKED_DARKSTONE_WALL = block(AlterniaModBlocks.PACKED_DARKSTONE_WALL);
	public static final RegistryObject<Item> DARKSTONE_SHINGLES = block(AlterniaModBlocks.DARKSTONE_SHINGLES);
	public static final RegistryObject<Item> DARKSTONE_SHINGLES_STAIRS = block(AlterniaModBlocks.DARKSTONE_SHINGLES_STAIRS);
	public static final RegistryObject<Item> DARKSTONE_SHINGLES_SLAB = block(AlterniaModBlocks.DARKSTONE_SHINGLES_SLAB);
	public static final RegistryObject<Item> DARKSTONE_SHINGLES_WALL = block(AlterniaModBlocks.DARKSTONE_SHINGLES_WALL);
	public static final RegistryObject<Item> DARKSTONE_PILLAR = block(AlterniaModBlocks.DARKSTONE_PILLAR);
	public static final RegistryObject<Item> HIVE_DRYWALL = block(AlterniaModBlocks.HIVE_DRYWALL);
	public static final RegistryObject<Item> HIVE_DRYWALL_STAIRS = block(AlterniaModBlocks.HIVE_DRYWALL_STAIRS);
	public static final RegistryObject<Item> HIVE_DRYWALL_SLAB = block(AlterniaModBlocks.HIVE_DRYWALL_SLAB);
	public static final RegistryObject<Item> HIVE_DRYWALL_WALL = block(AlterniaModBlocks.HIVE_DRYWALL_WALL);
	public static final RegistryObject<Item> HIVE_DRYWALL_PANEL = block(AlterniaModBlocks.HIVE_DRYWALL_PANEL);
	public static final RegistryObject<Item> HIVE_DRYWALL_PANEL_SLAB = block(AlterniaModBlocks.HIVE_DRYWALL_PANEL_SLAB);
	public static final RegistryObject<Item> HIVE_DOOR = doubleBlock(AlterniaModBlocks.HIVE_DOOR);
	public static final RegistryObject<Item> HIVE_TRAPDOOR = block(AlterniaModBlocks.HIVE_TRAPDOOR);
	public static final RegistryObject<Item> HIVEGLASS = block(AlterniaModBlocks.HIVEGLASS);
	public static final RegistryObject<Item> HIVEGLASS_PANE = block(AlterniaModBlocks.HIVEGLASS_PANE);
	public static final RegistryObject<Item> LUSUS_WOOL = block(AlterniaModBlocks.LUSUS_WOOL);
	public static final RegistryObject<Item> LUSUS_WOOL_STAIRS = block(AlterniaModBlocks.LUSUS_WOOL_STAIRS);
	public static final RegistryObject<Item> LUSUS_WOOL_SLAB = block(AlterniaModBlocks.LUSUS_WOOL_SLAB);
	public static final RegistryObject<Item> ALTERNIA_TPZ = block(AlterniaModBlocks.ALTERNIA_TPZ);
	public static final RegistryObject<Item> SOPOR_SLIME_BUCKET = REGISTRY.register("sopor_slime_bucket", () -> new SoporSlimeItem());
	public static final RegistryObject<Item> DARKSTONE_DUST = REGISTRY.register("darkstone_dust", () -> new DarkstoneDustItem());
	public static final RegistryObject<Item> GRUB_NEST = block(AlterniaModBlocks.GRUB_NEST);
	public static final RegistryObject<Item> EMPTY_BUG_NEST = block(AlterniaModBlocks.EMPTY_BUG_NEST);
	public static final RegistryObject<Item> ROTTEN_TROLL_FLESH = REGISTRY.register("rotten_troll_flesh", () -> new RottenTrollFleshItem());
	public static final RegistryObject<Item> FLESH_BUG_NEST = block(AlterniaModBlocks.FLESH_BUG_NEST);
	public static final RegistryObject<Item> INSECT_FOOD = REGISTRY.register("insect_food", () -> new InsectFoodItem());
	public static final RegistryObject<Item> FOOD_BUG_NEST = block(AlterniaModBlocks.FOOD_BUG_NEST);
	public static final RegistryObject<Item> SALT = REGISTRY.register("salt", () -> new SaltItem());
	public static final RegistryObject<Item> SULFUR = REGISTRY.register("sulfur", () -> new SulfurItem());
	public static final RegistryObject<Item> RAW_COBALT = REGISTRY.register("raw_cobalt", () -> new RawCobaltItem());
	public static final RegistryObject<Item> RAW_COBALT_BLOCK = block(AlterniaModBlocks.RAW_COBALT_BLOCK);
	public static final RegistryObject<Item> COBALT_INGOT = REGISTRY.register("cobalt_ingot", () -> new CobaltIngotItem());
	public static final RegistryObject<Item> COBALT_BLOCK = block(AlterniaModBlocks.COBALT_BLOCK);
	public static final RegistryObject<Item> COBALT_NUGGET = REGISTRY.register("cobalt_nugget", () -> new CobaltNuggetItem());
	public static final RegistryObject<Item> COBALT_SHEET = REGISTRY.register("cobalt_sheet", () -> new CobaltSheetItem());
	public static final RegistryObject<Item> CRUSHED_RAW_COBALT = REGISTRY.register("crushed_raw_cobalt", () -> new CrushedRawCobaltItem());
	public static final RegistryObject<Item> COBALT_DUST = REGISTRY.register("cobalt_dust", () -> new CobaltDustItem());
	public static final RegistryObject<Item> COBALT_SWORD = REGISTRY.register("cobalt_sword", () -> new CobaltSwordItem());
	public static final RegistryObject<Item> COBALT_PICKAXE = REGISTRY.register("cobalt_pickaxe", () -> new CobaltPickaxeItem());
	public static final RegistryObject<Item> COBALT_AXE = REGISTRY.register("cobalt_axe", () -> new CobaltAxeItem());
	public static final RegistryObject<Item> COBALT_SHOVEL = REGISTRY.register("cobalt_shovel", () -> new CobaltShovelItem());
	public static final RegistryObject<Item> COBALT_HOE = REGISTRY.register("cobalt_hoe", () -> new CobaltHoeItem());
	public static final RegistryObject<Item> COBALT_ARMOR_HELMET = REGISTRY.register("cobalt_armor_helmet", () -> new CobaltArmorItem.Helmet());
	public static final RegistryObject<Item> COBALT_ARMOR_CHESTPLATE = REGISTRY.register("cobalt_armor_chestplate", () -> new CobaltArmorItem.Chestplate());
	public static final RegistryObject<Item> COBALT_ARMOR_LEGGINGS = REGISTRY.register("cobalt_armor_leggings", () -> new CobaltArmorItem.Leggings());
	public static final RegistryObject<Item> COBALT_ARMOR_BOOTS = REGISTRY.register("cobalt_armor_boots", () -> new CobaltArmorItem.Boots());
	public static final RegistryObject<Item> CULLING_FORK = REGISTRY.register("culling_fork", () -> new CullingForkItem());
	public static final RegistryObject<Item> POSEIDONS_ENTENTE = REGISTRY.register("poseidons_entente", () -> new PoseidonsEntenteItem());
	public static final RegistryObject<Item> SHATTERGRAIN_SEEDS = block(AlterniaModBlocks.SHATTERGRAIN_SEEDS);
	public static final RegistryObject<Item> SHATTERGRAIN = REGISTRY.register("shattergrain", () -> new ShattergrainItem());
	public static final RegistryObject<Item> GLASSY_SHATTERGRAIN = REGISTRY.register("glassy_shattergrain", () -> new GlassyShattergrainItem());
	public static final RegistryObject<Item> SHATTERFLOUR = REGISTRY.register("shatterflour", () -> new ShatterflourItem());
	public static final RegistryObject<Item> EYE_DROPS = REGISTRY.register("eye_drops", () -> new EyeDropsItem());
	public static final RegistryObject<Item> TROLL_HORN = REGISTRY.register("troll_horn", () -> new TrollHornItem());
	public static final RegistryObject<Item> MATRIORB = REGISTRY.register("matriorb", () -> new MatriorbItem());
	public static final RegistryObject<Item> PAPER_CONE = REGISTRY.register("paper_cone", () -> new PaperConeItem());
	public static final RegistryObject<Item> PIE_PLATE = REGISTRY.register("pie_plate", () -> new PiePlateItem());
	public static final RegistryObject<Item> BUG_JAR = REGISTRY.register("bug_jar", () -> new BugJarItem());
	public static final RegistryObject<Item> BEETLE = REGISTRY.register("beetle", () -> new BeetleItem());
	public static final RegistryObject<Item> RAW_GRUB_MEAT = REGISTRY.register("raw_grub_meat", () -> new RawGrubMeatItem());
	public static final RegistryObject<Item> COOKED_GRUB_MEAT = REGISTRY.register("cooked_grub_meat", () -> new CookedGrubMeatItem());
	public static final RegistryObject<Item> LIVE_GRUB = REGISTRY.register("live_grub", () -> new LiveGrubItem());
	public static final RegistryObject<Item> COOKED_GRUB = REGISTRY.register("cooked_grub", () -> new CookedGrubItem());
	public static final RegistryObject<Item> LUSUS_MEAT = REGISTRY.register("lusus_meat", () -> new LususMeatItem());
	public static final RegistryObject<Item> LUSUS_HIDE = REGISTRY.register("lusus_hide", () -> new LususHideItem());
	public static final RegistryObject<Item> GRUB_SPAWN_EGG = REGISTRY.register("grub_spawn_egg", () -> new ForgeSpawnEggItem(AlterniaModEntities.GRUB, -6447219, -11314100, new Item.Properties()));
	public static final RegistryObject<Item> ZOMBIE_TROLL_SPAWN_EGG = REGISTRY.register("zombie_troll_spawn_egg", () -> new ForgeSpawnEggItem(AlterniaModEntities.ZOMBIE_TROLL, -4934476, -627940, new Item.Properties()));
	public static final RegistryObject<Item> CAT_LUSUS_SPAWN_EGG = REGISTRY.register("cat_lusus_spawn_egg", () -> new ForgeSpawnEggItem(AlterniaModEntities.CAT_LUSUS, -1, -13408768, new Item.Properties()));
	public static final RegistryObject<Item> SPIDER_LUSUS_SPAWN_EGG = REGISTRY.register("spider_lusus_spawn_egg", () -> new ForgeSpawnEggItem(AlterniaModEntities.SPIDER_LUSUS, -1, -16764058, new Item.Properties()));
	public static final RegistryObject<Item> RUST_HEMO_FLOWER = block(AlterniaModBlocks.RUST_HEMO_FLOWER);
	public static final RegistryObject<Item> RUST_HEMODYE = REGISTRY.register("rust_hemodye", () -> new RustHemodyeItem());
	public static final RegistryObject<Item> RUST_HEMOGLASS = block(AlterniaModBlocks.RUST_HEMOGLASS);
	public static final RegistryObject<Item> RUST_HEMOGLASS_PANE = block(AlterniaModBlocks.RUST_HEMOGLASS_PANE);
	public static final RegistryObject<Item> RUST_HEMO_WOOL = block(AlterniaModBlocks.RUST_HEMO_WOOL);
	public static final RegistryObject<Item> RUST_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.RUST_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> RUST_HEMO_WOOL_SLAB = block(AlterniaModBlocks.RUST_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> RUST_MEAT_BLOCK = block(AlterniaModBlocks.RUST_MEAT_BLOCK);
	public static final RegistryObject<Item> RUST_RECUPERACOON_CORE = block(AlterniaModBlocks.RUST_RECUPERACOON_CORE);
	public static final RegistryObject<Item> BRONZE_HEMO_FLOWER = block(AlterniaModBlocks.BRONZE_HEMO_FLOWER);
	public static final RegistryObject<Item> BRONZE_HEMODYE = REGISTRY.register("bronze_hemodye", () -> new BronzeHemodyeItem());
	public static final RegistryObject<Item> BRONZE_HEMOGLASS = block(AlterniaModBlocks.BRONZE_HEMOGLASS);
	public static final RegistryObject<Item> BRONZE_HEMOGLASS_PANE = block(AlterniaModBlocks.BRONZE_HEMOGLASS_PANE);
	public static final RegistryObject<Item> BRONZE_HEMO_WOOL = block(AlterniaModBlocks.BRONZE_HEMO_WOOL);
	public static final RegistryObject<Item> BRONZE_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.BRONZE_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> BRONZE_HEMO_WOOL_SLAB = block(AlterniaModBlocks.BRONZE_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> BRONZE_MEAT_BLOCK = block(AlterniaModBlocks.BRONZE_MEAT_BLOCK);
	public static final RegistryObject<Item> BRONZE_RECUPERACOON_CORE = block(AlterniaModBlocks.BRONZE_RECUPERACOON_CORE);
	public static final RegistryObject<Item> GOLD_HEMO_FLOWER = block(AlterniaModBlocks.GOLD_HEMO_FLOWER);
	public static final RegistryObject<Item> GOLD_HEMODYE = REGISTRY.register("gold_hemodye", () -> new GoldHemodyeItem());
	public static final RegistryObject<Item> GOLD_HEMOGLASS = block(AlterniaModBlocks.GOLD_HEMOGLASS);
	public static final RegistryObject<Item> GOLD_HEMOGLASS_PANE = block(AlterniaModBlocks.GOLD_HEMOGLASS_PANE);
	public static final RegistryObject<Item> GOLD_HEMO_WOOL = block(AlterniaModBlocks.GOLD_HEMO_WOOL);
	public static final RegistryObject<Item> GOLD_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.GOLD_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> GOLD_HEMO_WOOL_SLAB = block(AlterniaModBlocks.GOLD_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> GOLD_MEAT_BLOCK = block(AlterniaModBlocks.GOLD_MEAT_BLOCK);
	public static final RegistryObject<Item> GOLD_RECUPERACOON_CORE = block(AlterniaModBlocks.GOLD_RECUPERACOON_CORE);
	public static final RegistryObject<Item> LIME_HEMOFLOWER = block(AlterniaModBlocks.LIME_HEMOFLOWER);
	public static final RegistryObject<Item> LIME_HEMODYE = REGISTRY.register("lime_hemodye", () -> new LimeHemodyeItem());
	public static final RegistryObject<Item> LIME_HEMOGLASS = block(AlterniaModBlocks.LIME_HEMOGLASS);
	public static final RegistryObject<Item> LIME_HEMOGLASS_PANE = block(AlterniaModBlocks.LIME_HEMOGLASS_PANE);
	public static final RegistryObject<Item> LIME_HEMO_WOOL = block(AlterniaModBlocks.LIME_HEMO_WOOL);
	public static final RegistryObject<Item> LIME_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.LIME_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> LIME_HEMO_WOOL_SLAB = block(AlterniaModBlocks.LIME_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> LIME_MEAT_BLOCK = block(AlterniaModBlocks.LIME_MEAT_BLOCK);
	public static final RegistryObject<Item> LIME_RECUPERACOON_CORE = block(AlterniaModBlocks.LIME_RECUPERACOON_CORE);
	public static final RegistryObject<Item> OLIVE_HEMO_FLOWER = block(AlterniaModBlocks.OLIVE_HEMO_FLOWER);
	public static final RegistryObject<Item> OLIVE_HEMODYE = REGISTRY.register("olive_hemodye", () -> new OliveHemodyeItem());
	public static final RegistryObject<Item> OLIVE_HEMOGLASS = block(AlterniaModBlocks.OLIVE_HEMOGLASS);
	public static final RegistryObject<Item> OLIVE_HEMOGLASS_PANE = block(AlterniaModBlocks.OLIVE_HEMOGLASS_PANE);
	public static final RegistryObject<Item> OLIVE_HEMO_WOOL = block(AlterniaModBlocks.OLIVE_HEMO_WOOL);
	public static final RegistryObject<Item> OLIVE_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.OLIVE_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> OLIVE_HEMO_WOOL_SLAB = block(AlterniaModBlocks.OLIVE_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> OLIVE_MEAT_BLOCK = block(AlterniaModBlocks.OLIVE_MEAT_BLOCK);
	public static final RegistryObject<Item> OLIVE_RECUPERACOON_CORE = block(AlterniaModBlocks.OLIVE_RECUPERACOON_CORE);
	public static final RegistryObject<Item> JADE_HEMO_FLOWER = block(AlterniaModBlocks.JADE_HEMO_FLOWER);
	public static final RegistryObject<Item> JADE_HEMODYE = REGISTRY.register("jade_hemodye", () -> new JadeHemodyeItem());
	public static final RegistryObject<Item> JADE_HEMOGLASS = block(AlterniaModBlocks.JADE_HEMOGLASS);
	public static final RegistryObject<Item> JADE_HEMOGLASS_PANE = block(AlterniaModBlocks.JADE_HEMOGLASS_PANE);
	public static final RegistryObject<Item> JADE_HEMO_WOOL = block(AlterniaModBlocks.JADE_HEMO_WOOL);
	public static final RegistryObject<Item> JADE_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.JADE_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> JADE_HEMO_WOOL_SLAB = block(AlterniaModBlocks.JADE_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> JADE_MEAT_BLOCK = block(AlterniaModBlocks.JADE_MEAT_BLOCK);
	public static final RegistryObject<Item> JADE_RECUPERACOON_CORE = block(AlterniaModBlocks.JADE_RECUPERACOON_CORE);
	public static final RegistryObject<Item> TEAL_HEMO_FLOWER = block(AlterniaModBlocks.TEAL_HEMO_FLOWER);
	public static final RegistryObject<Item> TEAL_HEMODYE = REGISTRY.register("teal_hemodye", () -> new TealHemodyeItem());
	public static final RegistryObject<Item> TEAL_HEMOGLASS = block(AlterniaModBlocks.TEAL_HEMOGLASS);
	public static final RegistryObject<Item> TEAL_HEMOGLASS_PANE = block(AlterniaModBlocks.TEAL_HEMOGLASS_PANE);
	public static final RegistryObject<Item> TEAL_HEMO_WOOL = block(AlterniaModBlocks.TEAL_HEMO_WOOL);
	public static final RegistryObject<Item> TEAL_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.TEAL_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> TEAL_HEMO_WOOL_SLAB = block(AlterniaModBlocks.TEAL_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> TEAL_MEAT_BLOCK = block(AlterniaModBlocks.TEAL_MEAT_BLOCK);
	public static final RegistryObject<Item> TEAL_RECUPERACOON_CORE = block(AlterniaModBlocks.TEAL_RECUPERACOON_CORE);
	public static final RegistryObject<Item> COBALT_HEMO_FLOWER = block(AlterniaModBlocks.COBALT_HEMO_FLOWER);
	public static final RegistryObject<Item> COBALT_HEMODYE = REGISTRY.register("cobalt_hemodye", () -> new CobaltHemodyeItem());
	public static final RegistryObject<Item> COBALT_HEMOGLASS = block(AlterniaModBlocks.COBALT_HEMOGLASS);
	public static final RegistryObject<Item> COBALT_HEMOGLASS_PANE = block(AlterniaModBlocks.COBALT_HEMOGLASS_PANE);
	public static final RegistryObject<Item> COBALT_HEMO_WOOL = block(AlterniaModBlocks.COBALT_HEMO_WOOL);
	public static final RegistryObject<Item> COBALT_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.COBALT_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> COBALT_HEMO_WOOL_SLAB = block(AlterniaModBlocks.COBALT_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> COBALT_MEAT_BLOCK = block(AlterniaModBlocks.COBALT_MEAT_BLOCK);
	public static final RegistryObject<Item> COBALT_RECUPERACOON_CORE = block(AlterniaModBlocks.COBALT_RECUPERACOON_CORE);
	public static final RegistryObject<Item> INDIGO_HEMO_FLOWER = block(AlterniaModBlocks.INDIGO_HEMO_FLOWER);
	public static final RegistryObject<Item> INDIGO_HEMODYE = REGISTRY.register("indigo_hemodye", () -> new IndigoHemodyeItem());
	public static final RegistryObject<Item> INDIGO_HEMOGLASS = block(AlterniaModBlocks.INDIGO_HEMOGLASS);
	public static final RegistryObject<Item> INDIGO_HEMOGLASS_PANE = block(AlterniaModBlocks.INDIGO_HEMOGLASS_PANE);
	public static final RegistryObject<Item> INDIGO_HEMO_WOOL = block(AlterniaModBlocks.INDIGO_HEMO_WOOL);
	public static final RegistryObject<Item> INDIGO_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.INDIGO_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> INDIGO_HEMO_WOOL_SLAB = block(AlterniaModBlocks.INDIGO_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> INDIGO_MEAT_BLOCK = block(AlterniaModBlocks.INDIGO_MEAT_BLOCK);
	public static final RegistryObject<Item> INDIGO_RECUPERACOON_CORE = block(AlterniaModBlocks.INDIGO_RECUPERACOON_CORE);
	public static final RegistryObject<Item> PURPLE_HEMO_FLOWER = block(AlterniaModBlocks.PURPLE_HEMO_FLOWER);
	public static final RegistryObject<Item> PURPLE_HEMODYE = REGISTRY.register("purple_hemodye", () -> new PurpleHemodyeItem());
	public static final RegistryObject<Item> PURPLE_HEMOGLASS = block(AlterniaModBlocks.PURPLE_HEMOGLASS);
	public static final RegistryObject<Item> PURPLE_HEMOGLASS_PANE = block(AlterniaModBlocks.PURPLE_HEMOGLASS_PANE);
	public static final RegistryObject<Item> PURPLE_HEMO_WOOL = block(AlterniaModBlocks.PURPLE_HEMO_WOOL);
	public static final RegistryObject<Item> PURPLE_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.PURPLE_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> PURPLE_HEMO_WOOL_SLAB = block(AlterniaModBlocks.PURPLE_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> PURPLE_MEAT_BLOCK = block(AlterniaModBlocks.PURPLE_MEAT_BLOCK);
	public static final RegistryObject<Item> PURPLE_RECUPERACOON_CORE = block(AlterniaModBlocks.PURPLE_RECUPERACOON_CORE);
	public static final RegistryObject<Item> VIOLET_HEMO_FLOWER = block(AlterniaModBlocks.VIOLET_HEMO_FLOWER);
	public static final RegistryObject<Item> VIOLET_HEMODYE = REGISTRY.register("violet_hemodye", () -> new VioletHemodyeItem());
	public static final RegistryObject<Item> VIOLET_HEMOGLASS = block(AlterniaModBlocks.VIOLET_HEMOGLASS);
	public static final RegistryObject<Item> VIOLET_HEMOGLASS_PANE = block(AlterniaModBlocks.VIOLET_HEMOGLASS_PANE);
	public static final RegistryObject<Item> VIOLET_HEMO_WOOL = block(AlterniaModBlocks.VIOLET_HEMO_WOOL);
	public static final RegistryObject<Item> VIOLET_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.VIOLET_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> VIOLET_HEMO_WOOL_SLAB = block(AlterniaModBlocks.VIOLET_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> VIOLET_MEAT_BLOCK = block(AlterniaModBlocks.VIOLET_MEAT_BLOCK);
	public static final RegistryObject<Item> VIOLET_RECUPERACOON_CORE = block(AlterniaModBlocks.VIOLET_RECUPERACOON_CORE);
	public static final RegistryObject<Item> FUCHSIA_HEMO_FLOWER = block(AlterniaModBlocks.FUCHSIA_HEMO_FLOWER);
	public static final RegistryObject<Item> FUCHSIA_HEMODYE = REGISTRY.register("fuchsia_hemodye", () -> new FuchsiaHemodyeItem());
	public static final RegistryObject<Item> FUCHSIA_HEMOGLASS = block(AlterniaModBlocks.FUCHSIA_HEMOGLASS);
	public static final RegistryObject<Item> FUCHSIA_HEMOGLASS_PANE = block(AlterniaModBlocks.FUCHSIA_HEMOGLASS_PANE);
	public static final RegistryObject<Item> FUCHSIA_HEMO_WOOL = block(AlterniaModBlocks.FUCHSIA_HEMO_WOOL);
	public static final RegistryObject<Item> FUCHSIA_HEMO_WOOL_STAIRS = block(AlterniaModBlocks.FUCHSIA_HEMO_WOOL_STAIRS);
	public static final RegistryObject<Item> FUCHSIA_HEMO_WOOL_SLAB = block(AlterniaModBlocks.FUCHSIA_HEMO_WOOL_SLAB);
	public static final RegistryObject<Item> FUCHSIA_MEAT_BLOCK = block(AlterniaModBlocks.FUCHSIA_MEAT_BLOCK);
	public static final RegistryObject<Item> FUCHSIA_RECUPERACOON_CORE = block(AlterniaModBlocks.FUCHSIA_RECUPERACOON_CORE);
	public static final RegistryObject<Item> MOD_ICON = REGISTRY.register("mod_icon", () -> new ModIconItem());
	public static final RegistryObject<Item> SHATTERGRAIN_STAGE_1 = block(AlterniaModBlocks.SHATTERGRAIN_STAGE_1);
	public static final RegistryObject<Item> SHATTERGRAIN_STAGE_2 = block(AlterniaModBlocks.SHATTERGRAIN_STAGE_2);
	public static final RegistryObject<Item> SHATTERGRAIN_STAGE_3 = block(AlterniaModBlocks.SHATTERGRAIN_STAGE_3);
	public static final RegistryObject<Item> SHATTERGRAIN_STAGE_4 = block(AlterniaModBlocks.SHATTERGRAIN_STAGE_4);
	public static final RegistryObject<Item> BUG_NEST_FLIES = block(AlterniaModBlocks.BUG_NEST_FLIES);
	public static final RegistryObject<Item> BUG_NEST_BEETLES = block(AlterniaModBlocks.BUG_NEST_BEETLES);
	public static final RegistryObject<Item> BUG_NEST_GRASSHOPPERS = block(AlterniaModBlocks.BUG_NEST_GRASSHOPPERS);
	public static final RegistryObject<Item> LIT_DARKSTONE_REDSTONE_ORE = block(AlterniaModBlocks.LIT_DARKSTONE_REDSTONE_ORE);
	public static final RegistryObject<Item> HEMOSPECTRUM_TAB_ICON = REGISTRY.register("hemospectrum_tab_icon", () -> new HemospectrumTabIconItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}