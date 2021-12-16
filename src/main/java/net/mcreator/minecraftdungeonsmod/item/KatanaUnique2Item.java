
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class KatanaUnique2Item extends SwordItem {
	public KatanaUnique2Item() {
		super(new Tier() {
			public int getUses() {
				return 1029;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7.299999999999999f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -3.5f, new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB));
		setRegistryName("katana_unique_2");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
