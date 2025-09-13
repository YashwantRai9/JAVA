import java.util.Scanner;
public class squarenumber {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
        System.out.println("enter the number:");
        int x= scanner.nextInt();
        int y=x;

for (int i=1; i<=x;i++){
            for (int j=1;j<=y;j++){
            System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


//  for same no print


// for (int i=1; i<=x;i++){
//             for (int j=1;j<=y;j++){
//             System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }
