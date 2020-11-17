package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void increaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();

        assertEquals(conditioner.getCurrentTemperature(), 0);
        conditioner.setCurrentTemperature(-1);
        assertEquals(conditioner.getCurrentTemperature(),0);
    }
    @Test
    public void decreaseCurrentTemperature(){
        Conditioner conditioner = new Conditioner();

        assertEquals(conditioner.getCurrentTemperature(), 0);
        conditioner.setCurrentTemperature(1);
        assertEquals(conditioner.getCurrentTemperature(),0);
    }

    }
