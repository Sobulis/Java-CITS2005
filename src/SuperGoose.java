class Animal {
    public void talk(){
        System.out.println("Generic animal sounds");
    }
}
class Goose extends Animal {
    public void talk() {
        System.out.println("Honk!");
    }
}
class Cat extends Animal{
    public void talk(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    public void talk(){
        System.out.println("Woof");
    }
}

public class SuperGoose {
    public static void main(String[] args){
        Animal a = new Animal();
        a.talk();
        a = new Goose();
        a.talk();
        a = new Cat();
        a.talk();
        a = new Dog();
        a.talk();
    }
}


