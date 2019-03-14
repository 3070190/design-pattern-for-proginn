package com.wangwei.design.pattern.adapter.client;

import com.wangwei.design.pattern.adapter.Ps2Impl;
import com.wangwei.design.pattern.adapter.UsbForPs2Adapter;

public class Client {
    public static void main(String[] args){
        UsbForPs2Adapter usbForPs2Adapter =new UsbForPs2Adapter(new Ps2Impl());
        usbForPs2Adapter.useUsb();
    }
}
