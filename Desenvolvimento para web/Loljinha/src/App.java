
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Escolha seu companion");
        System.out.println("1 - Vinicius");
        System.out.println("2 - Jori");
        System.out.println("3 - Alex");
        System.out.println("4 - Daniel");
        int resp = input.nextInt();

        switch(resp){
            case 1:
                System.out.println("Boa escolha");
            break;
            case 2:
            System.out.println("Má escolha");
            break;
            case 3:
                System.out.println("Escolha mais ou menos");
            break;
            case 4:
                System.out.println("Excelente escolha");
            break;

        }

        input.close();
    }
}

