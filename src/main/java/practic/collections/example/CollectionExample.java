package practic.collections.example;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {

        //List - допускает повторения; упорядоченный список элементов, сохраняется порядок добавления
        List<String> names = new ArrayList<>(); // работает на базе массивов. при достижении переполнения данных в массиве - создаёт массив больше и делает копию
        //быстрый доступ к элементам по индексу
        // при больших данных добавление элемента в список затратно, так как все элементы должны сдвинуться
        names.add("Паша");
        names.add("Настя");
        names.add("Маша");
        names.add("Паша");
        System.out.println(names);


        List<String> years = new LinkedList<>();// представляет собой двусвязный список, почти не используется
        //обращение по индексу затратное
        //добавление в список не затратное
        years.add("1976");
        years.add("1789");
        years.add("2025");
        years.add("1999");
        System.out.println(years);

        //Set - набор уникальных неупорядоченных элементов
        Set<String> animals = new HashSet<>(); // хэштаблица, у каждого элемента есть свой ключ
        animals.add("Корова");
        animals.add("Мышь");
        animals.add("Слон");
        animals.add("Корова");

        System.out.println(animals);

        Set<String> city = new LinkedHashSet<>();//создаёт упорядоченный набор, сохраняется порядок добавления
        city.add("Москва");
        city.add("Владимир");
        city.add("Ярославль");
        city.add("Тихорецк");
        System.out.println(city);


        Set<String> cars = new TreeSet<>();//создаёт отсортированный по возрастанию набор
        cars.add("Ауди");
        cars.add("БМВ");
        cars.add("УАЗ");
        cars.add("Лада");
        System.out.println(cars);

        //Map - коллекция ключ-значение, говорят "мапа"

        Map<String,Integer> animalsID = new HashMap();//самый быстрый
        animalsID.put("Корова",1);
        animalsID.put("Мышь",2);
        animalsID.put("Слон",3);
        animalsID.put("Корова",5);

        System.out.println(animalsID);
        System.out.println(animalsID.containsValue(5));
        System.out.println(animalsID.keySet());
        System.out.println(animalsID.values());


        Map<String,Integer> namesID = new LinkedHashMap<>();//упорядочивает в порядке добавления
        namesID.put("Настя",1);
        namesID.put("Маша",2);
        namesID.put("Паша",3);
        namesID.put("Паша",6);

        System.out.println(namesID);

        Map<String,Integer> citiesID = new TreeMap<>();//сортирует в порядке возрастания
        citiesID.put("Москва",1);
        citiesID.put("Владимир",2);
        citiesID.put("Ярославль",3);
        citiesID.put("Тихорецк",4);

        System.out.println(citiesID);

    }
}

