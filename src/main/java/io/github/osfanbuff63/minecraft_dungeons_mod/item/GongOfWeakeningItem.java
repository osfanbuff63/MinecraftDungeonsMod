
package io.github.osfanbuff63.minecraft_dungeons_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.github.osfanbuff63.minecraft_dungeons_mod.init.MinecraftDungeonsModModTabs;

public class GongOfWeakeningItem extends Item {
	public GongOfWeakeningItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
