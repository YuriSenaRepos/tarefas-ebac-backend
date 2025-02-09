import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<String> grupoF = new HashSet();
        Set<String> grupoM = new HashSet();
        String continuar ="";

        do {
            System.out.print("Informe o nome e sexo separado por virgula: ");
            String pessoa = input.nextLine();
            String[] dados = pessoa.split(",");
            if (dados[1].equalsIgnoreCase("F") || dados[1].equalsIgnoreCase("feminino")) {
                grupoF.add(dados[0]);
            } else if (dados[1].equalsIgnoreCase("M") || dados[1].equalsIgnoreCase("masculino")) {
                grupoM.add(dados[0]);
            }
             else System.out.println("Valor incorreto para Sexo, informe por exemplo: (\"F\") \"Feminino\" ou (\"M\") \"Masculino\"");
            System.out.print("Deseja inserir outra pessoa? ");
            continuar = input.nextLine();

        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

            System.out.println("Grupo Feminino: " + grupoF);
            System.out.println("Grupo Masculino: " + grupoM);
    }
}