package ie.atu.productv4;

import ie.atu.productv4.Product;

import java.text.NumberFormat;
import java.util.Locale;

public class Music extends Product {

    private String artist;
    private String label;

    public Music() {
        super();
        artist = "";
        label = "";
        count++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + " part of " + label;
    }
}
