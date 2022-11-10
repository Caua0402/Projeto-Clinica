package br.senai.sp.jandira.model;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JTable;

public class PlanoSaude {
    
        private Integer codigo;
	private String operadora;
	private String categoria;
	private String numero;
        private DateTimeFormatter formatador;
        private String formateDate;
	private LocalDate validade;
	private static int quantidade;
        private static int contador = 100;
        
        
        //Construtores da classe
        public PlanoSaude(String operadora) {
            this.operadora = operadora;
            gerarCodigo();
    }

        public PlanoSaude(String operadora, String categoria, String numero, LocalDate validade) {
            
            formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            formateDate =  validade.format(formatador);
            
            this.categoria = categoria;
            this.numero = numero;
            this.operadora = operadora;
            this.validade = validade;
            gerarCodigo();
    }
        
        public PlanoSaude(Integer codigo, String operadora, String categoria, String numero, String validade) {
            
            this.categoria = categoria;
            this.numero = numero;
            this.operadora = operadora;
            this.formateDate = validade;
            this.codigo = codigo;
            this.contador = codigo;
    }
        
        
        // Métodos de acesso aos atributos

        public DateTimeFormatter getFormatador() {
            return formatador;
    }

    public void setFormateDate(String formateDate) {
        this.formateDate = formateDate;
    }

    public String getFormateDate() {
        return formateDate;
    }
        
        
        
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
        
        public String getPlanoSeparadaPorPontoEVirgula(){
            return this.codigo + ";" + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.formateDate;
        }
}

 