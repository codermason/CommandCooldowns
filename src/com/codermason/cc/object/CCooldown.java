package com.codermason.cc.object;

import com.codermason.cc.util.CommandUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by slhscs216 on 1/12/2015.
 */
public class CCooldown {

    private static List<CCooldown> cooldownList = new ArrayList<CCooldown>();

    public static CCooldown getCooldown(String command, String[] args) {
        for (CCooldown cc : cooldownList) {
            if (cc.getCommand().equals(command) && Arrays.equals(args, cc.getArgs())) {
                return cc;
            }
        }
        return null;
    }

    public static boolean isCooldown(String command, String[] args) {
        return getCooldown(command, args) != null;
    }

    public static void loadCCs(List<String> rawList) {
        for (String s : rawList) {
            CCooldown cooldown = CommandUtil.getCooldown(s);
            if (cooldown != null) {
                cooldownList.add(cooldown);
            }
        }
    }

    private String command;

    private String[] args;

    private double cooldown;

    public CCooldown(String command, String[] args, double cooldown) {
        this.command = command;
        this.args = args;
        this.cooldown = cooldown;
    }

    public String getCommand() {
        return command;
    }

    public String[] getArgs() {
        return args;
    }

    public double getCooldown() {
        return cooldown;
    }

}
