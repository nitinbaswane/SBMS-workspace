package com.nb.generators;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.Year;
import java.util.Random;
import java.util.Timer;
import java.util.UUID;

public class CustomGenerator implements IdentifierGenerator {


    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {

        int random= ((int) System.currentTimeMillis());
        int year= Year.now().getValue();
        int ran=new Random().nextInt(9999);


        return "NB_"+year+"_"+random+ran;
    }
}
