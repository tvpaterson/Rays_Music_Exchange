package Rays.instruments;

import Rays.IPlay;

public class Guitars extends Instrument implements IPlay {

    private int strings;

    public Guitars(String material, String colour, String type, int strings) {
        super(material, colour, type);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public String playTune() {
        return "Prince - Purple Rain";
    }
}
