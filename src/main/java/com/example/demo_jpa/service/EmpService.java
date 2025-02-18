package com.example.demo_jpa.service;
import java.util.ArrayList;
import com.example.demo_jpa.modal.Employee;
public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}
