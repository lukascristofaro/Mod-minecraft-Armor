
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.secretmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.secretmod.enchantment.LuluARmorenchantEnchantment;
import net.mcreator.secretmod.SecretmodMod;

public class SecretmodModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SecretmodMod.MODID);
	public static final RegistryObject<Enchantment> LULU_A_RMORENCHANT = REGISTRY.register("lulu_a_rmorenchant",
			() -> new LuluARmorenchantEnchantment());
}
