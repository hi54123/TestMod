package hi54123.testmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
	public static final FoodComponent SHIT = new FoodComponent.Builder().
			hunger(10).
			saturationModifier(1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 600, 1), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 2400, 2), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 2), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 240, 0), 1.0f).
			alwaysEdible().
			build();
}
