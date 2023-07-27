package org.java.apartment_booking.employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(int employeeId);

    void saveOrUpdateEmployee(Employee employee);

    void deleteEmployee(int employeeId);
}
