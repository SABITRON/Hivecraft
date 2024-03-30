package net.sabitron.alternia.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class LususRegenProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
			if (Mth.nextInt(RandomSource.create(), 1, 50) == 1) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			}
		}
	}
}
