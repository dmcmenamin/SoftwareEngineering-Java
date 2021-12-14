package lecture12;

public class Employee {

    private String firstName;
    private String lastName;
    private int department;
    private int employeeNum;
    private double salary;

    public Employee() {
        System.out.println("Default Constructor Called");
    }

    public Employee(String firstName, String lastName, int department, int employeeNum, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.employeeNum = employeeNum;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(int employeeNum) {
        this.employeeNum = employeeNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", employeeNum=" + employeeNum +
                ", salary=" + salary +
                '}';
    }
}
