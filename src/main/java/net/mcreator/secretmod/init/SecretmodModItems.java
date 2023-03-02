
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.secretmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.secretmod.item.LuluarmorItem;
import net.mcreator.secretmod.SecretmodMod;

public class SecretmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SecretmodMod.MODID);
	public static final RegistryObject<Item> LULUARMOR_HELMET = REGISTRY.register("luluarmor_helmet", () -> new LuluarmorItem.Helmet());
	public static final RegistryObject<Item> LULUARMOR_CHESTPLATE = REGISTRY.register("luluarmor_chestplate", () -> new LuluarmorItem.Chestplate());
	public static final RegistryObject<Item> LULUARMOR_LEGGINGS = REGISTRY.register("luluarmor_leggings", () -> new LuluarmorItem.Leggings());
	public static final RegistryObject<Item> LULUARMOR_BOOTS = REGISTRY.register("luluarmor_boots", () -> new LuluarmorItem.Boots());
}
