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
			statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2400, 1), 1.0f).
			alwaysEdible().
			build();
	
	public static final FoodComponent SHENBAO = new FoodComponent.Builder().
			hunger(20).
			saturationModifier(1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 4), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000, 1), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 1200, 1), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200, 1), 1.0f).
			statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 113), 0.5f).
			snack().
			alwaysEdible().
			build();
}
