public class ex4 {

    public static void main(String[] args){
        /* criar um método chamado encontrarMax() que: recebe 2 parametros
        do tipo int; retorna o maior valor entre dois números
         */

        //armazena o resultado de maiorValor em uma variavel
        int resultado = encontrarMax(23, 55);

        //imprime resultado
        System.out.println(resultado);
    }

    public static int encontrarMax(int n1, int n2){
        int maiorValor;
        if(n1 > n2){
            maiorValor = n1;
        }else{
            maiorValor = n2;
        }
        return maiorValor;
    }
}
