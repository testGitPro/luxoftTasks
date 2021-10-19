package jar;


public class EmployeeService {

    private Employee[] employee;

    public EmployeeService(Employee[] employees) {
        this.employee = employees;
    }

    public void printEmployee() {
        for (Employee employee : employee) {
            System.out.println(employee);
        }
    }

    public Employee findEmployeeById(Long id) {
        for (Employee emp : employee) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    public Employee[] findEmployeeByName(String name) {
        int counter = 0;
        for (Employee emp : employee) {
            if (emp.getName().equals(name)) {
                counter++;

            }
        }

        if (counter == 0) {
            return null;
        }

        Employee[] arrayEmp = new Employee[counter];
        int arrayCounter = 0;

        for (Employee emp : employee) {
            if (emp.getName().equals(name)) {
                arrayEmp[arrayCounter] = emp;
                arrayCounter++;

            }

        }
        return arrayEmp;
    }


    public Employee[] sortByName() {
        Employee[] emp = new Employee[employee.length];

        for (int i = 0; i < employee.length; i++) {
            int next = i;
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[next].getName().compareTo(employee[j].getName()) > 0) {
                    next = j;
                }
            }
            Employee tempEmp = employee[i];
            employee[i] = employee[next];
            employee[next] = tempEmp;
        }
        return employee;
    }

    public Employee[] sortBySalary() {
        Employee[] emp = new Employee[employee.length];

        for (int i = 0; i < employee.length; i++) {
            int next = i;
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[next].getSalary() > (employee[j].getSalary())) {
                    next = j;
                }
            }
            Employee tempEmp = employee[i];
            employee[i] = employee[next];
            employee[next] = tempEmp;
        }
        return employee;
    }

    public Employee edit(Employee emlForEdit) {
        Long id = emlForEdit.getId();
        Employee currentEmpSave = findEmployeeById(id);

        for (Employee emp : employee) {
            if (emp.getId() == id) {
                emp = emlForEdit;
                break;

            }


        }
        return currentEmpSave;
    }

    public Employee remove(Long id) {
        Employee[] arrayEmpl = new Employee[employee.length - 1];

        Employee currentEmpForRemove = findEmployeeById(id);
        int counter = 0;

        for (int i = 0; i < employee.length; i++) {
            if(employee[i].getId() == id) {
                continue;
            }
            arrayEmpl[i] = employee[counter++];
        }

        employee = employee;

        return currentEmpForRemove;
    }

}

