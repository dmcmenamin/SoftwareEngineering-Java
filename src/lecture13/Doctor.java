package lecture13;

public class Doctor extends StaffMember {

    public Doctor(String firstName, String lastName, int ward) {
        super(firstName, lastName);
        this.setWard(ward);
    }

    private int ward;

    public int getWard() {
        return ward;
    }

    public void setWard(int ward) {
        this.ward = ward;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                " firstName " + this.getFirstName() +
                " lastName " + this.getLastName() +
                " ward=" + ward +
                '}';
    }
}
