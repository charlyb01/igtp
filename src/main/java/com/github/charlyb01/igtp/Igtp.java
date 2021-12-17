package com.github.charlyb01.igtp;

import com.github.charlyb01.igtp.config.ModConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class Igtp implements ModInitializer {
    @Override
    public void onInitialize() {
        AutoConfig.register(ModConfig.class, GsonConfigSerializer::new);
    }
}
