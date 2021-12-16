
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class MCDElytraItem extends Item {
	public MCDElytraItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("mcd_elytra");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
