import java.util.Scanner;
public class termometroD {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12;

        do{
            System.out.print("Por favor, insira a temperaura 1 (entre 4° e 10°): ");
            t1 = scanner.nextDouble();
            if (t1 <4 || t1 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");

            }
        }while (t1 <4 || t1 >10);
        do{
            System.out.print("Por favor, insira a temperaura 2 (entre 4° e 10°): ");
            t2 = scanner.nextDouble();
            if (t2 <4 || t2 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t2 <4 || t2 >10);
        do{
            System.out.print("Por favor, insira a temperaura 3 (entre 4° e 10°): ");
            t3 = scanner.nextDouble();
            if (t3 <4 || t3 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t3 <4 || t3 >10);
        do{
            System.out.print("Por favor, insira a temperaura 4 (entre 4° e 10°): ");
            t4 = scanner.nextDouble();
            if (t4 <4 || t4 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t4 <4 || t4 >10);
        do{
            System.out.print("Por favor, insira a temperaura 5 (entre 4° e 10°): ");
            t5 = scanner.nextDouble();
            if (t5 <4 || t5 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t5 <4 || t5 >10);
        do{
            System.out.print("Por favor, insira a temperaura 6 (entre 4° e 10°): ");
            t6 = scanner.nextDouble();
            if (t6 <4 || t6 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t6 <4 || t6 >10);
        do{
            System.out.print("Por favor, insira a temperaura 7 (entre 4° e 10°): ");
            t7 = scanner.nextDouble();
            if (t7 <4 || t7 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t7 <4 || t7 >10);
        do{
            System.out.print("Por favor, insira a temperaura 8 (entre 4° e 10°): ");
            t8 = scanner.nextDouble();
            if (t8 <4 || t8 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t8 <4 || t8 >10);
        do{
            System.out.print("Por favor, insira a temperaura 9 (entre 4° e 10°): ");
            t9 = scanner.nextDouble();
            if (t9 <4 || t9 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t9 <4 || t9 >10);
        do{
            System.out.print("Por favor, insira a temperaura 10 (entre 4° e 10°): ");
            t10 = scanner.nextDouble();
            if (t10 <4 || t10 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t10 <4 || t10 >10);
        do{
            System.out.print("Por favor, insira a temperaura 11 (entre 4° e 10°): ");
            t11 = scanner.nextDouble();
            if (t11 <4 || t11 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t11 <4 || t11 >10);
        do{
            System.out.print("Por favor, insira a temperaura 12 (entre 4° e 10°): ");
            t12 = scanner.nextDouble();
            if (t12 <4 || t12 >10){
                System.out.print("\n*INSIRA UMA TEMPERATURA VALIDA, MAIOR QUE 4° e MENOR QUE 10°. ");
            }
        }while (t12 <4 || t12 >10);

        double media = ((t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12)/12);

        System.out.print("A media de hoje das temperaturas e: " + media + "°C.");

        scanner.close();

    }
}
