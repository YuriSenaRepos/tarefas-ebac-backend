package tarefa_controle_de_fluxo;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        double nota1 = 3.4;
        double nota2 = 9.7;
        double nota3 = 6.8;
        double nota4 = 8.2;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Sua média foi: %.2f \n", media);
        if (media >= 7)
            System.out.println("Aprovado!");
        else if (media >= 5)
            System.out.println("Em recuperação!");
        else
            System.out.println("Reprovado!");
        }
    }

