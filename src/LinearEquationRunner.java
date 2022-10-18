import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Please enter a coordinate point (in the form of (x, y)).");
        String firstCoord = scan.nextLine();
        System.out.println("Enter the second coordinate point (in the form of (x, y))!");
        String secondCoord = scan.nextLine();

        int x1 = Integer.parseInt(firstCoord.substring(1, firstCoord.indexOf(",")));
        int y1 = Integer.parseInt(firstCoord.substring(firstCoord.indexOf(" ") + 1, firstCoord.indexOf(")")));
        int x2 = Integer.parseInt(secondCoord.substring(1, secondCoord.indexOf(",")));
        int y2 = Integer.parseInt(secondCoord.substring(secondCoord.indexOf(" ") + 1, secondCoord.indexOf(")")));

        LinearEquation coords = new LinearEquation(x1,y1,x2,y2);

        System.out.println(coords.lineInfo());
        System.out.println("Enter a x value:");
        double xval = scan.nextDouble()        ;
        System.out.println("The coords for your x value are " + coords.coordinateForX(xval));
    }

}
