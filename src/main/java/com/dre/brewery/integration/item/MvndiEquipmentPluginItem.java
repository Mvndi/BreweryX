package com.dre.brewery.integration.item;

import com.dre.brewery.filedata.BConfig;
import com.dre.brewery.recipe.PluginItem;
import net.mvndicraft.mvndiequipment.ItemManager;
import org.bukkit.inventory.ItemStack;

public class MvndiEquipmentPluginItem extends PluginItem {
	@Override
	public boolean matches(ItemStack item) {
		if (!BConfig.hasMvndiEquipment) {
			return false;
		}

		String itemId = ItemManager.getInstance().getId(item);
		if (itemId.isBlank()) {
			return false;
		}
		return itemId.equals(this.getItemId());
	}
}
