public class Pessoa {

    //atributos
    String nome;
    int idade;
    double altura;

    //os metodos de um objeto nao possuem static
    //metodo toString() para imprimir dados de um objeto
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura;
    }
}
