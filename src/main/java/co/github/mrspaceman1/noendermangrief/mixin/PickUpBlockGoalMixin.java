package co.github.mrspaceman1.noendermangrief.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static co.github.mrspaceman1.noendermangrief.ExampleMod.LOGGER;

@Mixin(targets = "net.minecraft.entity.mob.EndermanEntity$PickUpBlockGoal")
public class PickUpBlockGoalMixin {
    @Inject(at=@At("HEAD"), method = "canStart", cancellable = true)
    public void onCanStart(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
        LOGGER.warn("Enderman tried to pick up block");
    }
}
