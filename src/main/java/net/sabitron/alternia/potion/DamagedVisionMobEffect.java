
package net.sabitron.alternia.potion;

import net.sabitron.alternia.procedures.DamagedVisionApplyBlindnessProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class DamagedVisionMobEffect extends MobEffect {
	public DamagedVisionMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.alternia.damaged_vision";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		DamagedVisionApplyBlindnessProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
