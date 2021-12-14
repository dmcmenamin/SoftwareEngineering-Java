package lecture13;

public class Programmer extends StaffMember{

    private String language;

    public Programmer(String firstName, String lastName) {
        super(firstName, lastName);
        this.setLanguage("UNDECLARED");
    }

    public Programmer(String firstName, String lastName, String language) {
        super(firstName, lastName);
        this.setLanguage(language);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "First Name " + this.getFirstName() + " " +
                "Last Name " + this.getLastName() + " " +
                "language " + language +
                "} ";
    }
}
