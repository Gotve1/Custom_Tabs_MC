package com.gotve.PureMDK;

import com.gotve.PureMDK.util.Reference;
import org.apache.logging.log4j.Logger;

import com.gotve.PureMDK.proxy.CommonProxy;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID,
        name = Reference.NAME,
        version = Reference.VERSION)
public class Main {

    @Mod.Instance
    public static Main instance;

    @SidedProxy(serverSide = Reference.CLIENT_PROXY_CLASS,
                clientSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }

}
