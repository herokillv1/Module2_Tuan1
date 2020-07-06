import java.util.Scanner;

public class BTHienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        while(true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i=0;i<3;i++){
                        for (int j=0;j<7;j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for(int i=0; i<=5; i++){
                        for(int j=0; j<i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }

                    System.out.println("");

                    for(int i=0; i<=5; i++){
                        for(int j=5; j>i; j--){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    int i,j;
                    for (i=0;i<5;i++){
                        for (j=0;j<5-i;j++){
                            System.out.print("");
                            for (j=0;j<2*i-1;j++){
                                if (j==0||j==2*i-1){
                                    System.out.print("*");
                                }else {
                                    System.out.print("");
                                }
                            }
                        }
                        System.out.println("");
                        if (i==5-1){
                            for (j=0;j<2*5-1;j++){
                                System.out.print("*");
                                break;
                            }
                        }
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
