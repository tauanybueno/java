import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        /*Escreva o metodo exibirMes() que:
        - recebe um numero inteiro como parametro;
        - imprime o mes correspondente ao numero
        Caso o numero recebido nao faca sentido:
        - mostrar uma mensagem de erro
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um mes: ");
        int mes = sc.nextInt();
        sc.close();

        //chama a funcao
        exibirMes(mes);
    }

    public static void exibirMes(int numero){
        switch (numero){
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Valor inesperado");

        }

    }
}
