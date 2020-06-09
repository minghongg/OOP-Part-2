package com.minghong;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        //composition. Resolution class is part of the monitor class. Monitor is not a resolution , but has a resolution
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
