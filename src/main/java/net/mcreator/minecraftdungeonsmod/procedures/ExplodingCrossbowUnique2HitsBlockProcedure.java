package net.mcreator.minecraftdungeonsmod.procedures;

import net.minecraft.world.entity.Entity;

public class ExplodingCrossbowUnique2HitsBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"execute at @e[type=arrow,sort=nearest,limit=1] run setblock ~ ~1 ~ fire");
		}
	}
}
