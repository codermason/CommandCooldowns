package com.codermason.cc;

import com.codermason.cc.config.ConfigOptions;
import com.codermason.cc.object.CCooldown;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by slhscs216 on 1/12/2015.
 */
public class CC extends JavaPlugin {

    private static CC instance;

    private ConfigOptions configOptions;

    public void onEnable() {
        instance = this;

        saveDefaultConfig();

        this.configOptions = new ConfigOptions(getConfig());

        CCooldown.loadCCs(this.configOptions.getCommandList());
    }

    public ConfigOptions getConfigOptions() {
         return configOptions;
    }

    public static CC getInstance() {
        return instance;
    }

}
