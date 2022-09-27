package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.Clinica;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;

public class TesteObjetos {

	public static void main(String[] args) {
		
		Especialidade e1 = new Especialidade("Cardiologia", "Não deixa ter um ataque do coração");
		//e1.setNome("Cardiologia");
		//e1.setDescricao("Não deixa ter um ataque do coração");
		
		Especialidade e2 = new Especialidade("Gastroenterologia");
		e2.setNome("Gastroenterologia");
		e2.setDescricao("Não deixa ficar com dor de barriga");
		
		Especialidade e4 = new Especialidade("Otorrino", "Cuida do ouvido");
		
		Especialidade e3 = new Especialidade();
		e3.setNome("Qualquer coisa");
		
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
		for(int x = 0; x < especialdade.size(); x++) {
			System.out.println(especialdade.get(x).getNome());
		}
		
		//FOR EACH -> para cada
		System.out.println("--------FOR EACH--------");
		for(Especialidade e : especialdade) {
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
		
		for(PlanoSaude p : planoDeSaude) {
			System.out.println(p.getOperadora());
			System.out.println(PlanoSaude.getQuantidade());
		}
		
		Clinica.main(args);
		
		System.out.println("----" + PlanoSaude.getQuantidade());
		
		
	}

}
