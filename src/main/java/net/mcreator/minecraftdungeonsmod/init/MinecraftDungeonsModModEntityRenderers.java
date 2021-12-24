
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdungeonsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinecraftDungeonsModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.EXPLODING_CROSSBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.HEAVY_CROSSBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.HUNTING_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.LONG_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.POWER_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.RAPID_CROSSBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SCATTER_CROSSBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SHORT_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SLOWBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SOUL_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.SOUL_CROSSBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.TRICKBOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.BOW_UNIQUE_1, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.BOW_UNIQUE_2, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_1, ThrownItemRenderer::new);
		event.registerEntityRenderer(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_2, ThrownItemRenderer::new);
	}
}
