package com.wangwei.design.pattern.adapter;

/**
 * 使用usb 接口适配 ps2
 *
 * usb 接口 -> adapter -> ps2
 */
public class UsbForPs2Adapter implements  Usb{

    private Ps2 ps2 ;
    public  UsbForPs2Adapter (Ps2 ps2){
        this.ps2 =ps2;
    }

    @Override
    public void useUsb() {
        ps2.usePs2();
    }
}
