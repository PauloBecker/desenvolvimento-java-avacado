import java.util.Scanner;
import java.util.stream.IntStream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Scanner tc =  new Scanner(System.in);
//
//
//        String op = "s";
//        int numero =0;
//
//        System.out.println("Digite 'S' se quiser calcular o fatorial \n" +
//                "Digite 'n' para encerrar ");
//        op = tc.nextLine();
//
//
//
//
//            if (op != "n"){
//                while (numero > -1) {
//
//
//                    System.out.println("Informe um número: ");
//                    numero = tc.nextInt();
//
//                    System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
//
//                    System.out.println("Digite 'S' se quiser calcular o fatorial \n" +
//                            "Digite 'n' para encerrar ");
//                    tc.nextLine();
//                    if (op == "n"){
//                        System.out.println("desliga");
//                    }
//                }

//        }
//
//
//        System.out.println("Encerrando o sistema...");

        //Utilizando o serial Stream
        long inicio = System.currentTimeMillis();
        IntStream.range(1,100000).forEach(num -> fatorial(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de exceção Serial :: " + (fim-inicio));

        //Utilizando o parallel Stream
        inicio = System.currentTimeMillis();
        IntStream.range(1,100000).parallel().forEach(num -> fatorial(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de exceção Parallel :: " + (fim-inicio));
    }

    static long fatorial(int num){

        int fat = 1;

        for (int i = 2; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}