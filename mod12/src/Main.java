import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /**
        * Parte 1
        */
        System.out.println("**************Parte 1**************");
        String continuar = "";
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Insira o nome das pessoas separando por virgulas (\",\"): ");
            String pessoa = input.nextLine();
            String[] dados = pessoa.split(",");
            Arrays.stream(dados).sorted().forEach(System.out::println);
            System.out.println("Deseja continuar?");
            continuar = input.nextLine();
        }
        while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

        /**
         * Parte2
         */
        List<String> grupoF = new ArrayList<>();
        List<String> grupoM = new ArrayList<>();
        System.out.println("**************Parte 2**************");

        do{
            System.out.print("Insira o nome das pessoas separando por virgulas (\",\") e o sexo por traços (\"-\"): ");
            String pessoa = input.nextLine();
            String[] dados = pessoa.split(",");
            for (int i = 0; i < dados.length; i++) {
                String nome = dados[i].toString().split("-")[0];
                String sexo = dados[i].toString().split("-")[1];
               if( sexo.equalsIgnoreCase("f") ){
                   grupoF.add(nome);
               }
               if( sexo.equalsIgnoreCase("m") ){
                   grupoM.add(nome);
               }
            }
               grupoF.sort(Comparator.naturalOrder());
               grupoM.sort(Comparator.naturalOrder());
               System.out.println("Grupo Feminino: " + grupoF);
               System.out.println("Grupo Masculino: " + grupoM);
            System.out.println("Deseja continuar?");
            continuar = input.nextLine();
        }
        while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));


    }

}