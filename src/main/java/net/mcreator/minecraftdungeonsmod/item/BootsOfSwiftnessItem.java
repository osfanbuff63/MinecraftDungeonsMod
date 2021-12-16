
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class BootsOfSwiftnessItem extends Item {
	public BootsOfSwiftnessItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("boots_of_swiftness");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
