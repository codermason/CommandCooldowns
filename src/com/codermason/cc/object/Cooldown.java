package com.codermason.cc.object;

import java.util.UUID;

/**
 * Created by slhscs216 on 1/12/2015.
 */
public class Cooldown {

    private UUID uuid;

    private String cooldownName;

    private long startTime;

    private double length;

    public Cooldown(UUID uuid, String cooldownName, long startTime, double length) {
        this.uuid = uuid;
        this.cooldownName = cooldownName;
        this.startTime = startTime;
        this.length = length;
    }

}
