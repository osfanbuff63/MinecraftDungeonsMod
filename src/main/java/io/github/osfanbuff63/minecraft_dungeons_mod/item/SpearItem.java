
package io.github.osfanbuff63.minecraft_dungeons_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import io.github.osfanbuff63.minecraft_dungeons_mod.init.MinecraftDungeonsModModTabs;

public class SpearItem extends SwordItem {
	public SpearItem() {
		super(new Tier() {
			public int getUses() {
				return 430;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3.699999999999999f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB));
	}
}
