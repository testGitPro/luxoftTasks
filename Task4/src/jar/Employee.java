package jar;



public class Employee {
    private long id;
    private String name;
    private int age;
    private Gen gender;
    private double fixedBugs;
    private double defaultBugRate;
    private double salary;

    public Employee(long id, String name, int age, Gen gender, double fixedBugs, double defaultBugRate, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
        this.salary = salary + (fixedBugs*defaultBugRate);
    }

    public Employee createNewEmpl() {
        return new Employee(id, name,age,gender,fixedBugs,defaultBugRate,salary);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gen getGender() {
        return gender;
    }

    public void setGender(Gen gender) {
        this.gender = gender;
    }

    public double getFixedBugs() {
        return fixedBugs;
    }

    public void setFixedBugs(double fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getDefaultBugRate() {
        return defaultBugRate;
    }

    public void setDefaultBugRate(double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", fixedBugs=" + fixedBugs +
                ", defaultBugRate=" + defaultBugRate +
                ", salary=" + salary +
                '}';
    }



    enum Gen{
        Mr,
        Ms
    }


}

