/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend.Employee;

import java.util.ArrayList;

/**
 *
 * @author ms
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public void removeEmployee(Employee name){
        //Employee employee = new Employee();
        employeeList.remove(name);
    }
}