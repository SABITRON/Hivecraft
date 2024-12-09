
package net.sabitron.alternia.item;

import net.sabitron.alternia.procedures.AhabsCrosshairsCheckProcedure;
import net.sabitron.alternia.procedures.AhabsCrosshairsBangProcedure;
import net.sabitron.alternia.entity.AhabsCrosshairsBeamEntity;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;

import java.util.List;

public class AhabsCrosshairsItem extends Item {
	public AhabsCrosshairsItem() {
		super(new Item.Properties().durability(100).fireResistant().rarity(Rarity.UNCOMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 220;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = InteractionResultHolder.success(entity.getItemInHand(hand));
		entity.startUsingItem(hand);
		return ar;
	}

	@Override
	public void onUseTick(Level world, LivingEntity entity, ItemStack itemstack, int count) {
		if (!world.isClientSide() && entity instanceof ServerPlayer player) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (AhabsCrosshairsCheckProcedure.execute(entity, itemstack)) {
				ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == AhabsCrosshairsBeamEntity.PROJECTILE_ITEM.getItem());
				if (stack == ItemStack.EMPTY) {
					for (int i = 0; i < player.getInventory().items.size(); i++) {
						ItemStack teststack = player.getInventory().items.get(i);
						if (teststack != null && teststack.getItem() == AhabsCrosshairsBeamEntity.PROJECTILE_ITEM.getItem()) {
							stack = teststack;
							break;
						}
					}
				}
				if (player.getAbilities().instabuild || stack != ItemStack.EMPTY) {
					AhabsCrosshairsBeamEntity projectile = AhabsCrosshairsBeamEntity.shoot(world, entity, world.getRandom());
					itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
					if (player.getAbilities().instabuild) {
						projectile.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
					} else {
						if (stack.isDamageableItem()) {
							if (stack.hurt(1, world.getRandom(), player)) {
								stack.shrink(1);
								stack.setDamageValue(0);
								if (stack.isEmpty())
									player.getInventory().removeItem(stack);
							}
						} else {
							stack.shrink(1);
							if (stack.isEmpty())
								player.getInventory().removeItem(stack);
						}
					}
					AhabsCrosshairsBangProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
				}
				entity.releaseUsingItem();
			}
		}
	}
}
