
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
public class CrossbowUnique1Entity extends AbstractArrow implements ItemSupplier {
	public CrossbowUnique1Entity(PlayMessages.SpawnEntity packet, Level world) {
		super(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_1.get(), world);
	}

	public CrossbowUnique1Entity(EntityType<? extends CrossbowUnique1Entity> type, Level world) {
		super(type, world);
	}

	public CrossbowUnique1Entity(EntityType<? extends CrossbowUnique1Entity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public CrossbowUnique1Entity(EntityType<? extends CrossbowUnique1Entity> type, LivingEntity entity, Level world) {
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

	public static CrossbowUnique1Entity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		CrossbowUnique1Entity entityarrow = new CrossbowUnique1Entity(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_1.get(), entity, world);
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

	public static CrossbowUnique1Entity shoot(LivingEntity entity, LivingEntity target) {
		CrossbowUnique1Entity entityarrow = new CrossbowUnique1Entity(MinecraftDungeonsModModEntities.CROSSBOW_UNIQUE_1.get(), entity, entity.level);
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(6);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(false);
		entity.level.addFreshEntity(entityarrow);
		entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
