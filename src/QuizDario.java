import java.util.Scanner;
public class QuizDario {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingresa un número entero positivo  ");
            int leer = scanner.nextInt();
            if (leer <= 0) {
                System.out.println(" ingresa un número positivo.");
            } else {
                for (int i = 1; i <= leer; i++) {  
                    for (int j = i; j <= leer; j++) {
                        System.out.print(j + " ");  
                    }
                    for (int j = leer - 1; j >= i; j--) {
                        System.out.print(j + " ");  
                    }
                    System.out.println();
                }
            }
            scanner.close();
        }
    }
    


