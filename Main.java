import java.util.Scanner;

public class Main {



    public static void main(String args[]) {

        // operator_Selection operator_selection = new operator_Selection();
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Please Enter your first Number: ");
        // operator_selection.setFirst_Num(scanner.nextInt());

        // System.out.println("Please Enter your Second Number: ");
        // operator_selection.setSecond_Num(scanner.nextInt());

        // System.out.println("Please Select an Operation: ");
        // operator_selection.setOperator(scanner.next().charAt(0));

        // operator_selection.see_Result();


    //    int a = 7;
    //    int sum = a%2;
    //    System.out.println(sum);
    //    System.out.println(sum == 0);

        int sum = 0;

        for(int i = 9; i <= 470; i++) {
            if(i%2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
//        Product product1 = new Product();
//        Laptop laptop1 = new Laptop();
//
//        product1.setProduct(101, "Pova", 6000);
//        product1.getProduct();
//        laptop1.setProduct(201, "Lenovo", 33000, 8, "Windows 10 Pro", "Intel Core i5-33989", 1000);
//        laptop1.getProduct();
    }

    public static Integer xyz(int a , int b) {
        a += 10;
        b += 20;
        return null;
    }
}
