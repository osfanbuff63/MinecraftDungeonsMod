
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class TastyBoneItem extends Item {
	public TastyBoneItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(63).rarity(Rarity.COMMON));
		setRegistryName("tasty_bone");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
