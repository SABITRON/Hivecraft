
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.entity.ZombieTrollEntity;
import net.sabitron.alternia.entity.LususSpiderEntity;
import net.sabitron.alternia.entity.LususRamEntity;
import net.sabitron.alternia.entity.LususCrabEntity;
import net.sabitron.alternia.entity.LususCatEntity;
import net.sabitron.alternia.entity.GrubEntity;
import net.sabitron.alternia.entity.FairyBullEntity;
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
	public static final RegistryObject<EntityType<LususCrabEntity>> LUSUS_CRAB = register("lusus_crab",
			EntityType.Builder.<LususCrabEntity>of(LususCrabEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LususCrabEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<LususRamEntity>> LUSUS_RAM = register("lusus_ram",
			EntityType.Builder.<LususRamEntity>of(LususRamEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LususRamEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FairyBullEntity>> FAIRY_BULL = register("fairy_bull",
			EntityType.Builder.<FairyBullEntity>of(FairyBullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FairyBullEntity::new)

					.sized(0.6f, 0.9f));
	public static final RegistryObject<EntityType<LususCatEntity>> LUSUS_CAT = register("lusus_cat",
			EntityType.Builder.<LususCatEntity>of(LususCatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LususCatEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<LususSpiderEntity>> LUSUS_SPIDER = register("lusus_spider",
			EntityType.Builder.<LususSpiderEntity>of(LususSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LususSpiderEntity::new)

					.sized(1.4f, 0.9f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GrubEntity.init();
			ZombieTrollEntity.init();
			LususCrabEntity.init();
			LususRamEntity.init();
			FairyBullEntity.init();
			LususCatEntity.init();
			LususSpiderEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GRUB.get(), GrubEntity.createAttributes().build());
		event.put(ZOMBIE_TROLL.get(), ZombieTrollEntity.createAttributes().build());
		event.put(LUSUS_CRAB.get(), LususCrabEntity.createAttributes().build());
		event.put(LUSUS_RAM.get(), LususRamEntity.createAttributes().build());
		event.put(FAIRY_BULL.get(), FairyBullEntity.createAttributes().build());
		event.put(LUSUS_CAT.get(), LususCatEntity.createAttributes().build());
		event.put(LUSUS_SPIDER.get(), LususSpiderEntity.createAttributes().build());
	}
}
