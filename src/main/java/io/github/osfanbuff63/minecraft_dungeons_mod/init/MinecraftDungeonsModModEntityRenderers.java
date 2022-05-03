
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.osfanbuff63.minecraft_dungeons_mod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftDungeonsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.EXPLODING_CROSSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.HEAVY_CROSSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.HUNTING_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.LONG_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.POWER_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.RAPID_CROSSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SCATTER_CROSSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SHORT_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SLOWBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SOUL_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SOUL_CROSSBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.TRICKBOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.BOW_UNIQUE_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.BOW_UNIQUE_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_2.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.EXPLODING_CROSSBOW_UNIQUE_1.get(), ThrownItemRenderer::new);
	}
}
