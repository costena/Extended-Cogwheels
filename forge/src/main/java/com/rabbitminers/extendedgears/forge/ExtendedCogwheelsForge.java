package com.rabbitminers.extendedgears.forge;

import com.rabbitminers.extendedgears.ExtendedCogwheels;
import com.rabbitminers.extendedgears.registry.ExtendedCogwheelsBlocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtendedCogwheels.MOD_ID)
public class ExtendedCogwheelsForge {
    public ExtendedCogwheelsForge() {
        // registrate must be given the mod event bus on forge before registration
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExtendedCogwheelsBlocks.REGISTRATE.registerEventListeners(eventBus);
        ExtendedCogwheels.init();
    }
}
