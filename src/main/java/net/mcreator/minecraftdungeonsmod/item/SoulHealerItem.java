
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class SoulHealerItem extends Item {
	public SoulHealerItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.RARE));
		setRegistryName("soul_healer");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
