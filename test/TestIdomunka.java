/*
* File: TestIdomunka.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1 N
* Date: 2023-04-27
* Github: https://github.com/Verfarkas02/
* Licenc: GUI GPL Junit5
*/
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TestIdomunka {
    Idomunka idomunka;
    @BeforeEach
    public void init(){
        this.idomunka= new Idomunka();
    }
    @Test
    public void testszamitMunka(){
        double munka =idomunka.szamitMunka(12, 45, 56);
        assertEquals(munka, 0.004761904761904762);
    }
    public void testszamitMunkaSecond30(){
        double munka =idomunka.szamitMunka(30, 20, 65);
        assertEquals(munka, 0.023076923076923078);
    }
    @Test
    public void testCheckInputTrue(){
        boolean munka= idomunka.checkInput("50");
        assertTrue(munka);
        
    }
    public void testCheckInputFalse(){
        boolean munka= idomunka.checkInput("50.0");
        assertTrue(munka);
        
    }
    @Test
    public void testCheckInputSpecial(){
        boolean munka= idomunka.checkInput("@");
        assertFalse(munka);
    }
}
