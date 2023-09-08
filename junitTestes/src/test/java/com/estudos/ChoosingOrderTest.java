package com.estudos;

import java.util.logging.Logger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.DisplayName.class)
public class ChoosingOrderTest {
    
    private static final Logger LOGGER = Logger.getLogger(ChoosingOrderTest.class.getName());

    @DisplayName("A")
    @Test
    void validaFluxoA(){
        LOGGER.info("Estou no A");
        Assertions.assertTrue(true);
    }

    @DisplayName("B")
    @Test
    void validaFluxoB(){
        LOGGER.info("Estou no B");
        Assertions.assertTrue(true);
    }

    @DisplayName("C")
    @Test
    void validaFluxoC(){
        LOGGER.info("Estou no C");
        Assertions.assertTrue(true);
    }

    @DisplayName("D")
    @Test
    void validaFluxoD(){
        LOGGER.info("Estou no D");
        Assertions.assertTrue(true);
    }
}
