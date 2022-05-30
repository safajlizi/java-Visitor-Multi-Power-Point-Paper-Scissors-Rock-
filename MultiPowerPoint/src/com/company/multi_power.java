package com.company;

import package1.Blender;
import package2.Toaster;
import package3.Oven;

public class multi_power {
    public static void main(String[] args) {
       Appliance blenderApp= new BlenderAdaptor(new Blender());
       useAppliance(blenderApp);
        Appliance toasterApp= new ToasterAdaptor(new Toaster());
        useAppliance(toasterApp);
        Appliance ovenApp= new OvenAdaptor(new Oven());
        useAppliance(ovenApp);
    }
    private static void useAppliance(Appliance appliance)
    {appliance.on();
    appliance.off();}
}
