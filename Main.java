import java.util.Scanner;

public class Main {
    public static int sEdge;
    public static int sEdgesq;
    public static int lEdge;
    public static int lEdgesq;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\tHypotenuse_Calculation");

        System.out.print("\nPlease enter your SHORT EDGE:\t");
        sEdge= scanner.nextInt();
        sEdgesq =(sEdge*sEdge);

        System.out.print("\nPlease enter your LONG EDGE:\t");
        lEdge= scanner.nextInt();
        lEdgesq =(lEdge*lEdge);

        System.out.println("\n\tHypotenuse =\t"+ Math.sqrt(sEdgesq+lEdgesq));

        System.out.println("\n\tPROGRAM IS OVER");
    }
}