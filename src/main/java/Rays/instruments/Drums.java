package Rays.instruments;

import Rays.IPlay;

public class Drums extends Instrument implements IPlay {

    private int pieces;

    public Drums(String material, String colour, String type, int pieces) {

        super(material, colour, type);
        this.pieces = pieces;

    }

    public int getPieces() {
        return pieces;
    }


    @Override
    public String playTune() {
        return "Phil Colins - In The Air Tonight";
    }
}
