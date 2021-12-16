
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class DoubleAxeUnique1Item extends AxeItem {
	public DoubleAxeUnique1Item() {
		super(new Tier() {
			public int getUses() {
				return 1149;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 16;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB));
		setRegistryName("double_axe_unique_1");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
