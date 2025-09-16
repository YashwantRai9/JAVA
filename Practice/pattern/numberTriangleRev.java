import java.util.Scanner;

public class numTriangleRev {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number::");
        int x= scanner.nextInt();
        for (int i=1;i<=x;i++){
            for (int j=1;j<=x-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
