package br.vendemais;
public class Main {

    public static void main(String[] args) {
        System.out.println("Olá! Tintas disponíveis hoje: ");
        Tinta tinta1 = new Tinta();
        tinta1.cadastrarCor("#8b5742");
        tinta1.setCodigo(1);
        tinta1.setNome("Cachorro Caramelo");
        Tinta tinta2 = new Tinta();
        tinta2.cadastrarCor("#47b5ff");
        tinta2.setCodigo(2);
        tinta2.setNome("Azul Chuva");
        System.out.println("O codigo da tinta " + tinta2.getNome() + " é: " + tinta2.getCodigo());
        System.out.println("A cor da tinta " + tinta1.getNome() + " é: " + tinta1.getCor());

        System.out.print("A mais vendida é: ");
        tinta2.imprimirNome();




        }
    }

