package lecture12;

public class Company {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setFirstName("Bob");
        employee.setLastName("The Builder");
        employee.setEmployeeNum(123456);
        employee.setDepartment(89);

        System.out.println(employee.toString());

    }

}
