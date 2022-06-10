
package net.mcreator.theancientmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.theancientmod.init.TheAncientModModItems;

public class PlatinumswordItem extends SwordItem {
	public PlatinumswordItem() {
		super(new Tier() {
			public int getUses() {
				return 1748;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 4.7f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheAncientModModItems.PLATINUMINGOT.get()));
			}
		}, 3, -1.8f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
