public class Dog extends Animal implements Swimmable,Runnable {
    public Dog(String name, Color color) {
        super(name, color);
    }

    public void swim() {
        System.out.println("dog swim");
    }


    public void run() {
        System.out.println("Dog runs");

    }


}

