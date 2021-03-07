import java.util.Scanner;

public class ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        //armazenar numero em uma variavel
        int n = sc.nextInt();

        //chamar funcao
        imprimirSequencia(n);

        sc.close();
    }

    public static void imprimirSequencia(int numero){
        for (int i = 1; i <= numero; i++){
            System.out.print(i + " ");
        }
    }
}
