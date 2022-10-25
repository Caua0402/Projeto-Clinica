package br.senai.sp.jandira.model;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.time.LocalDate;
import javax.swing.JTable;

public class PlanoSaude {
    
        private Integer codigo;
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade;
        private static int contador = 99;
        
        
        //Construtores da classe
        public PlanoSaude(String operadora) {
            this.operadora = operadora;
            gerarCodigo();
    }

        public PlanoSaude(String operadora, String categoria, String numero, LocalDate validade) {
            this.categoria = categoria;
            this.numero = numero;
            this.operadora = operadora;
            this.validade = validade;
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
	
	public PlanoSaude() {
		this.quantidade++;
                gerarCodigo();
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setValidade(LocalDate validade) {
		this.validade = validade;
	}

	public LocalDate getValidade() {
		return validade;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
}

 