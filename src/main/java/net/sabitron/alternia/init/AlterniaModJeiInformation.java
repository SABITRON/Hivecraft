
package net.sabitron.alternia.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class AlterniaModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("alternia:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(AlterniaModItems.TREASURE_KEY.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.alternia.key_info"));
		registration.addIngredientInfo(List.of(new ItemStack(AlterniaModBlocks.TREASURE_VAULT.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.alternia.vault_info"));
		registration.addIngredientInfo(List.of(new ItemStack(AlterniaModItems.SHADES_HELMET.get()), new ItemStack(AlterniaModItems.RUST_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.BRONZE_SHADES_HELMET.get()),
				new ItemStack(AlterniaModItems.GOLD_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.LIME_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.OLIVE_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.JADE_SHADES_HELMET.get()),
				new ItemStack(AlterniaModItems.TEAL_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.COBALT_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.INDIGO_SHADES_HELMET.get()),
				new ItemStack(AlterniaModItems.PURPLE_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.VIOLET_SHADES_HELMET.get()), new ItemStack(AlterniaModItems.FUCHSIA_SHADES_HELMET.get()),
				new ItemStack(AlterniaModItems.COBALT_VISOR_HELMET.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.alternia.sunglasses_information"));
		registration.addIngredientInfo(List.of(new ItemStack(AlterniaModItems.LIVE_GRUB.get()), new ItemStack(AlterniaModBlocks.GRUB_NEST.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.alternia.grub_nest_info"));
		registration.addIngredientInfo(List.of(new ItemStack(AlterniaModItems.AHABS_CROSSHAIRS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.alternia.ahab_crosshairs_info"));
	}
}
