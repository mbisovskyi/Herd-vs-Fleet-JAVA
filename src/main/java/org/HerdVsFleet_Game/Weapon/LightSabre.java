package org.HerdVsFleet_Game.Weapon;

public class LightSabre extends Weapon{
    public LightSabre() {
        super("Light Sabre", (int)Math.floor(Math.random()*(60-40+1)+40), 25);
    }
}
