public class Main {

    public static void main(String[] agrs){

        //instanciar objeto da classe aluno
        Aluno aluno1 = new Aluno();

        //iserir dados
        aluno1.nome = "Joao";
        aluno1.RA = 13456789;
        aluno1.N1 = 7.5;
        aluno1.N2 = 4.5;

        System.out.println(aluno1.toString());
    }
}
