package com.example.demo.DAO;

import com.example.demo.POJO.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDataAccessService implements EmployeeDAO {

    private JdbcTemplate jdbcTemplate;

    public EmployeeDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int addEmployee(Employee employee) {
        String sql = ""
        INSERT INTO employee (name, role, hourly_salary)
        VALUES (?,?,?)
        "";

        int employeeFields = jdbcTemplate.update(
                sql,
                employee.getName(),
                employee.getRole(),
                employee.getHourlySalary()
        );
        return employeeFields;
    }

    @Override
    public List<Employee> displayEmployee() {
        String sql = ""
        SELECT id, name, role, hourly_salary, hours_worked
        FROM employee
        "";

        RowMapper<Employee> employeeRowMapper = ((rs, rowNum) -> {
            Employee currentEmployees = new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("role"),
                    rs.getInt("hourly_salary"),
                    rs.getInt("hours_worked")
            );
            return currentEmployees;
        });

        List<Employee> employees = jdbcTemplate.query(sql, employeeRowMapper);
        return employees;
    }

    @Override
    public int deleteEmployee(Integer ID) {
        String sql = ""
                DELETE FROM employee
                WHERE id = ?
        "";
        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        String sql = ""
        UPDATE employee
        SET(name, role, hourly_salary, hours_worked) = (?,?,?,?)
        WHERE id = ?
        "";
        return jdbcTemplate.update(
                sql,
                employee.getName(),
                employee.getRole(),
                employee.getHourlySalary(),
                employee.getHoursWorked()
        );
    }
}
