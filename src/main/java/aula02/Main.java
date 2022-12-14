package aula02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();



        c1.cor = "preta";
        c1.ponta = 0.5f;
        c1.modelo = "bic";
        c1.status();
        Papel p1 = new Papel();
        p1.riscado = c1.rabiscar();
        p1.status();
        c1.tampar();
        c1.status();
        c1.rabiscar();

//        System.out.println("Digite a cor da sua caneta");
//        Scanner entrada_cor = new Scanner(System.in);
//        c1.cor = String.valueOf(entrada_cor);
//
//        System.out.println("Digite a espessura da ponta");
//        Scanner entrada_ponta = new Scanner(System.in);
//        c1.ponta = entrada_ponta.nextFloat();
//
//        System.out.println("Digite o modelo");
//        Scanner entrada_modelo = new Scanner(System.in);
//        c1.modelo = entrada_ponta.nextFloat();


    }
}