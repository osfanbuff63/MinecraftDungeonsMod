
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class TomeOfDuplicationItem extends Item {
	public TomeOfDuplicationItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("tome_of_duplication");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
