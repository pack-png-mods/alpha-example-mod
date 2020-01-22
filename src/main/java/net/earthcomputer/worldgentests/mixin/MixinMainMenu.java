package net.earthcomputer.worldgentests.mixin;

import net.minecraft.src.GuiMainMenu;
import net.minecraft.src.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMainMenu.class)
public class MixinMainMenu extends GuiScreen {

	@Inject(method = "drawScreen", at = @At(value = "INVOKE", target = "Lnet/minecraft/src/GuiScreen;drawScreen(IIF)V"))
	private void onDrawScreen(CallbackInfo info) {
		drawString(field_6451_g, "Modded with Fabric!", 2, height - 10, 0xffffff);
	}

}
