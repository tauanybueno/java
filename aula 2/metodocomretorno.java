public class metodocomretorno {

    public static void main(String[] args){
       /* receba dois numeros, calcule a soma e me retorne o resultado */

        int primeiroNumero = 2; //inicializei a variavel
        int segundoNumero = 3; // inicializei a variavel

        //o valor da soma vai ser armazenado na variavel resultado
        int resultado = somarNumeros(primeiroNumero, segundoNumero);

        //imprimir a variavel resultado
        System.out.println(resultado);

    }
    //metodo com retorno coloca o tipo de retorno: int, float, boolean
    public static int somarNumeros(int n1, int n2){
        int soma = n1 + n2; //guardar o resultado da soma
        return soma; //retorna um valor
    }




}
