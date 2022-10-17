package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.Clinica;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class TesteObjetos {

    public static void main(String[] args) {
        
        
        int[] a = {4,5,7,8,9};
        int[] b = new int[4];
        b[0] = 13;
        b[1] = 23;
        b[2] = 63;
        b[3] = 48;
        
        int[][] c = {
            {3,4,5},
            {8,9,2},
            {1,13,45},
            {19,22,43}
        };
        
        String[][] quintanda = {
            {"Banana", "Maçã", "Uva", "Morango"},
            {"Salsicha", "Alface", "Couve", "Pepino", "Pimentão", "Brócolis"},
            {"Abacate", "Tomate", "Jilo", "Abobrinha"},
        };
        
        System.out.println(quintanda[1][4]);
        
        System.out.println(c[2][1]);
        
        System.out.println("----------------------------------------");
        
        Especialidade e1 = new Especialidade("Cardiologia", "Não deixa ter um ataque do coração");
        //e1.setNome("Cardiologia");
        //e1.setDescricao("Não deixa ter um ataque do coração");

        Especialidade e2 = new Especialidade("Gastroenterologia");
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa ficar com dor de barriga");

        Especialidade e3 = new Especialidade("Otorrino", "Cuida do ouvido");

        Especialidade e4 = new Especialidade();
        e4.setNome("Qualquer coisa");
        e4.setDescricao("Parte da medicina estuda as doenças da pele");
        
        Especialidade e5 = new Especialidade();
        e5.setNome("Especialidade 5");
        
        
        EspecialidadeDAO.gravar(e1);
        EspecialidadeDAO.gravar(e2);
        System.out.println("Tamanho ---> " + EspecialidadeDAO.getEspecialidade().size());
        
        
        EspecialidadeDAO.gravar(e3);
        EspecialidadeDAO.gravar(e4);
        System.out.println("TAMANHO ---> " + EspecialidadeDAO.getEspecialidade().size());
        
        System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());
        EspecialidadeDAO.excluir(102);
        System.out.println("TAMANHO ---> " + EspecialidadeDAO.getEspecialidade().size());
        System.out.println("---------------------------");
        
        Especialidade correta = new Especialidade("Dermatologia", "Parte da medicina estuda as doenças da pele");
        EspecialidadeDAO.atualizar(correta);
        System.out.println(EspecialidadeDAO.getEspecialidade(103).getNome());
        
        //Exibir a quantidade de especialidades
        System.out.println("---------------------------");
        System.out.println("Total-----> " + e4.getCodigo());
        
        System.out.println( e1.getCodigo() + "-" + e1.getNome());
        System.out.println( e2.getCodigo() + "-" + e2.getNome());
        System.out.println( e3.getCodigo() + "-" + e3.getNome());
        System.out.println( e4.getCodigo() + "-" + e4.getNome());
        System.out.println( e5.getCodigo() + "-" + e5.getNome());

        ArrayList<Especialidade> especialdade = new ArrayList<>();
        especialdade.add(e1);
        especialdade.add(e2);
        especialdade.add(e3);

        System.out.println(especialdade.size());

        //Imprimir no console o nome das especialidade
        // que estão armazenadas no Arraylist
        System.out.println("--------WHILE--------");
        int i = 0;
        while (i < especialdade.size()) {
            System.out.println(especialdade.get(i).getNome());
            i++;
        }

        //Utilização do for para iteração no Arrarylist
        System.out.println("--------FOR--------");
        for (int x = 0; x < especialdade.size(); x++) {
            System.out.println(especialdade.get(x).getNome());
        }

        //FOR EACH -> para cada
        System.out.println("--------FOR EACH--------");
        for (Especialidade e : especialdade) {
            System.out.println(e.getNome());
        }
        
        //Criar 3 planos de saúde, armazenar em um Arraylist
        //Exibir o nome da operadora de cada um deles
        PlanoSaude d1 = new PlanoSaude("cooperativas médicas");
        PlanoSaude d2 = new PlanoSaude("autogestões");
        PlanoSaude d3 = new PlanoSaude("Vivo");

        System.out.println("--------Plano De Saúde--------");
        ArrayList<PlanoSaude> planoDeSaude = new ArrayList<>();

        PlanoSaude a1 = new PlanoSaude("cooperativas médicas");
        PlanoSaude a2 = new PlanoSaude("autogestões");
        PlanoSaude a3 = new PlanoSaude("Vivo");

        planoDeSaude.add(a1);
        planoDeSaude.add(a2);
        planoDeSaude.add(a3);

        for (PlanoSaude p : planoDeSaude) {
            System.out.println(p.getOperadora());
            System.out.println(PlanoSaude.getQuantidade());
        }

        Clinica.main(args);

        System.out.println("----" + PlanoSaude.getQuantidade());

    }

}
