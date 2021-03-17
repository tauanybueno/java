public class Main {

    public static void main(String[] args){

        //instanciar objeto do tipo Lampada
        Lampada lp1 = new Lampada();

        //insere dados
        lp1.marca = "Philips";
        lp1.volts = 110;
        lp1.preco = 25.50;

        lp1.ligar(); //liga a lampada
        System.out.println(lp1.toString());

        lp1.desligar(); //desliga a lampada
        System.out.println(lp1.toString());


    }
}
