package net.sabitron.alternia.procedures;

import net.sabitron.alternia.entity.FairyBullEntity;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class FairyBullHurtAnimationProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof FairyBullEntity) {
			((FairyBullEntity) entity).setAnimation("animation.fairy_bull.hurt");
		}
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1000, 0, false, false));
		}
	}
}