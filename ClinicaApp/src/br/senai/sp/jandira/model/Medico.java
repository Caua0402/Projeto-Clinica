package br.senai.sp.jandira.model;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Medico {

    private String medico;
    private Especialidade[] especialidades;
    private String telefone;
    private String email;
    private String crm;
    private Integer codigo;
    private static int contador = 99;
    private DateTimeFormatter formatador;
    private String formateDate;
    private LocalDate validade;
    

    public Medico() {
        gerarCodigo();
    }

    public Integer getCodigo() {
        return codigo;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    public int getContador() {
        return contador;
    }

    //Construtores de Classe
    public Medico(String medico, String telefone,String email,
            String crm) {
        
        
        
        this.medico = medico;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        gerarCodigo();

    }

    public Medico(String medico, String telefone,
             String email, Integer codigo) {
        
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        formateDate = validade.format(formatador);
        
        this.medico = medico;
        this.telefone = telefone;
        this.email = email;
        this.codigo = codigo;
        this.contador = codigo;
        this.validade = validade;
    }

    public String getmedico() {
        return medico;
    }

    public void setmedico(String nome) {
        this.medico = medico;
    }

    public Especialidade[] getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(Especialidade[] especialidades) {
        this.especialidades = especialidades;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public String getMedicoSeparadaPorPontoEVirgula(){
        return this.codigo + ";" +
                this.medico + ";" +
                this.telefone + ";" +
                this.email;
    }

}
