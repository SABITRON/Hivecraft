package net.sabitron.alternia.procedures;

import net.minecraft.world.entity.Entity;

public class GetRidOfThatFuckingGravityProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
		if (immediatesourceentity.isInWater()) {
			if (!immediatesourceentity.level().isClientSide())
				immediatesourceentity.discard();
		}
	}
}
