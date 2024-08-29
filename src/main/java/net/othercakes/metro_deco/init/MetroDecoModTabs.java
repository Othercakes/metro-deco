
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.othercakes.metro_deco.init;

import net.othercakes.metro_deco.MetroDecoMod;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class MetroDecoModTabs {
	public static ResourceKey<CreativeModeTab> TAB_METRO_DECO = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(MetroDecoMod.MODID, "metro_deco"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_METRO_DECO,
				FabricItemGroup.builder().title(Component.translatable("item_group." + MetroDecoMod.MODID + ".metro_deco")).icon(() -> new ItemStack(MetroDecoModBlocks.CEILING_LIGHT_SMALL)).build());
	}
}
