package practic.interfaces.example;

public class Amphibious implements Animal,Vehicle {

    //1 вариант: явно задать реализацию
//    @Override
//    public void move() {
//        System.out.println("Это всё движется");
//    }


    //2 вариант: четко указать метод какого интерфейса используется с помощью super
    @Override
    public void move() {
        Animal.super.move();
    }
}
