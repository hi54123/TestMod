package hi54123.testmod.item;

import hi54123.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
	public static final ItemGroup MODITEM = FabricItemGroupBuilder.build(
			new Identifier(TestMod.MOD_ID, "moditems"),
			() -> new ItemStack(ModItems.MODITEM1));
	
	public static void registerItemGroup() {
		TestMod.LOGGER.debug("Registering mod item group for " + TestMod.MOD_ID);
	}
}
