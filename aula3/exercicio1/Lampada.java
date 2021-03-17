public class Lampada {
    //atributos
    public String marca;
    public int volts;
    public double preco;
    public boolean isLigado;

    //acoes
    //1 - ligar
    public boolean ligar(){
        isLigado = true;
        return isLigado;
    }

    //2 - desligar
    public boolean desligar(){
        isLigado = false;
        return isLigado;
    }

    //imprimir dados
    public String toString(){
        return "Marca: " + marca + "\nVolts: " + volts + "\nPreco: " + preco + "\nStatus: " + isLigado;
    }

}
