package lecture13;

public class Hospital {

    public static void main(String[] args) {

        StaffMember staffMember = new StaffMember("Mary", "Bob");
        Doctor doctor = new Doctor("Harry", "Jones", 12);
        Programmer programmer = new Programmer("Fake", "Programmer", "Assembler");

        System.out.println(doctor.toString());
        System.out.println(programmer.toString());

    }
}
