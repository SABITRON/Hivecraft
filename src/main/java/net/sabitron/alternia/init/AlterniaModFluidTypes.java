
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.fluid.types.SoporSlimeFluidType;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class AlterniaModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, AlterniaMod.MODID);
	public static final RegistryObject<FluidType> SOPOR_SLIME_TYPE = REGISTRY.register("sopor_slime", () -> new SoporSlimeFluidType());
}
