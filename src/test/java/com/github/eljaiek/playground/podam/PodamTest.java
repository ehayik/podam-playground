package com.github.eljaiek.playground.podam;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import static org.junit.Assert.*;

@Slf4j
public class PodamTest {

    @Test
    public void podamShouldWorkWithDefaultStrategy() {
        PodamFactory factory = new PodamFactoryImpl();
        PeripheralDevice pd = factory.manufacturePojo(PeripheralDevice .class);
        log.info(pd.toString());
        assertTrue(true);
    }

    @Test
    public void podamShouldWorkWithCustomDataStrategy() {
        PodamFactory factory = new PodamFactoryImpl(new DataProviderStrategyImpl());
        PeripheralDevice pd = factory.manufacturePojo(PeripheralDevice .class);
        log.info(pd.toString());
        assertTrue(true);
    }

}