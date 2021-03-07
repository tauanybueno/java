import java.util.Scanner;

public class ex5 {

    public static void main(String[] args){
        /*faca um metodo que:
        - receba um numero inteiro como parametro
        - retorne true se o numero for par
        - retorne falso se for impar
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n1 = sc.nextInt();

        //armazena o resultado em uma variavel
        boolean resultado = isPar(n1);
        System.out.println(resultado);
        sc.close();

    }

    public static boolean isPar(int numero){
        if (numero % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
