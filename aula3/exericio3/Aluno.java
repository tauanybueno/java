public class Aluno {

    //atributos
    public String nome;
    public int RA;
    public double N1;
    public double N2;

    //comportamento - calcular a media final
    public double calcularMedia(){
        return N1 * 0.4 + N2 * 0.6;

    }

    //imprimir dados
    public String toString(){
        return "Nome: " + nome + "\nRA: " + RA + "\nNota N1: " + N1 + "\nNota N2: " + N2 + "\nMedia: " + calcularMedia();
    }
}
