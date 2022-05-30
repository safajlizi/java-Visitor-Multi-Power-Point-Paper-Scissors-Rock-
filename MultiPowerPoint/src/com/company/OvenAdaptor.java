package com.company;


import package3.Oven;

public class OvenAdaptor implements Appliance{
    private Oven oven =new Oven();
    public OvenAdaptor(Oven oven){this.oven=oven;}
    @Override
    public void on() {oven.heatUp();}

    @Override
    public void off() {oven.coolDown();}
}
