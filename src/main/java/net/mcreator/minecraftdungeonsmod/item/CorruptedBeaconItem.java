
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class CorruptedBeaconItem extends Item {
	public CorruptedBeaconItem() {
		super(new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB).stacksTo(64).rarity(Rarity.EPIC));
		setRegistryName("corrupted_beacon");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
