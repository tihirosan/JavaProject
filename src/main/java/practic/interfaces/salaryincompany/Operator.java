package practic.interfaces.salaryincompany;

public class Operator implements Employee{
    private int monthSalary;

    public Operator(){
        monthSalary = (int) (60000 + Math.random()*10000); // для разнообразия
    }
    @Override
    public int getMonthSalary() {
        return monthSalary;
    }


}
