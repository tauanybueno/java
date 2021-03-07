import java.util.Scanner;

public class metodosemretorno4 {

    public static void main(String[] args){
        //pedir ao usuario o nome do professor
        Scanner sc = new Scanner(System.in); //capturar tudo que e digitado pelo teclado
        System.out.println("Informe o nome do professor: ");

        //armazena o nome digitado na variavel
        String nomeProfessor = sc.next();

        //chama a funcao e passa como parametro a variavel nomeProfessor
        imprimirDadosDisciplina(nomeProfessor);
        sc.close(); //encerra a captura de teclado


    }

    public static void imprimirDadosDisciplina(String nome){
        System.out.println("---------------");
        System.out.println("Programacao Orientada a Objetos");
        System.out.println("Carga horaria: 66 horas");
        System.out.println("Professor: " + nome);
        System.out.println("---------------");

    }
}
