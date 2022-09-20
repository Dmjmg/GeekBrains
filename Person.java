package ru.geekbrains.lesson5;


public class Person {
    private String name;
    private String post;
    private String email;
    String phone;
    long salary;
    int age;

    public Person(String name, String post, String email, String phone, long salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public String toString(){
        return this.name+' '+this.post+' '+this.email+' '+this.phone+' '+this.salary+' '+this.age;
    }


    public static void main(String [] args){
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 50000, 30);
        persArray[1] = new Person("Andreev Andrey", "sawdust", "and@mailbox.com", "892312312", 25000, 23);
        persArray[2] = new Person("Denisov Denis", "otk", "den@mailbox.com", "892312312", 40000, 20);
        persArray[3] = new Person("Sergeev Sergey", "accountant", "serg@mailbox.com", "892312312", 40000, 45);
        persArray[4] = new Person("Mihailov |Mihail", "Engineer", "mih@mailbox.com", "892312312", 50000, 50);
        for (int i = 0; i<persArray.length; i++){
            if (persArray[i].age>40) System.out.println(persArray[i]);
        }


    }

}
