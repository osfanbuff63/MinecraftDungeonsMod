
package net.mcreator.minecraftdungeonsmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CutlassUnique2Item extends PickaxeItem {
	public CutlassUnique2Item() {
		super(new Tier() {
			public int getUses() {
				return 177;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 6.4f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 25;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.IRON_INGOT));
			}
		}, 1, -3.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("cutlass_unique_2");
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
