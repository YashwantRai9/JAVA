import java.util.Scanner;

public class assingment_01 {
    public static void main(String args[]){



        //  1 ##### SUM OF NATURAL NUMBER #####

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("enter the natural number:");
//         int x= scanner.nextInt();
//         int y=0;
//         for (int i=1;i<=x;i++){
//             y=y+i;
//         // System.out.println("the sum of natural number is:"+y);
//         }
//         System.out.println("the sum of natural number is:"+y);
//     }
// }



// 2 #### multiplication table ####

// Scanner scanner=new Scanner(System.in);
// System.out.println("enter the number:");
// int x=scanner.nextInt();
// for (int i=1;i<=10;i++){
//     System.out.println(x+" * "+i+" = "+x*i);
// }
//     }
// }



// 3 #### factorial of number ####

// Scanner scanner=new Scanner(System.in);
// System.out.print("enter the number:");
// int x=scanner.nextInt();
// int y=1;

// for (int i=1;i<=x;i++){
//     y=y*i;
//    }
//     System.out.println("the factorial of "+x+" is: "+y);
//     }
// }



//   4 ##### digit count #####

// Scanner scanner=new Scanner(System.in);
// System.out.print("enter the number:");
// int x=scanner.nextInt();
// int y=0;
// int count=0;
// while(x>0){
//     y=x%10;
//     x=x/10;
//      count=count+1;
// }
// System.out.println("digit count="+count);
//     }
// }



// 5 #### sum of digit #####

// Scanner scanner=new Scanner(System.in);
// System.out.print("enter the number:");
// int x= scanner.nextInt();
// int y=0;
// int count=0;
// while(x>0){
//     y=x%10;
//     x=x/10;
//     count=count+y;
// }
// System.out.println("the sum of digit = "+count);
//     }
// }



// 6 ##### palendrome

// Scanner scanner=new Scanner(System.in);
// System.out.println("enter the number:");
// int x= scanner .nextInt();
// int y=0;
// int count=0;
// int p=x;
// while(x>0){
//     y=x%10;
//     x=x/10;
//     count=count*10+y;
// }
// System.out.println(count);
    
//     if (count==p){
//     System.out.println("the number is palendrome");
//     }
//     else{
//     System.out.println("the number is not palendrome");
//     }
//     }
// }


// 7 #####fibonacci serise#####

// Scanner scanner= new Scanner(System.in);
// System.out.println("enter the number:");
// int x= scanner.nextInt();
// int y=0;
// int a=1;
// int c=0;
// for(int i=1;i<=x;i++){
//     System.out.print(y + " ");
//     c=y+a;
//     y=a;
//     a=c;
// }
// System.out.println(c);
//     }
// }



// 8 ##### Prime Number Check #####

// Scanner scanner=new Scanner(System.in);
// System.out.println("enter the number:");
// int x=scanner.nextInt();
// if(x<=1){
//     System.out.println("not a prime no");
//     return;
// }
// for(int i=2;i<=Math.sqrt(x);i++){
//     if(x%i==0){
//         System.out.println("not a prime no");
//         return;
//     }
// }
// System.out.println("prime no");
//     }
// }



// 9 ##### armstrong number #####

// Scanner scanner=new Scanner(System.in);
// System.out.println("enter the number:");
// int x=scanner.nextInt();
// int p=x;
// int y,sum=0;
// int digits = String.valueOf(x).length();
// while(x>0){
//     y=x%10;
//     sum += Math.pow(y, digits);
//     x=x/10;
// }
// if (sum ==p) {
//             System.out.println(p + " is an Armstrong number");
//         } else {
//             System.out.println(p + " is NOT an Armstrong number");
//         }
//     }
// }



// 10  ##### strong number #####

// Scanner scanner=new Scanner(System.in);
// System.out.println("enter the number:");
// int x=scanner.nextInt();
// int p=x;
// int y=0;
// int sum=0;

// while(x>0){
//     int f=1;
//     y=x%10;
//     for(int i=1;i<=y;i++){
//         f=f*i;
//     }
//     sum=sum+f;
//     x=x/10;
// }
// if (sum == p){
//     System.out.println("yes it is a strong number");
// }
// else{
//     System.out.println("no it is not a strong number");
// }
//     }
// }



//  11 ##### pyhogoreous triplet #####

// Scanner scanner=new Scanner(System.in);
// System.out.println("enter the number");
// int x= scanner.nextInt();
// for(int i=1;i<=x;i++){
//     for (int j=i;j<=x;j++){
//         int c= i*i + j*j;
//         int p=(int) Math.sqrt(c);
//         if (p*p==c && p<=x){
//             System.out.println("("+ "a= " + i + ", " +"b="+ j + ", " +"c="+ c + ")");
//         }
//     }
// }
//     }
// }                      




//                                              THANK YOU