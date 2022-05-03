
package io.github.osfanbuff63.minecraft_dungeons_mod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import io.github.osfanbuff63.minecraft_dungeons_mod.init.MinecraftDungeonsModModTabs;

public class SoulScytheItem extends SwordItem {
	public SoulScytheItem() {
		super(new Tier() {
			public int getUses() {
				return 420;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -3f, new Item.Properties().tab(MinecraftDungeonsModModTabs.TAB_MCD_TAB));
	}
}
