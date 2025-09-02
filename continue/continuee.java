//  IT SKIP AN ITTERATION IN A LOOP

import java.util.Scanner;

public class continue_statment {
    public static void main (String args[]){

//                        ####### PRINT EVEN NUMBERS FROM 1 TO 100 ######
//         for (int i=1;i<=100;i++){
//             if (i%2==1) continue;
//             System.out.println(i);
//         }
//     }
// }

//                         ##### skip multipl of 5 till 30  #####
// System.out.println("the skipped multiple of 5 is :");
// for (int i=1; i<+30;i++){
//     if (i%5==0) continue;
//     System.out.println(i);
// }
//     }
// }

//                    ##### skip prime no.#####

// Scanner Scanner= new Scanner(System.in);
// System.out.println("enter the range:");
// int x= Scanner.nextInt();
for (int i=1;i<100;i++){
    boolean k= i>1;
    for (int j=2;j<= Math.sqrt(i);j++){
           if (i%j==0) {
            k=false;
            break;
           }
    }
    if (k) continue;
    System.out.println(i);
}
    }
}