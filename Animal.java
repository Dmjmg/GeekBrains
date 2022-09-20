package ru.geekbrains.lesson6;

public class Animal {
    public String name;
    int restrictionRun;
    int restrictionSwim;



    public Animal(String name){
        this.name = name;
    }
    public void run(int run, String name ){

        if (run < restrictionRun){
            System.out.println(name + " пробежал "+run+" метров");
        }

    }
    public void swim(int swim, String name ){

        if (swim < restrictionSwim){
            System.out.println(name + " проплыл "+swim+" метров");
        }

    }
}
class Cat extends Animal {
    int restrictionRun = 200;
    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int run, String name) {
        if (run < restrictionRun){
            System.out.println(name + " пробежал "+run+" метров");
        }
    }

    @Override
    public void swim(int swim, String name) {
        System.out.println("Кошки не умеют плавать");
    }
}
class Dog extends Animal {
    int dogCount;
    int restrictionRun = 500;
    int restrictionSwim = 10;

    @Override
    public void run(int run, String name) {
        if (run < restrictionRun){
            System.out.println(name + " пробежал "+run+" меторв");
        }
    }

    @Override
    public void swim(int swim, String name) {
        if (swim < restrictionSwim){
            System.out.println(name + " проплыл "+swim+" меторв");
        }
    }

    public Dog(String name) {

        super(name);
    }



}

class AnimalsApp {
    public static void main(String [] args){
        Dog[] dog = new Dog[4];
        Cat[] cat = new Cat[2];
        cat[0] = new Cat("Маня");
        cat[1] = new Cat("Рыжик");
        dog[0] = new Dog("Бобик");
        dog[1] = new Dog("Шарик");
        dog[2] = new Dog("Джек");
        dog[3] = new Dog("Рой");
        dog[0].run(150, dog[0].name);
        dog[2].run(300, dog[2].name);
        dog[3].swim(5, dog[3].name);
        cat[1].swim(2, cat[1].name);
        cat[0].run(170, cat[0].name);
        System.out.println("Количество собак: "+dog.length+ " Количество кошек: "+cat.length+" Количество животных: "+(dog.length+cat.length));


    }

}