
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CorruptedSeedsItem extends Item {
	public CorruptedSeedsItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("corrupted_seeds");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
