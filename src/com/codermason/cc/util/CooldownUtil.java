package com.codermason.cc.util;

import com.codermason.cc.object.CCooldown;

/**
 * Created by slhscs216 on 1/12/2015.
 */
public class CooldownUtil {

    public static String getCooldownName(CCooldown cCooldown) {
        String commandName = cCooldown.getCommand();
        for (String arg : cCooldown.getArgs()) {
            commandName += "_" + arg;
        }
        return commandName;
    }

}
