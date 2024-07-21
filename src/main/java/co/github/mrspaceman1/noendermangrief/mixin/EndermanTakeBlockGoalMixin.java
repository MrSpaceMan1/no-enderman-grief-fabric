package co.github.mrspaceman1.noendermangrief.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(targets = "net.minecraft.world.entity.monster.EnderMan$EndermanTakeBlockGoal")
public class EndermanTakeBlockGoalMixin {
    @Inject(at=@At("HEAD"), method = "canUse", cancellable = true)
    public void onCanStart(CallbackInfoReturnable<Boolean> cir){
        cir.setReturnValue(true);
    }
}
