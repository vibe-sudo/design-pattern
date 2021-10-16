package com.vibe.design.pattern.adapter;

/**
 * @description: 适配器
 * @author: vibe
 * @create: 2021-10-16 19:55
 **/
public class Adapter implements TypeC {

    //委派
    private USB usb;


    public Adapter(USB usb){
        this.usb = usb;
    }

    public void typeCCharge() {
        this.usb.usbCharge();
    }

}
