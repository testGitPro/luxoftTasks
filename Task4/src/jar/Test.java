package jar;


public class Test {

    // default func
    public void PassedTestCase(String id) {
        System.out.println("Test case " + id + " passed");
    }

    // default func
    public void FailedTestCase(String id) {
        System.out.println("Test case " + id + " failed");
    }

    public void theSameEmpoloyee(String name, Employee previousEmp, Employee current) {
        if (previousEmp == null && current == null || !current.equals(previousEmp)) {
            FailedTestCase(name);
            return;
        }

        if (current.equals(previousEmp)) {
            PassedTestCase(name);
        }

    }



}