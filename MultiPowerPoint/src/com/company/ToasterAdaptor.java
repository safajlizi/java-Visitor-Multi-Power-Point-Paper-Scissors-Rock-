package com.company;

import package2.Toaster;

public class ToasterAdaptor implements Appliance{
    private Toaster toaster=new Toaster();

    public ToasterAdaptor(Toaster toaster){
        this.toaster=toaster;
    }
    @Override
    public void on() {

       toaster.startTosting();
    }

    @Override
    public void off() {

        toaster.offTosting();}
}
