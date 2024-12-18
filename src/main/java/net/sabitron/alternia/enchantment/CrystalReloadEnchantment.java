
package net.sabitron.alternia.enchantment;

import net.sabitron.alternia.init.AlterniaModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class CrystalReloadEnchantment extends Enchantment {
	public CrystalReloadEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, slots);
	}

	@Override
	public int getMaxLevel() {
		return 3;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(AlterniaModItems.AHABS_CROSSHAIRS.get())).test(itemstack);
	}

	@Override
	public boolean isTradeable() {
		return false;
	}
}
