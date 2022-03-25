package Rays.shop;

import Rays.ISell;
import Rays.instruments.Instrument;

public class Items implements ISell{

        private Instrument instrument;
        private double buyPrice;
        private double sellPrice;

        public Items(Instrument instrument, double buyPrice, double sellPrice) {
            this.instrument = instrument;
            this.buyPrice = buyPrice;
            this.sellPrice = sellPrice;
        }

        public Instrument getType() {
            return instrument;
        }

        public double getBuyPrice() {
            return buyPrice;
        }

        public double getSellPrice() {
            return sellPrice;
        }

        @Override
        public double calculateMarkUp() {
            return sellPrice - buyPrice;
        }
    }


