
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.entity.ZombieTrollEntity;
import net.sabitron.alternia.entity.SpiderLususEntity;
import net.sabitron.alternia.entity.RamLususEntity;
import net.sabitron.alternia.entity.GrubEntity;
import net.sabitron.alternia.entity.FairyBullEntity;
import net.sabitron.alternia.entity.CrabLususEntity;
import net.sabitron.alternia.entity.CatLususEntity;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlterniaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AlterniaMod.MODID);
	public static final RegistryObject<EntityType<GrubEntity>> GRUB = register("grub",
			EntityType.Builder.<GrubEntity>of(GrubEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrubEntity::new)

					.sized(0.5f, 0.3f));
	public static final RegistryObject<EntityType<ZombieTrollEntity>> ZOMBIE_TROLL = register("zombie_troll",
			EntityType.Builder.<ZombieTrollEntity>of(ZombieTrollEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ZombieTrollEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CatLususEntity>> CAT_LUSUS = register("cat_lusus",
			EntityType.Builder.<CatLususEntity>of(CatLususEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CatLususEntity::new)

					.sized(0.7f, 0.7f));
	public static final RegistryObject<EntityType<SpiderLususEntity>> SPIDER_LUSUS = register("spider_lusus",
			EntityType.Builder.<SpiderLususEntity>of(SpiderLususEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderLususEntity::new)

					.sized(1.4f, 0.9f));
	public static final RegistryObject<EntityType<FairyBullEntity>> FAIRY_BULL = register("fairy_bull",
			EntityType.Builder.<FairyBullEntity>of(FairyBullEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(FairyBullEntity::new)

					.sized(0.8f, 0.9f));
	public static final RegistryObject<EntityType<CrabLususEntity>> CRAB_LUSUS = register("crab_lusus",
			EntityType.Builder.<CrabLususEntity>of(CrabLususEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrabLususEntity::new)

					.sized(1.7f, 2.9f));
	public static final RegistryObject<EntityType<RamLususEntity>> RAM_LUSUS = register("ram_lusus",
			EntityType.Builder.<RamLususEntity>of(RamLususEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RamLususEntity::new)

					.sized(0.8f, 0.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GrubEntity.init();
			ZombieTrollEntity.init();
			CatLususEntity.init();
			SpiderLususEntity.init();
			FairyBullEntity.init();
			CrabLususEntity.init();
			RamLususEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GRUB.get(), GrubEntity.createAttributes().build());
		event.put(ZOMBIE_TROLL.get(), ZombieTrollEntity.createAttributes().build());
		event.put(CAT_LUSUS.get(), CatLususEntity.createAttributes().build());
		event.put(SPIDER_LUSUS.get(), SpiderLususEntity.createAttributes().build());
		event.put(FAIRY_BULL.get(), FairyBullEntity.createAttributes().build());
		event.put(CRAB_LUSUS.get(), CrabLususEntity.createAttributes().build());
		event.put(RAM_LUSUS.get(), RamLususEntity.createAttributes().build());
	}
}
