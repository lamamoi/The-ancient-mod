
package net.mcreator.theancientmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class CopperSwordItem extends SwordItem {
	public CopperSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 762;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 1.2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.COPPER_INGOT));
			}
		}, 3, -1.6f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
