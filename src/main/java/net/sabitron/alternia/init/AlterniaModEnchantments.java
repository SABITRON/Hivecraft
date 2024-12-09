
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.sabitron.alternia.init;

import net.sabitron.alternia.enchantment.CrystalReloadEnchantment;
import net.sabitron.alternia.enchantment.CrystalChargeEnchantment;
import net.sabitron.alternia.AlterniaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class AlterniaModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, AlterniaMod.MODID);
	public static final RegistryObject<Enchantment> CRYSTAL_CHARGE = REGISTRY.register("crystal_charge", () -> new CrystalChargeEnchantment());
	public static final RegistryObject<Enchantment> CRYSTAL_RELOAD = REGISTRY.register("crystal_reload", () -> new CrystalReloadEnchantment());
}
