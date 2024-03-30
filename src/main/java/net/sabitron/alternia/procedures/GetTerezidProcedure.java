package net.sabitron.alternia.procedures;

import net.sabitron.alternia.network.AlterniaModVariables;
import net.sabitron.alternia.init.AlterniaModMobEffects;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GetTerezidProcedure {
	@SubscribeEvent
	public static void onEntityJump(LivingEvent.LivingJumpEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((ResourceKey.create(Registries.DIMENSION, new ResourceLocation("alternia:alternia"))) == (entity.level().dimension())) {
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())) == 1000 < AlterniaModVariables.MapVariables.get(world).DaylightHandler) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(AlterniaModMobEffects.DAMAGED_VISION.get(), (int) Double.POSITIVE_INFINITY, 0, false, false));
			}
		}
	}
}
