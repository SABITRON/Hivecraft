
package net.sabitron.alternia.fluid;

import net.sabitron.alternia.init.AlterniaModItems;
import net.sabitron.alternia.init.AlterniaModFluids;
import net.sabitron.alternia.init.AlterniaModFluidTypes;
import net.sabitron.alternia.init.AlterniaModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

public abstract class SoporSlimeFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> AlterniaModFluidTypes.SOPOR_SLIME_TYPE.get(), () -> AlterniaModFluids.SOPOR_SLIME.get(), () -> AlterniaModFluids.FLOWING_SOPOR_SLIME.get())
			.explosionResistance(100f).bucket(() -> AlterniaModItems.SOPOR_SLIME_BUCKET.get()).block(() -> (LiquidBlock) AlterniaModBlocks.SOPOR_SLIME.get());

	private SoporSlimeFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.ITEM_SLIME;
	}

	public static class Source extends SoporSlimeFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SoporSlimeFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
