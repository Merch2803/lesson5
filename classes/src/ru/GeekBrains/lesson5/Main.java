package ru.GeekBrains.lesson5;

public class Main {

    public static void main(String[] args) {
        Employee emp = new Employee("Тоха", "Слесарь", "ToxaSuper@gmail.com",
                123456789, 70000, 28);

        Employee[] emp2 = new Employee[5];
        emp2[0] = new Employee("Гена", "Главный сторож", "Genka@gmail.com", 5349121, 60000, 44);
        emp2[1] = new Employee("Ваня", "Руководитель", "Vanka228@gmail.com", 7777777, 200000, 42);
        emp2[2] = new Employee("Саша", "Секретарь", "AlexaEz@gmail.com", 1313002, 55000, 21);
        emp2[3] = new Employee("Лена", "Бухгалтер", "Lenka@gmail.com", 4720020, 60000,49);
        emp2[4] = new Employee("Кирилл", "Юрист", "Kira332@gmail.com", 4910000, 80000, 39);
        for(int i = 0; i < 5; i++) {
            if(emp2[i].age > 40) {
                emp2[i].allAboutEmployees();
                System.out.println("###########################");
            }
        }
    }
}
