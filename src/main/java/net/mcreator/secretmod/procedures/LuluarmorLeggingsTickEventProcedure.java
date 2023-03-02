package net.mcreator.secretmod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;

import net.mcreator.secretmod.init.SecretmodModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LuluarmorLeggingsTickEventProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (30 <= (entity instanceof Player _plr ? _plr.experienceLevel : 0)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
						.getItem() == SecretmodModItems.LULUARMOR_LEGGINGS.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(SecretmodModItems.LULUARMOR_LEGGINGS.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(SecretmodModItems.LULUARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SecretmodModItems.LULUARMOR_LEGGINGS.get()));
				}
			}
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.MENDING, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.UNBREAKING, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.ALL_DAMAGE_PROTECTION, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.FIRE_PROTECTION, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.BLAST_PROTECTION, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.PROJECTILE_PROTECTION, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.SWIFT_SNEAK, 10);
			((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY))
					.enchant(Enchantments.THORNS, 10);
		}
	}
}
