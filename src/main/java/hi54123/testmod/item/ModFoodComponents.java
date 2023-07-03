package hi54123.testmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
	public static final FoodComponent SHIT = new FoodComponent.Builder().hunger(10).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 400, 2), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 400, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 60, 1), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 3), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 3), 1.0f).alwaysEdible().build();
}
