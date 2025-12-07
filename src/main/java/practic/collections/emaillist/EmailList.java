package practic.collections.emaillist;

import java.util.*;

public class EmailList {

    private List<String> listEmails = new ArrayList<>();


    public void add(String email){
        Scanner in = new Scanner(System.in);
        String regex = "[\\w.-]+@[\\w.-]+\\.[a-z]{2,6}";
        if(!email.matches(regex)){
            System.out.println("Ошибка ввода email!");
        }else{
            listEmails.add(email);
        }

        Set<String> setEmails = new HashSet<>(listEmails);
        listEmails.clear();
        listEmails.addAll(setEmails);

    }

    public List<String> getSortedEmailList(){
        Collections.sort(listEmails);
        return listEmails;
    }
}
