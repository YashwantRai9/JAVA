import java.util.Scanner;

public class properTriangle {
            public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number ::");
    int x= scanner.nextInt();
    for (int i = 1; i <= x; i++) {
        for (int j = 1; j<=x; j++) {
            if (i+j<=x){
                System.out.print(" ");
            }
            else{
                System.out.print(" *");
            }
        }
         System.out.println();
        }
    }
    
}
