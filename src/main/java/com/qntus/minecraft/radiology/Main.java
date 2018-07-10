package com.qntus.minecraft.radiology;

import com.qntus.minecraft.radiology.proxy.CommonProxy;
import com.qntus.minecraft.radiology.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import static com.qntus.minecraft.radiology.util.Reference.MOD_ID;
import static com.qntus.minecraft.radiology.util.Reference.NAME;

@Mod(modid = MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

        private static Logger logger;

        @Mod.Instance(MOD_ID)
        public static Main instance;

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
            System.out.println(NAME + " is about to initialize!");
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent event) {
            System.out.println(NAME + " is Initializing!");
        }

        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent event){
            System.out.println(NAME + " has completed Initializing!");
        }

        @SidedProxy(serverSide = "com.qntus.minecraft.radiology.proxy.CommonProxy", clientSide = "com.qntus.minecraft.radiology.proxy.ClientProxy")
        public static CommonProxy proxy;
}
