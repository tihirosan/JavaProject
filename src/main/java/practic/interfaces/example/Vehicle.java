package practic.interfaces.example;
public interface Vehicle {
    default void move(){
        System.out.println("Транспорт движется!");
    }
}
