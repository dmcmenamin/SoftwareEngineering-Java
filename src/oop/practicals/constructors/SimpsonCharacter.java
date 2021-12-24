package oop.practicals.constructors;

public class SimpsonCharacter {

    private String name;
    private String catchPhrase;

    public SimpsonCharacter(String name, String catchPhrase) {
        this.setName(name);
        this.setCatchPhrase(catchPhrase);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    @Override
    public String toString() {
        return name + " says " + catchPhrase;
    }
}
