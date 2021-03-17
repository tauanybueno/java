public class Main {

    public static void main(String[] args){
        //instanciar objeto
        Smartphone cel = new Smartphone();

        //inserir dados
        cel.marca = "Apple";
        cel.preco = 7.000;

        cel.ligar();
        System.out.println(cel.toString());

        cel.desligar();
        System.out.println(cel.toString());


    }
}
