public class Main {

    public static void main(String[] agrs){

        //criar o objeto da classe Pessoa
        Pessoa objetoPessoa = new Pessoa();

        //acessar os atributos usando objetoPessoa.
        objetoPessoa.nome = "Maria";
        objetoPessoa.idade = 34;
        objetoPessoa.altura = 1.65;

        /*imprimir os dados
        System.out.println("Nome: " + objetoPessoa.nome);
        System.out.println("Idade: " + objetoPessoa.idade);
        System.out.println("Altura: " + objetoPessoa.altura);*/

        //imprime dados
        System.out.println(objetoPessoa.toString());
    }
}
