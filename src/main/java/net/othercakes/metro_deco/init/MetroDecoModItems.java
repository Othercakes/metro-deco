/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.othercakes.metro_deco.init;

import net.othercakes.metro_deco.MetroDecoMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.client.renderer.item.ClampedItemPropertyFunction;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class MetroDecoModItems {
	public static Item CEILING_LIGHT_SMALL;

	public static void load() {
		CEILING_LIGHT_SMALL = register("ceiling_light_small", new BlockItem(MetroDecoModBlocks.CEILING_LIGHT_SMALL, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(MetroDecoModTabs.TAB_METRO_DECO).register(content -> content.accept(CEILING_LIGHT_SMALL));
	}

	public static void clientLoad() {
	}

	private static Item register(String registryName, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MetroDecoMod.MODID, registryName), item);
	}

	private static void registerBlockingProperty(Item item) {
		ItemProperties.register(item, new ResourceLocation("blocking"), (ClampedItemPropertyFunction) ItemProperties.getProperty(Items.SHIELD, new ResourceLocation("blocking")));
	}
}
