package hi54123.testmod.block;

import hi54123.testmod.TestMod;
import hi54123.testmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
	
	public static final Block MODBLOCK1 = registerBlock("modblock1",
			new Block(FabricBlockSettings.of(Material.STONE).strength(0.8f).requiresTool()), ModItemGroup.MODITEM);
	
	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name),
				new BlockItem(block, new FabricItemSettings().group(tab)));
	}
	
	public static void registerModBlocks() {
		TestMod.LOGGER.debug("Registering mod blocks for " + TestMod.MOD_ID);
	}
	
	
}
