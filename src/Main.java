import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true , 1)); // true
        System.out.println(shouldWakeUp(false , 2)); // false
        System.out.println(shouldWakeUp(true , 8)); // true
        System.out.println(shouldWakeUp(true , -1)); // true

        System.out.println("---------------");

        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(23,15,42));
        System.out.println(hasTeen(22,23,34));

        System.out.println("---------------");

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false,36));
        System.out.println(isCatPlaying(false,35));

        System.out.println("---------------");



        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter width of rectangle: ");
            double width = scanner.nextDouble();
            System.out.println("Enter height of rectangle: ");
            double height = scanner.nextDouble();
            System.out.println("Area of rectangle: " + area(width,height));
        }catch(Exception ex){
            System.out.println("Invalid Input");
        }

        System.out.println("---------------");

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter radius of circle: ");
            double radius = scanner.nextDouble();
            System.out.println("Area of circle: " + area(radius));
        }catch(Exception ex){
            System.out.println("Invalid Input");
        }
    }

    public static boolean shouldWakeUp(boolean dogSound, int time){
        //Guarding
        if(time < 0 || time>23) return false;
        if(!dogSound) return false;
        return time < 8 || time >= 20;
    }

    public static boolean hasTeen(int... ages){
        for(int age:ages) {
            if (age >= 13 && age <= 19) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature){
        if(isSummer){
            return temperature <= 45 && temperature>=25;
        }
        return temperature <= 35 && temperature>=25;
    }

    public static double area(double width, double height){
        if(width < 0 || height < 0){
            System.out.println("width ve height 0 dan büyük olmalıdır.");
            return -1;
        }
        return width * height;
    }

    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI * radius * radius;
    }

}