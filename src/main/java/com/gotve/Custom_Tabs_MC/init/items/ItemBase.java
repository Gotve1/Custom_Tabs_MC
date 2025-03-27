package com.gotve.Custom_Tabs_MC.init.items;

import com.gotve.Custom_Tabs_MC.Main;
import com.gotve.Custom_Tabs_MC.init.ModItems;
import com.gotve.Custom_Tabs_MC.util.Model;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements Model {

    public ItemBase(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}