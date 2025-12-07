package practic.interfaces.salaryincompany;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Company{


    private List<Employee> listEmployes = new ArrayList<>();// список сотрудников
    private int income; // доход компании

    public Company(){
        income = randomIncome();
    }

    //найм сотрудника
    public void hire(Employee employee){
        listEmployes.add(employee);
    }

    //найм списка сотрудников
    public void hireAll(Collection<Employee> employes){
        listEmployes.addAll(employes);
    }
    //увольнение сотрудника
    public void fire(Employee employee){
        listEmployes.remove(employee);
    }

    public void fire50Percent(){

        for(int i = 0; i < listEmployes.size()/2; i++){
            int index = (int) (Math.random() * listEmployes.size());//обновляю размер списка после удаления элемента
            fire(listEmployes.get(index));
        }
    }

    //получение дохода компании
    public int getIncome(){
        return income;
    }

    //генерация дохода компании
    private int randomIncome(){
        return 5000000 + (int)(Math.random() * 25000000); // от 5 000 000 до 30 000 000;
    }

    //список высоких зп
    List<Employee> getTopSalaryStaff(int count){

        if(count > listEmployes.size() || count < 0 ){
            System.out.println("Выход за пределы списка!");
            return null;
        }else {
            List<Employee> sortListEmployee = new ArrayList<>(listEmployes);
            Collections.sort(sortListEmployee);
            Collections.reverse(sortListEmployee);// в порядке убывания

            return sortListEmployee.subList(0,count);
        }

    }


    //список низких зп
    List<Employee> getLowestSalaryStaff(int count){
        if(count > listEmployes.size() || count < 0 ){
            System.out.println("Выход за пределы списка!");
            return null;
        }else {

            List<Employee> sortListEmployee = new ArrayList<>(listEmployes);
            Collections.sort(sortListEmployee);//в порядке возрастания

            return sortListEmployee.subList(0,count);
        }

    }

    public void printListEmployee(List<Employee> employee){
        for(Employee el : employee){
            System.out.println(el.getMonthSalary());
        }
    }


}

