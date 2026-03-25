package com.client.module.combat;

import com.client.module.Module;
import com.client.module.ModuleSetting;

public class AimAssist extends Module {
    public AimAssist() {
        super("Aim Assist", "Combat");
        addSetting(new ModuleSetting("Speed", 5, 1, 20, ModuleSetting.SettingType.SLIDER));
        addSetting(new ModuleSetting("Only With Weapon", false, ModuleSetting.SettingType.BOOLEAN));
        addSetting(new ModuleSetting("FOV", 90, 10, 180, ModuleSetting.SettingType.SLIDER));
        addSetting(new ModuleSetting("Target Type", "Players", ModuleSetting.SettingType.DROPDOWN));
        addSetting(new ModuleSetting("Ignore Through Walls", true, ModuleSetting.SettingType.BOOLEAN));
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }

    @Override
    public void onTick() {
    }

    public double getAimSpeed() {
        return getSetting("Speed").getDoubleValue();
    }
}