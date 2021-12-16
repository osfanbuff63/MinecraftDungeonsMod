
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minecraftdungeonsmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.minecraftdungeonsmod.item.WonderfulWheatItem;
import net.mcreator.minecraftdungeonsmod.item.WindHornItem;
import net.mcreator.minecraftdungeonsmod.item.WhipItem;
import net.mcreator.minecraftdungeonsmod.item.TrickbowItem;
import net.mcreator.minecraftdungeonsmod.item.TotemOfShieldingItem;
import net.mcreator.minecraftdungeonsmod.item.TotemOfRegenerationItem;
import net.mcreator.minecraftdungeonsmod.item.TormentQuiverItem;
import net.mcreator.minecraftdungeonsmod.item.TomeOfDuplicationItem;
import net.mcreator.minecraftdungeonsmod.item.TastyBoneItem;
import net.mcreator.minecraftdungeonsmod.item.SpearItem;
import net.mcreator.minecraftdungeonsmod.item.SoulScytheItem;
import net.mcreator.minecraftdungeonsmod.item.SoulKnifeItem;
import net.mcreator.minecraftdungeonsmod.item.SoulHealerItem;
import net.mcreator.minecraftdungeonsmod.item.SoulCrossbowItem;
import net.mcreator.minecraftdungeonsmod.item.SoulBowItem;
import net.mcreator.minecraftdungeonsmod.item.SlowbowItem;
import net.mcreator.minecraftdungeonsmod.item.SicklesItem;
import net.mcreator.minecraftdungeonsmod.item.ShortBowItem;
import net.mcreator.minecraftdungeonsmod.item.ShockPowderItem;
import net.mcreator.minecraftdungeonsmod.item.ScatterCrossbowItem;
import net.mcreator.minecraftdungeonsmod.item.RapidCrossbowItem;
import net.mcreator.minecraftdungeonsmod.item.PowerBowItem;
import net.mcreator.minecraftdungeonsmod.item.PickaxeMCDItem;
import net.mcreator.minecraftdungeonsmod.item.MaceItem;
import net.mcreator.minecraftdungeonsmod.item.MCDSwordItem;
import net.mcreator.minecraftdungeonsmod.item.MCDElytraItem;
import net.mcreator.minecraftdungeonsmod.item.MCDAxeItem;
import net.mcreator.minecraftdungeonsmod.item.MCDArrowItem;
import net.mcreator.minecraftdungeonsmod.item.LoveMedallionItem;
import net.mcreator.minecraftdungeonsmod.item.LongBowItem;
import net.mcreator.minecraftdungeonsmod.item.LightFeatherItem;
import net.mcreator.minecraftdungeonsmod.item.KatanaItem;
import net.mcreator.minecraftdungeonsmod.item.IronHideAmuletItem;
import net.mcreator.minecraftdungeonsmod.item.IceWandItem;
import net.mcreator.minecraftdungeonsmod.item.HuntingBowItem;
import net.mcreator.minecraftdungeonsmod.item.HighlanderLongSwordItem;
import net.mcreator.minecraftdungeonsmod.item.HeavyCrossbowItem;
import net.mcreator.minecraftdungeonsmod.item.HarvesterItem;
import net.mcreator.minecraftdungeonsmod.item.HammerItem;
import net.mcreator.minecraftdungeonsmod.item.GongOfWeakeningItem;
import net.mcreator.minecraftdungeonsmod.item.GlaiveItem;
import net.mcreator.minecraftdungeonsmod.item.GauntletsItem;
import net.mcreator.minecraftdungeonsmod.item.FireworksArrowItem;
import net.mcreator.minecraftdungeonsmod.item.ExplodingCrossbowItem;
import net.mcreator.minecraftdungeonsmod.item.DoubleAxeItem;
import net.mcreator.minecraftdungeonsmod.item.DeathCapMushroomItem;
import net.mcreator.minecraftdungeonsmod.item.DaggersItem;
import net.mcreator.minecraftdungeonsmod.item.CutlassItem;
import net.mcreator.minecraftdungeonsmod.item.CorruptedSeedsItem;
import net.mcreator.minecraftdungeonsmod.item.CorruptedBeaconItem;
import net.mcreator.minecraftdungeonsmod.item.ClaymoreUnique1Item;
import net.mcreator.minecraftdungeonsmod.item.ClaymoreItem;
import net.mcreator.minecraftdungeonsmod.item.BootsOfSwiftnessItem;
import net.mcreator.minecraftdungeonsmod.item.AxeUnique2Item;
import net.mcreator.minecraftdungeonsmod.item.AxeUnique1Item;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MinecraftDungeonsModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item TASTY_BONE = register(new TastyBoneItem());
	public static final Item MCD_ARROW = register(new MCDArrowItem());
	public static final Item EXPLODING_CROSSBOW = register(new ExplodingCrossbowItem());
	public static final Item HEAVY_CROSSBOW = register(new HeavyCrossbowItem());
	public static final Item HUNTING_BOW = register(new HuntingBowItem());
	public static final Item LONG_BOW = register(new LongBowItem());
	public static final Item POWER_BOW = register(new PowerBowItem());
	public static final Item RAPID_CROSSBOW = register(new RapidCrossbowItem());
	public static final Item SCATTER_CROSSBOW = register(new ScatterCrossbowItem());
	public static final Item SHORT_BOW = register(new ShortBowItem());
	public static final Item SLOWBOW = register(new SlowbowItem());
	public static final Item SOUL_BOW = register(new SoulBowItem());
	public static final Item SOUL_CROSSBOW = register(new SoulCrossbowItem());
	public static final Item TRICKBOW = register(new TrickbowItem());
	public static final Item MCD_AXE = register(new MCDAxeItem());
	public static final Item CLAYMORE = register(new ClaymoreItem());
	public static final Item CUTLASS = register(new CutlassItem());
	public static final Item DAGGERS = register(new DaggersItem());
	public static final Item DOUBLE_AXE = register(new DoubleAxeItem());
	public static final Item GAUNTLETS = register(new GauntletsItem());
	public static final Item GLAIVE = register(new GlaiveItem());
	public static final Item HAMMER = register(new HammerItem());
	public static final Item HIGHLANDER_LONG_SWORD = register(new HighlanderLongSwordItem());
	public static final Item KATANA = register(new KatanaItem());
	public static final Item MACE = register(new MaceItem());
	public static final Item PICKAXE_MCD = register(new PickaxeMCDItem());
	public static final Item SICKLES = register(new SicklesItem());
	public static final Item SOUL_KNIFE = register(new SoulKnifeItem());
	public static final Item SOUL_SCYTHE = register(new SoulScytheItem());
	public static final Item SPEAR = register(new SpearItem());
	public static final Item MCD_SWORD = register(new MCDSwordItem());
	public static final Item WHIP = register(new WhipItem());
	public static final Item IRON_HIDE_AMULET = register(new IronHideAmuletItem());
	public static final Item BOOTS_OF_SWIFTNESS = register(new BootsOfSwiftnessItem());
	public static final Item CORRUPTED_BEACON = register(new CorruptedBeaconItem());
	public static final Item CORRUPTED_SEEDS = register(new CorruptedSeedsItem());
	public static final Item DEATH_CAP_MUSHROOM = register(new DeathCapMushroomItem());
	public static final Item MCD_ELYTRA = register(new MCDElytraItem());
	public static final Item FIREWORKS_ARROW = register(new FireworksArrowItem());
	public static final Item GONG_OF_WEAKENING = register(new GongOfWeakeningItem());
	public static final Item HARVESTER = register(new HarvesterItem());
	public static final Item ICE_WAND = register(new IceWandItem());
	public static final Item LIGHT_FEATHER = register(new LightFeatherItem());
	public static final Item LOVE_MEDALLION = register(new LoveMedallionItem());
	public static final Item SHOCK_POWDER = register(new ShockPowderItem());
	public static final Item SOUL_HEALER = register(new SoulHealerItem());
	public static final Item TOME_OF_DUPLICATION = register(new TomeOfDuplicationItem());
	public static final Item TORMENT_QUIVER = register(new TormentQuiverItem());
	public static final Item TOTEM_OF_REGENERATION = register(new TotemOfRegenerationItem());
	public static final Item TOTEM_OF_SHIELDING = register(new TotemOfShieldingItem());
	public static final Item WIND_HORN = register(new WindHornItem());
	public static final Item WONDERFUL_WHEAT = register(new WonderfulWheatItem());
	public static final Item AXE_UNIQUE_1 = register(new AxeUnique1Item());
	public static final Item AXE_UNIQUE_2 = register(new AxeUnique2Item());
	public static final Item CLAYMORE_UNIQUE_1 = register(new ClaymoreUnique1Item());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
