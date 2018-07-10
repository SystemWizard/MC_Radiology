package com.qntus.minecraft.radiology;

import com.qntus.minecraft.radiology.util.Reference;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)

public class Main {

        private static Logger logger;

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent event)
        {
            logger = event.getModLog();
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent event) {
            // some example code
            logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        }
}
