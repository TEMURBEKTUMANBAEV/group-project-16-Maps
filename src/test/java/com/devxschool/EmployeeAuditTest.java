package com.devxschool;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EmployeeAuditTest {

    @Test
    public void addEmployeeIdTest1() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertEquals("Sohan Singh", actual.get("0006").trim(), "Expected 6th in the list Sohan Singh from:\n"+employeeList.toString());
    }
    @Test
    public void addEmployeeIdTest2() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertEquals("Sudhir Rana", actual.get("0002"), "Expected 6th in the list Sudhir Rana from:\n"+employeeList.toString());
    }
    @Test
    public void addEmployeeIdTest3() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertEquals("Nitin Kumar Yadav", actual.get("0001"), "Expected 6th in the list Nitin Kumar Yadav from:\n"+employeeList.toString());
    }
    @Test
    public void addEmployeeIdTest4() {
        List<String> employeeList = asList("Nitin Kumar Yadav", "Sudhir Rana", "Komal Sharawat", "Suman Lata", "Naresh Kumar", "Sohan Singh", "Vinod Kumar");
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertEquals("Vinod Kumar", actual.get("0007"), "Expected 4th in the list \"Vinod Kumar\" from:\n"+employeeList.toString());
    }

    @Test
    public void addEmployeeIdTest5() {
        List<String> employeeList = Collections.emptyList();
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertNull( actual.get(""), "Expected empty map");
    }
    @Test
    public void addEmployeeIdTest6() {
        List<String> employeeList = asList("a","a");
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertEquals("a", actual.get("0001"), "Expected 1th in the list a from:\n"+employeeList.toString());
    }
    @Test
    public void addEmployeeIdTest7() {
        List<String> employeeList = asList("Nitin", "Kumar", "Yadav", "Sudhir", "Rana", "Komal", "Sharawat", "Suman", "Lata", "Naresh", "Kumar", "Sohan", "Singh", "Vinod", "Kumar");
        Map<String,String> actual = EmployeeAudit.addEmployeeId(employeeList);
        assertEquals( 15, actual.size(), "expected size of list:\n" + employeeList.toString());
    }
}
