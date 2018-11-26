import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getColourFromUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter colour ");
        String colour = scanner.next();
        Colour[] allColours = Colour.values();
        Colour userColour = null;
        for (Colour colourFromArray : allColours) {
            if (colourFromArray.toString().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
            if (colourFromArray.getColourName().equals(colour)) {
                userColour = colourFromArray;
                break;
            }
            System.out.println("yoyr colour is " + colour);
            System.out.println("your colour is" + userColour);
        }
        Animal dog = new Dog("Rex", Colour.BLACK);
    }

    public static Colour getColourFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose colour ");
        Colour[] allColours = Colour.values();
        for (int i = 0; i < allColours.length; i++) {
            System.out.println(i + "-" + allColours[i].getColourName());
        }
        int userColour = sc.nextInt();
        Colour colour = allColours[userColour];
        return colour;
    }
//        Swimmable sw = createSwimmable("dog");
//        sw.swim();
//        Swimmable dog = new Dog();
//        dog.swim();
//        Animal[] zoo = new Animal[3];
//        zoo[0] = new Dog();
//        zoo[1] = new Jiraf();
//        zoo[2] = new Cat();
//        for (Animal animal : zoo) {
//            if (animal instanceof Swimmable) {
//                ((Swimmable) animal).swim();

//            }
//
//        }
//
//    }
//
//    public static Swimmable createSwimmable(String className) {
//        if ("dog".equals(className)) {
//            return new Dog();
//        }
//        return new Cat();

}