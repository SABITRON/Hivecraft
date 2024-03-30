package net.sabitron.alternia.procedures;

import net.sabitron.alternia.init.AlterniaModEntities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class DeployTheGrubProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, ItemStack itemstack) {
		itemstack.shrink(1);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = AlterniaModEntities.GRUB.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}
