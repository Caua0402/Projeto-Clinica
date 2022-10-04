package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {

    private Integer codigo;
    private String nome;
    private String descricao;
    private static int contador = 99;

    //Construtores da classe
    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.descricao = descricao;
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    //Construtor Default/Padão
    public Especialidade() {
        this.contador++;
        this.codigo = contador;
    }

    // Métodos de acesso aos atributos
    public Integer getCodigo() {
        return codigo;
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

}
