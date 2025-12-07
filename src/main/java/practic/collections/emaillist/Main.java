package practic.collections.emaillist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        EmailList emailList = new EmailList();

        while (true) {
            System.out.println("Выберите команду");
            System.out.println("ADD");
            System.out.println("LIST");

            String menu = in.nextLine();

            switch (menu) {
                case "ADD" -> {
                    System.out.println("Введите email:");
                    String email = in.nextLine();
                    emailList.add(email);
                }
                case "LIST" -> {
                    System.out.println("Список email:");
                    System.out.println(emailList.getSortedEmailList());

                }

            }

        }


    }
}

