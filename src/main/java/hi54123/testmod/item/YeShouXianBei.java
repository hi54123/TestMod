package hi54123.testmod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

/**
 * Build a prop called YeShouXianBei
 */
public class YeShouXianBei extends Item {
	public YeShouXianBei(Settings settings) {
		super(settings);
	}
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		saySomeThing(user);
		user.getItemCooldownManager().set(this, 10);
		return super.use(world, user, hand);
	}
	
	private void saySomeThing(PlayerEntity player) {
		player.sendMessage(Text.literal("哼哼啊啊啊啊啊啊啊啊啊啊啊啊啊"));
	}
}
