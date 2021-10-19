package jar;

public class ShowEmployeeFunction extends Test {

    EmployeeService employeeService;

    public ShowEmployeeFunction() {


        // create instance of EmployeeService (allow to work with array)
        employeeService = new EmployeeService(EmployeeFactory.ArrayOfEmployee(10));

        // print all employee
        employeeService.printEmployee();

        // getById
        Employee empById =  employeeService.findEmployeeById(5l);
        //

        // getById
        Employee[] empByName = employeeService.findEmployeeByName("Vova");

        // sortByName
        Employee[] sortByName = employeeService.sortByName();

        // sortBySalary
        Employee[] sortBySalary = employeeService.sortBySalary();
        // EditEmp
        Employee emlForEdit = new Employee(2, "Taras", 90, Employee.Gen.Mr, 10, 44,6000);
        Employee previousEmpl = employeeService.edit(emlForEdit);

        // RemoveEmp
        Employee removeEmpl = employeeService.remove(3l);


        // Invoke TestCase for Edit Fjnction


        testEditService();

    }

    public void  testEditService() {
        String name = "edit";
        Employee previousEmp = new Employee(3, "TestCase", 20, Employee.Gen.Mr, 10, 44,6000);
        Employee current = employeeService.findEmployeeById(3l);
        theSameEmpoloyee(name,previousEmp,current);
    }


}
