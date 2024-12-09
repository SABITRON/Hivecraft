package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModItems;
import net.sabitron.alternia.init.AlterniaModEnchantments;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AhabsCrosshairsCheckProcedure {
	public static boolean execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return false;
		if (AlterniaModItems.AHABS_CROSSHAIRS.get() == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (200 - 40 * itemstack.getEnchantmentLevel(AlterniaModEnchantments.CRYSTAL_CHARGE.get()) < (entity instanceof LivingEntity _entUseTicks4 ? _entUseTicks4.getTicksUsingItem() : 0)) {
				return true;
			}
		}
		return false;
	}
}
