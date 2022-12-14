package aula02;

public class Papel {
    boolean riscado = false;
    void status() {
        if (this.riscado) {
            System.out.println("Este papel está riscado");
        } else {
            System.out.println("Este papel não está riscado");
        }

    }
}
