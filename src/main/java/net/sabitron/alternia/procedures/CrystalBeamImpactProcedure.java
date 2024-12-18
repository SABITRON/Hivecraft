package net.sabitron.alternia.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

public class CrystalBeamImpactProcedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, (immediatesourceentity.getPosition(Minecraft.getInstance().getPartialTick()).x()), (immediatesourceentity.getPosition(Minecraft.getInstance().getPartialTick()).y()),
					(immediatesourceentity.getPosition(Minecraft.getInstance().getPartialTick()).z()), 1, Level.ExplosionInteraction.BLOCK);
	}
}
