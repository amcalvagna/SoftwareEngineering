//package com.baeldung.mediator;

public class Fan extends Colleague {
    private boolean isOn = false;

    public boolean isOn() {
        System.err.println("Fan was " + (isOn ? "on..." : "off..."));
        return isOn;
    }

    public void turnOn() {
        mediator.start();
        System.out.println("turning on fan...");
        isOn = true;

    }

    public void turnOff() {
        isOn = false;
        System.out.println("turning off fan...");
        mediator.stop();
    }
}
