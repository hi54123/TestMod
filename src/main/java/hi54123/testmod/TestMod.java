package hi54123.testmod;

import hi54123.testmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("testmod");
	
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}