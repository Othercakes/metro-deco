/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.othercakes.metro_deco;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.othercakes.metro_deco.init.MetroDecoModTabs;
import net.othercakes.metro_deco.init.MetroDecoModProcedures;
import net.othercakes.metro_deco.init.MetroDecoModItems;
import net.othercakes.metro_deco.init.MetroDecoModBlocks;

import net.fabricmc.api.ModInitializer;

public class MetroDecoMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "metro_deco";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing MetroDecoMod");

		MetroDecoModTabs.load();

		MetroDecoModBlocks.load();
		MetroDecoModItems.load();

		MetroDecoModProcedures.load();

	}
}
