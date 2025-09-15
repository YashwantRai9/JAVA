public class starPlus {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter the number (only odd):");
    int x= scanner.nextInt();
    int y= (x/2)+1;
    for (int i = 1; i <= x; i++) {
        for (int j = 1; j<=x; j++) {
            if (i==y || j==y){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
         System.out.println();
        }
    }
    
}