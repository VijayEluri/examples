package org.sudoinit5.mgray.springintegration.examples.demo1;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

import java.io.File;


@Component
public class Demo1ServiceActivator {

    @ServiceActivator
    public void demoReceiveFile(File _f) {

        System.out.println("Filename and path: " + _f.getAbsolutePath());

    }

}