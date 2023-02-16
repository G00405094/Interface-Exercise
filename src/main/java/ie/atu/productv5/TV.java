package ie.atu.productv5;

import ie.atu.productv5.Product;

public class TV extends Product {

    private String manufacture;
    private String screen;

    public TV() {
        super();
        manufacture = "";
        screen = "";
        count++;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getManufacture() {
        return manufacture;
    }
    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + manufacture + " \nscreen size is " + screen;
    }
}