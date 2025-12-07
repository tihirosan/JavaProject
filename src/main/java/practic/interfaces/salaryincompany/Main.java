package practic.interfaces.salaryincompany;


import java.util.List;

public class Main {

    public static void main(String[] args){

        Company company = new Company();

        for(int i = 0; i < 80; i++){
            company.hire(new Manager());
        }

        for(int i = 0; i < 10; i++){
            company.hire(new TopManager(company));
        }

        for(int i = 0; i < 180; i++){
            company.hire(new Operator());
        }

        System.out.println("- - - TOP 15 SALARY - - -");
        List<Employee> topListSalary = company.getTopSalaryStaff(15);
        company.printListEmployee(topListSalary);

        System.out.println("- - - LOWEST 30 SALARY - - -");
        List<Employee> lowListSalary = company.getLowestSalaryStaff(30);
        company.printListEmployee(lowListSalary);

        //увольнение 50%
        company.fire50Percent();

        System.out.println("- - - TOP 15 SALARY AFTER FIRE- - -");
        List<Employee> topListSalaryAfterFire = company.getTopSalaryStaff(15);
        company.printListEmployee(topListSalaryAfterFire);

        System.out.println("- - - LOWEST 30 SALARY AFTER FIRE- - -");
        List<Employee> lowListSalaryAfterFire  = company.getLowestSalaryStaff(30);
        company.printListEmployee(lowListSalaryAfterFire);


    }
}

