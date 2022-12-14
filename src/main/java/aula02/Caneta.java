package aula02;

import java.util.Scanner;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada = true;
    void status(){
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Está tampada?" + this.tampada);
    }

    boolean rabiscar(){
        if (this.tampada) {
            System.out.println("ERRO! Não posso rabiscar!");
            return false;
        }else {
            System.out.println("Estou Rabiscando");
            return true;
        }

    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

}