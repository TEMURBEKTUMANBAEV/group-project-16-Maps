package com.devxschool;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FirstAndLastVehicleTest {

    FirstAndLastVehicle firstAndLastVehicle = new FirstAndLastVehicle();


    @Test
    public void printTest1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        firstAndLastVehicle.print();
        assertEquals("1=Mercedes\r\n" +
                        "10=Ford\r\n",
                out.toString(), "First car should be Mercedes");

    }

    @Test
    public void printTest2() {

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));


        firstAndLastVehicle.print();

        assertEquals("1=Mercedes\r\n" +
                        "10=Ford\r\n",
                out.toString(), "Last car needs to be Ford");

    }

    @Test
    public void printTest3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        firstAndLastVehicle.print();
        assertEquals("1=Mercedes\r\n" +
                        "10=Ford\r\n",
                out.toString(), "First and last cars must be Mercedes and Ford" +
                        ", because it is ordered by a key");
    }

}
