
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class AlterniaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AlterniaMod.MODID);
	public static final RegistryObject<SoundEvent> MUS_ALTERNIA_1 = REGISTRY.register("mus.alternia_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("alternia", "mus.alternia_1")));
	public static final RegistryObject<SoundEvent> MUS_GRIEFED_RESPITEBLOCK = REGISTRY.register("mus.griefed_respiteblock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("alternia", "mus.griefed_respiteblock")));
	public static final RegistryObject<SoundEvent> MUS_ALTERNIA_OCEAN = REGISTRY.register("mus.alternia_ocean", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("alternia", "mus.alternia_ocean")));
}
