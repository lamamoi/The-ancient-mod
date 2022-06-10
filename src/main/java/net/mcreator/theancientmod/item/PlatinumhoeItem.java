
package net.mcreator.theancientmod.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.theancientmod.init.TheAncientModModItems;

public class PlatinumhoeItem extends HoeItem {
	public PlatinumhoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1374;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 2.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 11;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TheAncientModModItems.PLATINUMINGOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
