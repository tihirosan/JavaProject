package practic.interfaces;
public interface Animal {
    default void move(){
        System.out.println("Животное двигается!");
    }
}

