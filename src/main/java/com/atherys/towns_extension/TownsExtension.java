package com.atherys.towns_extension;

import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;

import static com.atherys.towns_extension.TownsExtension.*;

@Plugin(
        id = ID,
        name = NAME,
        description = DESCRIPTION,
        version = VERSION,
        dependencies = {
                @Dependency(id = "atheryscore"),
                @Dependency(id = "atherysscript")
        }
)
public class TownsExtension {
    public static final String ID = "townsextension";
    public static final String NAME = "Towns Extension";
    public static final String DESCRIPTION = "A'therys Quests extension for A'therys Towns.";
    public static final String VERSION = "1.0.0b";
}

