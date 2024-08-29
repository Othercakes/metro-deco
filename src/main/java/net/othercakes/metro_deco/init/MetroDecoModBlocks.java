
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.othercakes.metro_deco.init;

import net.othercakes.metro_deco.block.CeilinglampBlock;
import net.othercakes.metro_deco.MetroDecoMod;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

public class MetroDecoModBlocks {
	public static Block CEILING_LIGHT_SMALL;

	public static void load() {
		CEILING_LIGHT_SMALL = register("ceiling_light_small", new CeilinglampBlock());
	}

	public static void clientLoad() {
		CeilinglampBlock.clientInit();
	}

	private static Block register(String registryName, Block block) {
		return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MetroDecoMod.MODID, registryName), block);
	}
}
