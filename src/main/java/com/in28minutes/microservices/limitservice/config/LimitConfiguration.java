package com.in28minutes.microservices.limitservice.config;

public class LimitConfiguration {
    private int minimum;
    private int miximum;

    public LimitConfiguration() {
    }

    public LimitConfiguration(int mininim, int miximum) {
        super();
        this.minimum = mininim;
        this.miximum = miximum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    public int getMiximum() {
        return miximum;
    }

    public void setMiximum(int miximum) {
        this.miximum = miximum;
    }
}
