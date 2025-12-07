package practic.interfaces.salaryincompany;

public class TopManager implements Employee{
    private int monthSalary;

    public TopManager(Company company){

        if(company != null) { //проверка объекта company
            int fixSalary = (int) (100000 + Math.random()*20000); // для разнообразия
            if (company.getIncome() > 10_000_000) {
                monthSalary = fixSalary + (150 * fixSalary) / 100;
            } else {
                monthSalary = fixSalary;
            }
        }else {
            System.out.println("Компания не существует!");
        }
    }

    @Override
    public int getMonthSalary() {
        return monthSalary;
    }
}
