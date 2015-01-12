package com.codermason.cc.config;

import org.bukkit.configuration.file.FileConfiguration;

import java.util.List;

/**
 * Created by slhscs216 on 1/12/2015.
 */
public class ConfigOptions {

    private List<String> commandList;

    private FileConfiguration configuration;

    public ConfigOptions(FileConfiguration configuration) {
        this.configuration = configuration;
    }

    public List<String> getCommandList() {
        if (commandList == null) {
            commandList = configuration.getStringList("commands");
        }
        return commandList;
    }

}
