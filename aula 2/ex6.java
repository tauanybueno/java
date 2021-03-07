import java.util.Scanner;

public class ex6 {

    public static void main(String[] args){
        /*crie um metodo chamada calculaSomatorio que:
        - recebe como parametro um numero inteiro n
        - calcula a soma dos numeros de 1 ate n
        - retorna a soma dos numero
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num= sc.nextInt();

        //armazena o resultado da soma
        int somatorio = calculaSomatorio(num);
        System.out.println("Soma = " + somatorio);


    }
    public static int calculaSomatorio(int numero){
        int soma = 0; //inicializa a variavel soma
        for (int i = 1; i <= numero; i++){
            soma += i;

        }
        return soma;
    }
}
