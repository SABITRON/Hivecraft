
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.potion.DamagedVisionMobEffect;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class AlterniaModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, AlterniaMod.MODID);
	public static final RegistryObject<MobEffect> DAMAGED_VISION = REGISTRY.register("damaged_vision", () -> new DamagedVisionMobEffect());
}
