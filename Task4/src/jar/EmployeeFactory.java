package jar;

import java.util.Random;

public class EmployeeFactory {
             static public long id = 0;
        static public Employee generateArrayOfEmployee() {
            Random random = new Random();
            String[] AllNames = {"Vova", "Kate", "Victor", "Anatoliy", "Micle"};
            String name = AllNames[random.nextInt(AllNames.length)];
            int age = random.nextInt(20);
            Employee.Gen gen = random.nextBoolean() ? Employee.Gen.Mr : Employee.Gen.Ms;
            double fixedBugs = random.nextInt(23);
            double defaultBugRate = random.nextInt(13);
            double salary =  (Math.round(random.nextDouble() * 1000)) /  100.0;



            return new Employee (id++, name, age, gen, fixedBugs, defaultBugRate, salary);
        }

            static public Employee[] ArrayOfEmployee(int amount) {
                Employee[] employee = new Employee[amount];
                for (int i = 0; i < employee.length; ++i) {
                    employee[i] = generateArrayOfEmployee();

                }
                return employee;
/*

            Employee Vova = new Employee(1, "Vova", 27, Employee.Gen.Mr, 9, 1, 5000);
            Employee Kate = new Employee(2, "Kate", 22, Employee.Gen.Ms, 11, 12, 7000);
            Employee Victor = new Employee(3, "Victor", 29, Employee.Gen.Mr, 4, 48, 6000);
            Employee Anatoliy = new Employee(4, "Anatoliy", 32, Employee.Gen.Mr, 70, 10, 7200);
            Employee Micle = new Employee(5, "Micle", 25, Employee.Gen.Mr, 39, 18, 4950);





            Employee[] employee = {Vova, Kate, Victor, Anatoliy, Micle};

            return employee;


 */
            }
}
