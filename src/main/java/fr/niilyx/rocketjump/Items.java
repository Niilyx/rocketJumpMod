package fr.niilyx.rocketjump;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;

public class Items {

    public static Item ROCKET_JUMPER;
    public static Item AMMO;

    @SubscribeEvent
    public static void register(RegisterEvent e) {
        e.register(ForgeRegistries.Keys.ITEMS,
                itemRegisterHelper -> {
            itemRegisterHelper.register(new ResourceLocation(Main.MODID, "rocket_jumper"), new RJItem(new Item.Properties().stacksTo(1).setNoRepair().tab(CreativeModeTab.TAB_COMBAT)));
            itemRegisterHelper.register(new ResourceLocation(Main.MODID, "ammo"), new Item(new Item.Properties().stacksTo(128).setNoRepair().tab(CreativeModeTab.TAB_COMBAT)));
                });
    }
}
