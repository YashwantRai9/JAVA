import java .util.Scanner;

public class starRectangle {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number of rows:");
        int x= scanner.nextInt();
//         System.out.println("enter the number of colunms:");
//         int y= scanner.nextInt();
//         for (int i=1; i<=x;i++){
//             for (int j=1;j<=y;j++){
//             System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// for solid square


int y=x;

for (int i=1; i<=x;i++){
            for (int j=1;j<=y;j++){
            System.out.print("* ");
            }
            System.out.println();
        }
    }
}