package practic.interfaces.example;
public interface Animal {
    default void move(){
        System.out.println("Животное двигается!");
    }
}

