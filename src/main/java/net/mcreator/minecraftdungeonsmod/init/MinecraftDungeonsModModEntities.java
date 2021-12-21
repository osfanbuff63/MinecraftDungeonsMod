
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdungeonsmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.minecraftdungeonsmod.entity.TrickbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.SoulCrossbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.SoulBowEntity;
import net.mcreator.minecraftdungeonsmod.entity.SlowbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.ShortBowEntity;
import net.mcreator.minecraftdungeonsmod.entity.ScatterCrossbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.RapidCrossbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.PowerBowEntity;
import net.mcreator.minecraftdungeonsmod.entity.LongBowEntity;
import net.mcreator.minecraftdungeonsmod.entity.HuntingBowEntity;
import net.mcreator.minecraftdungeonsmod.entity.HeavyCrossbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.ExplodingCrossbowEntity;
import net.mcreator.minecraftdungeonsmod.entity.BowUnique2Entity;
import net.mcreator.minecraftdungeonsmod.entity.BowUnique1Entity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftDungeonsModModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<ExplodingCrossbowEntity> EXPLODING_CROSSBOW = register("entitybulletexploding_crossbow",
			EntityType.Builder.<ExplodingCrossbowEntity>of(ExplodingCrossbowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ExplodingCrossbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<HeavyCrossbowEntity> HEAVY_CROSSBOW = register("entitybulletheavy_crossbow",
			EntityType.Builder.<HeavyCrossbowEntity>of(HeavyCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(HeavyCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<HuntingBowEntity> HUNTING_BOW = register("entitybullethunting_bow",
			EntityType.Builder.<HuntingBowEntity>of(HuntingBowEntity::new, MobCategory.MISC).setCustomClientFactory(HuntingBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<LongBowEntity> LONG_BOW = register("entitybulletlong_bow",
			EntityType.Builder.<LongBowEntity>of(LongBowEntity::new, MobCategory.MISC).setCustomClientFactory(LongBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PowerBowEntity> POWER_BOW = register("entitybulletpower_bow",
			EntityType.Builder.<PowerBowEntity>of(PowerBowEntity::new, MobCategory.MISC).setCustomClientFactory(PowerBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RapidCrossbowEntity> RAPID_CROSSBOW = register("entitybulletrapid_crossbow",
			EntityType.Builder.<RapidCrossbowEntity>of(RapidCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(RapidCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ScatterCrossbowEntity> SCATTER_CROSSBOW = register("entitybulletscatter_crossbow",
			EntityType.Builder.<ScatterCrossbowEntity>of(ScatterCrossbowEntity::new, MobCategory.MISC)
					.setCustomClientFactory(ScatterCrossbowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ShortBowEntity> SHORT_BOW = register("entitybulletshort_bow",
			EntityType.Builder.<ShortBowEntity>of(ShortBowEntity::new, MobCategory.MISC).setCustomClientFactory(ShortBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SlowbowEntity> SLOWBOW = register("entitybulletslowbow",
			EntityType.Builder.<SlowbowEntity>of(SlowbowEntity::new, MobCategory.MISC).setCustomClientFactory(SlowbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SoulBowEntity> SOUL_BOW = register("entitybulletsoul_bow",
			EntityType.Builder.<SoulBowEntity>of(SoulBowEntity::new, MobCategory.MISC).setCustomClientFactory(SoulBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SoulCrossbowEntity> SOUL_CROSSBOW = register("entitybulletsoul_crossbow",
			EntityType.Builder.<SoulCrossbowEntity>of(SoulCrossbowEntity::new, MobCategory.MISC).setCustomClientFactory(SoulCrossbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TrickbowEntity> TRICKBOW = register("entitybullettrickbow",
			EntityType.Builder.<TrickbowEntity>of(TrickbowEntity::new, MobCategory.MISC).setCustomClientFactory(TrickbowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BowUnique1Entity> BOW_UNIQUE_1 = register("entitybulletbow_unique_1",
			EntityType.Builder.<BowUnique1Entity>of(BowUnique1Entity::new, MobCategory.MISC).setCustomClientFactory(BowUnique1Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BowUnique2Entity> BOW_UNIQUE_2 = register("entitybulletbow_unique_2",
			EntityType.Builder.<BowUnique2Entity>of(BowUnique2Entity::new, MobCategory.MISC).setCustomClientFactory(BowUnique2Entity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
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
