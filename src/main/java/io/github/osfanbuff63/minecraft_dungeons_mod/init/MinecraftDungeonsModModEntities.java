
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package io.github.osfanbuff63.minecraft_dungeons_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import io.github.osfanbuff63.minecraft_dungeons_mod.entity.TrickbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.SoulCrossbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.SoulBowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.SlowbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.ShortBowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.ScatterCrossbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.RapidCrossbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.PowerBowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.LongBowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.HuntingBowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.HeavyCrossbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.ExplodingCrossbowUnique1Entity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.ExplodingCrossbowEntity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.CrossbowUnique2Entity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.CrossbowUnique1Entity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.BowUnique2Entity;
import io.github.osfanbuff63.minecraft_dungeons_mod.entity.BowUnique1Entity;
import io.github.osfanbuff63.minecraft_dungeons_mod.MinecraftDungeonsModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftDungeonsModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MinecraftDungeonsModMod.MODID);
	public static final RegistryObject<EntityType<ExplodingCrossbowEntity>> EXPLODING_CROSSBOW = register("projectile_exploding_crossbow",
			EntityType.Builder.<ExplodingCrossbowEntity>of(ExplodingCrossbowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ExplodingCrossbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HeavyCrossbowEntity>> HEAVY_CROSSBOW = register("projectile_heavy_crossbow",
			EntityType.Builder.<HeavyCrossbowEntity>of(HeavyCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(HeavyCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<HuntingBowEntity>> HUNTING_BOW = register("projectile_hunting_bow",
			EntityType.Builder.<HuntingBowEntity>of(HuntingBowEntity::new, MobCategory.MISC).setCustomClientFactory(HuntingBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LongBowEntity>> LONG_BOW = register("projectile_long_bow",
			EntityType.Builder.<LongBowEntity>of(LongBowEntity::new, MobCategory.MISC).setCustomClientFactory(LongBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PowerBowEntity>> POWER_BOW = register("projectile_power_bow",
			EntityType.Builder.<PowerBowEntity>of(PowerBowEntity::new, MobCategory.MISC).setCustomClientFactory(PowerBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RapidCrossbowEntity>> RAPID_CROSSBOW = register("projectile_rapid_crossbow",
			EntityType.Builder.<RapidCrossbowEntity>of(RapidCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(RapidCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ScatterCrossbowEntity>> SCATTER_CROSSBOW = register("projectile_scatter_crossbow",
			EntityType.Builder.<ScatterCrossbowEntity>of(ScatterCrossbowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ScatterCrossbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ShortBowEntity>> SHORT_BOW = register("projectile_short_bow",
			EntityType.Builder.<ShortBowEntity>of(ShortBowEntity::new, MobCategory.MISC).setCustomClientFactory(ShortBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SlowbowEntity>> SLOWBOW = register("projectile_slowbow",
			EntityType.Builder.<SlowbowEntity>of(SlowbowEntity::new, MobCategory.MISC).setCustomClientFactory(SlowbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoulBowEntity>> SOUL_BOW = register("projectile_soul_bow",
			EntityType.Builder.<SoulBowEntity>of(SoulBowEntity::new, MobCategory.MISC).setCustomClientFactory(SoulBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SoulCrossbowEntity>> SOUL_CROSSBOW = register("projectile_soul_crossbow",
			EntityType.Builder.<SoulCrossbowEntity>of(SoulCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(SoulCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TrickbowEntity>> TRICKBOW = register("projectile_trickbow",
			EntityType.Builder.<TrickbowEntity>of(TrickbowEntity::new, MobCategory.MISC).setCustomClientFactory(TrickbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowUnique1Entity>> BOW_UNIQUE_1 = register("projectile_bow_unique_1",
			EntityType.Builder.<BowUnique1Entity>of(BowUnique1Entity::new, MobCategory.MISC).setCustomClientFactory(BowUnique1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BowUnique2Entity>> BOW_UNIQUE_2 = register("projectile_bow_unique_2",
			EntityType.Builder.<BowUnique2Entity>of(BowUnique2Entity::new, MobCategory.MISC).setCustomClientFactory(BowUnique2Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrossbowUnique1Entity>> CROSSBOW_UNIQUE_1 = register("projectile_crossbow_unique_1",
			EntityType.Builder.<CrossbowUnique1Entity>of(CrossbowUnique1Entity::new, MobCategory.MISC)
					.setCustomClientFactory(CrossbowUnique1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CrossbowUnique2Entity>> CROSSBOW_UNIQUE_2 = register("projectile_crossbow_unique_2",
			EntityType.Builder.<CrossbowUnique2Entity>of(CrossbowUnique2Entity::new, MobCategory.MISC)
					.setCustomClientFactory(CrossbowUnique2Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ExplodingCrossbowUnique1Entity>> EXPLODING_CROSSBOW_UNIQUE_1 = register(
			"projectile_exploding_crossbow_unique_1",
			EntityType.Builder.<ExplodingCrossbowUnique1Entity>of(ExplodingCrossbowUnique1Entity::new, MobCategory.MISC)
					.setCustomClientFactory(ExplodingCrossbowUnique1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
