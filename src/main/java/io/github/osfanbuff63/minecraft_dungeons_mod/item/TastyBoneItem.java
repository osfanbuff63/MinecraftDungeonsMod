
package io.github.osfanbuff63.minecraft_dungeons_mod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.github.osfanbuff63.minecraft_dungeons_mod.init.MinecraftDungeonsModModTabs;

public class TastyBoneItem extends Item {
	public TastyBoneItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(63).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
