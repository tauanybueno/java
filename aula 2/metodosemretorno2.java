public class metodosemretorno2 {
    public static void main(String[] args){
        imprimirDadosDisciplina("Charles");

    }
    //nome é um parametro
    public static void imprimirDadosDisciplina(String nome){
        System.out.println("---------------");
        System.out.println("Programacao Orientada a Objetos");
        System.out.println("Carga horaria: 66 horas");
        System.out.println("Professor: " + nome);
        System.out.println("---------------");
    }
}
