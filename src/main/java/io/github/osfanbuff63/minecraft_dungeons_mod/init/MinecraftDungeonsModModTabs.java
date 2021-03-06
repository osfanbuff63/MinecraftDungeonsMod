
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.osfanbuff63.minecraft_dungeons_mod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MinecraftDungeonsModModTabs {
	public static CreativeModeTab TAB_MCD_TAB;

	public static void load() {
		TAB_MCD_TAB = new CreativeModeTab("tabmcd_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(MinecraftDungeonsModModItems.POWER_BOW.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
