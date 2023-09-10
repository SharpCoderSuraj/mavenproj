package com.estudos.genericos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class AssumptionsTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "William")
    @DisabledIfEnvironmentVariable(named =  "USER", matches = "root")
    @EnabledOnOs(OS.WINDOWS)
    @EnabledOnJre(JRE.JAVA_17)
    void validateWhenUserIsNotWilliam(){
        Assumptions.assumeFalse("William".equalsIgnoreCase(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
