package net.sabitron.alternia.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class ZombieTrollAddEquipmentProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.5) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("alternia:shadow_dropper_weapons"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR)));
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (Math.random() < 0.1) {
				if (entity instanceof LivingEntity _entity) {
					ItemStack _setstack = (EnchantmentHelper.enchantItem(RandomSource.create(),
							new ItemStack((ForgeRegistries.ITEMS.tags().getTag(ItemTags.create(new ResourceLocation("alternia:shadow_dropper_weapons"))).getRandomElement(RandomSource.create()).orElseGet(() -> Items.AIR))),
							Mth.nextInt(RandomSource.create(), 1, 30), true));
					_setstack.setCount(1);
					_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
					if (_entity instanceof Player _player)
						_player.getInventory().setChanged();
				}
			}
		}
	}
}
