package hi54123.testmod.item;

import hi54123.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
	public static final Item MODITEM1 = rigisterItem("moditem1",
			new Item(new FabricItemSettings().group(ModItemGroup.MODITEM)));
	public static final Item MODITEM2 = rigisterItem("moditem2",
			new Item(new FabricItemSettings().group(ModItemGroup.MODITEM)));
	
	private static Item rigisterItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
	}
	
	public static void registerModItems() {
		TestMod.LOGGER.debug("Registring mod items for " + TestMod.MOD_ID);
	}
}
