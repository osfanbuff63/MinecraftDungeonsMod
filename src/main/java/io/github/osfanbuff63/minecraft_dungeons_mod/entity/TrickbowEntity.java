
package io.github.osfanbuff63.minecraft_dungeons_mod.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import java.util.Random;

import io.github.osfanbuff63.minecraft_dungeons_mod.init.MinecraftDungeonsModModItems;
import io.github.osfanbuff63.minecraft_dungeons_mod.init.MinecraftDungeonsModModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TrickbowEntity extends AbstractArrow implements ItemSupplier {
	public TrickbowEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(MinecraftDungeonsModModEntities.TRICKBOW.get(), world);
	}

	public TrickbowEntity(EntityType<? extends TrickbowEntity> type, Level world) {
		super(type, world);
	}

	public TrickbowEntity(EntityType<? extends TrickbowEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TrickbowEntity(EntityType<? extends TrickbowEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(MinecraftDungeonsModModItems.MCD_ARROW.get());
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static TrickbowEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		TrickbowEntity entityarrow = new TrickbowEntity(MinecraftDungeonsModModEntities.TRICKBOW.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(false);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static TrickbowEntity shoot(LivingEntity entity, LivingEntity target) {
		TrickbowEntity entityarrow = new TrickbowEntity(MinecraftDungeonsModModEntities.TRICKBOW.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1.2000000000000002f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5.199999999999999);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
