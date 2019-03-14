package com.wangwei.design.pattern.template.client;

import com.wangwei.design.pattern.template.Template;
import com.wangwei.design.pattern.template.templates.GoodTemplate;

public class Client {
    public static void  main(String [] args){
        Template template =new GoodTemplate();
        template.done();
    }
}
