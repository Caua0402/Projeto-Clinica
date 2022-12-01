package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private Integer codigo;
    private String nome;
    private String descricao;
    private static int contador = 100;
    

    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        gerarCodigo();
    }

    public Especialidade(String nome, String descricao) {
        this.descricao = descricao;
        this.nome = nome;
        gerarCodigo();
    }
    
    public Especialidade(String nome, String descricao, Integer codigo) {
        this.descricao = descricao;
        this.nome = nome;
        this.codigo = codigo;
        this.contador = codigo;
    }

    //Construtor Default/Padão
    public Especialidade() {
        gerarCodigo();
    }

    // Métodos de acesso aos atributos
    public Integer getCodigo() {
        return codigo;
    }

    private void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }
    
    public void setNome(String nome) {

        if (nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null,
                    "O nome da especialidade (''" + nome + "'') deve ter ao menos 3 letras!", "Nome Inválido",
                    JOptionPane.WARNING_MESSAGE, null);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        if (descricao.length() >= 10) {
            this.descricao = descricao;
        } else {
            JOptionPane.showMessageDialog(null, "A descrição é muito pequena!\nDeve ter ao menos 10 caracteres!", "Descrição Inválida",
                    JOptionPane.WARNING_MESSAGE, null);
        }
    }

    public String getDescricao() {
        return descricao;
    }
    
    public String getEspecialidadeSeparadaPorPontoEVirgula(){
        return this.codigo + ";" + this.nome + ";" + this.descricao;
    }
    
    public String toString(){
        return nome;
    }

}
