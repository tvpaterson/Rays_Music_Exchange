package Rays.instruments;

import Rays.IPlay;

public class Keyboards extends  Instrument implements IPlay {

    private int keys;

    public Keyboards(String material, String colour, String type, int keys) {
        super(material, colour, type);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }
    @Override
    public String playTune() {
        return "Hanz Zimmer - Interstellar";
    }
}
