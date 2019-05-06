package com.example.design.adapter.model2;

import com.example.design.adapter.model1.Ps2;
import com.example.design.adapter.model1.Usb;

public class Adapter2 implements Ps2 {

    private Usb usb;

    public Adapter2(Usb usb) {
        this.usb = usb;
    }

    @Override
    public void isPs2() {
        usb.isUsb();
    }

}