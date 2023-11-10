package br.vendemais;

/**
 *
 * @author yuri
 */
public class Tinta {
    private int codigo;

    private String nome;

    private String cor;

    /**
     *
     * Getters and setters
     */

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     *
     * @param cor String que cadastra a cor em hexadecimal
     */
    public void cadastrarCor(String cor){
        setCor(cor);
    }

    /**
     * @return nome -  valor da variavel nome
     */
    public void imprimirNome(){
        System.out.println(this.nome);
    }


}
