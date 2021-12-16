
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.init.MinecraftDungeonsModModTabs;

public class SoulKnifeUnique1Item extends SwordItem {
	public SoulKnifeUnique1Item() {
		super(new Tier() {
			public int getUses() {
				return 752;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 7f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 18;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -3.4f, new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB));
		setRegistryName("soul_knife_unique_1");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
