package feature.salary;


import com.hascode.tutorial.cucumber.salary.Employee;
import com.hascode.tutorial.cucumber.salary.SalaryManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;


public class SalarySteps {

    SalaryManager manager;

    @Given("^the salary management system is initialized with the following data$")
    public void the_salary_management_system_is_initialized_with_the_following_data(final List<Employee> employees) throws Throwable {
        manager = new SalaryManager(employees);
    }

    @When("^the boss increases the salary for the employee with id '(\\d+)' by (\\d+)%$")
    public void the_boss_increases_the_salary_for_the_employee_with_id_by(final int id, final int increaseInPercent) throws Throwable {
        manager.increaseSalary(id, increaseInPercent);
    }

    @Then("^the payroll for the employee with id '(\\d+)' should display a salary of (\\d+)$")
    public void the_payroll_for_the_employee_with_id_should_display_a_salary_of(final int id, final float salary) throws Throwable {
        Employee nominee = manager.getPayroll(id);
        assert(nominee.getSalary()==salary);
    }
}
