public class Smartphone {

    //atributos
    public String marca;
    public double preco;
    public boolean isLigado;
    public boolean isReiniciando;

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
        return "Marca: " + marca + "\nPreco: " + preco + "\nStatus: " + isLigado;
    }
}
