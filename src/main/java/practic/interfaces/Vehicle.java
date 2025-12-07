package practic.interfaces;
public interface Vehicle {
    default void move(){
        System.out.println("Транспорт движется!");
    }
}
