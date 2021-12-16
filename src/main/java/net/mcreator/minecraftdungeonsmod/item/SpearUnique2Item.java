
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class SpearUnique2Item extends SwordItem {
	public SpearUnique2Item() {
		super(new Tier() {
			public int getUses() {
				return 1009;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 5f;
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
		}, 3, -2.5f, new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB));
		setRegistryName("spear_unique_2");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
