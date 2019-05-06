package com.example.design.adapter.model2;

import com.example.design.adapter.model1.Ps2;
import com.example.design.adapter.model1.Usber;

public class Clienter {

    public static void main(String[] args) {
        Ps2 p = new Adapter2(new Usber());
        p.isPs2();
    }

}