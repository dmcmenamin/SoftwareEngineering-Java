package oop.practicals.constructors;

public class CartoonApp {

    public static void main(String[] args) {

        SimpsonCharacter bart = new SimpsonCharacter("Bart", "Eat my Shorts!");
        SimpsonCharacter homer = new SimpsonCharacter("Homer", "D'Oh!");
        SimpsonCharacter lisa = new SimpsonCharacter("Lisa", "I'll be in my room");
        SimpsonCharacter nelson = new SimpsonCharacter("Nelson", "HaHa");

        System.out.println(bart);
        System.out.println(homer);
        System.out.println(lisa);
        System.out.println(nelson);

    }

}
