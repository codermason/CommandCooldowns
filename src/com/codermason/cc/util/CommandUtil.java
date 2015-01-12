package com.codermason.cc.util;

import com.codermason.cc.CC;
import com.codermason.cc.object.CCooldown;

/**
 * Created by slhscs216 on 1/12/2015.
 */
public class CommandUtil {

    public static CCooldown getCooldown(String input) { //command_arg_arg_arg:time
        CCooldown cooldown = null;
        try {
            String[] parts = input.split(":");
            String command = parts[0], time = parts[1];
            String[] commandParts = command.split("_");
            cooldown = new CCooldown(commandParts[0], getArgs(commandParts), Double.parseDouble(time));
        } catch (Exception e) {
            CC.getInstance().getLogger().severe("UNABLE TO LOAD COMMAND COOLDOWN: " + input);
            e.printStackTrace();
        }
        return cooldown;
    }

    private static String[] getArgs(String[] fullCommand) {
        String[] args = new String[fullCommand.length - 1];
        for (int i = 1; i < fullCommand.length; i++) {
            args[i - 1] = fullCommand[i];
        }
        return args;
    }

}
