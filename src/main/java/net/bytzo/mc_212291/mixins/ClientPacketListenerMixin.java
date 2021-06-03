package net.bytzo.mc_212291.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.world.entity.player.Player;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {
	@Redirect(method = "handleMovePlayer(Lnet/minecraft/network/protocol/game/ClientboundPlayerPositionPacket;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/player/Player;removeVehicle()V"))
	private void removeVehicle(Player player) {}
}
