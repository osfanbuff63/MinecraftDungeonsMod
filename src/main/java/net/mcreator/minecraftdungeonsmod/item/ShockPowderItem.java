
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class ShockPowderItem extends Item {
	public ShockPowderItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("shock_powder");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
