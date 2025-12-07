package practic.interfaces.salaryincompany;

public class Manager implements Employee{

    private int monthSalary;
    private int incomeManager; // заработанные менеджером деньги для компании

    public Manager(){
        incomeManager = randomIncome();
        int fixSalary = (int) (80000 + Math.random()*10000); // для разнообразия
        monthSalary = fixSalary + (5 * incomeManager)/100;
    }

    @Override
    public int getMonthSalary() {
        return monthSalary;
    }

    public int randomIncome(){
        return 115000 + (int)(Math.random() * 25000); // от 115 000 до 140 000
    }

}