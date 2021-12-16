
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class IronHideAmuletItem extends Item {
	public IronHideAmuletItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("iron_hide_amulet");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
