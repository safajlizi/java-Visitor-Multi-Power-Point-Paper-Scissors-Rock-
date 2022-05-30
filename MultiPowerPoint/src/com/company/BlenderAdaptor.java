package com.company;
import package1.Blender;
public class BlenderAdaptor implements Appliance {
    private Blender blender=new Blender();
    public BlenderAdaptor(Blender blender){this.blender=blender;}
    @Override
    public void on() {blender.swizzle();}

    @Override
    public void off() {blender.stopSwizzle();}
}
