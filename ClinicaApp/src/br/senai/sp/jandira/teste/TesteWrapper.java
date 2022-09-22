package br.senai.sp.jandira.teste;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrapper {

	public static void main(String[] args) {
	
		int a = 5;
		
		Integer b = 5;
		
		Double x = 2.0;
		
		ArrayList<Especialidade> especialidade = new ArrayList<>();
		
		Especialidade e1 = new Especialidade("Cardiologia", "Não deixa ter um ataque do coração");
//		e1.setNome("Cardiologia");
//		e1.setDescricao("Não deixa ter um ataque do coração");
		
		Especialidade e2 = new Especialidade("Gastroenterologia", "Não deixa ficar com dor de barriga");
//		e2.setNome("Gastroenterologia");
//		e2.setDescricao("Não deixa ficar com dor de barriga");
		
		especialidade.add(e1);
		especialidade.add(e2);
		
		
		Especialidade e3 = new Especialidade("Fisíoterapia");
//		e3.setNome("Fisíoterapia");
		e3.setDescricao("Não deixa você ter dores");
		
		especialidade.add(e3);
		
		Especialidade e4 = new Especialidade("Clínico Geral");
//		e4.setNome("Clínico Geral");
		e4.setDescricao("Sabe de tudo");
		
//		Especialidade[] especialidade = {e1, e2, e3, e4};
		
		Especialidade e5 = new Especialidade("Pediatria");
//		e5.setNome("Pediatria");
		e5.setDescricao("Cuida das crianças");
		
		especialidade.add(e4);
		especialidade.add(e5);
		
		System.out.println(especialidade.size());
		
		
		ArrayList<Integer> notas  = new ArrayList<>();
		notas.add(50);
		notas.add(23);
		notas.add(45);
		notas.add(57);
		System.out.println(notas.size());
		
		notas.add(67);
		notas.add(34);
		
		System.out.println(notas.size());
		
		//Queremos ver o nome da especialidade que está
		// na posição 3 do arraylits especialidade
		
		System.out.println(especialidade.get(3).getNome());
		
		
		//Trocar o nome da especialidade que está
		//na posição 1 do arraylist esecialidades
		//paa "teste", exibir logo em seguida
		
		especialidade.get(1).setNome("teste");
		System.out.println(especialidade.get(1).getNome());
		
		Especialidade nova = especialidade.get(2);
		System.out.println(nova.getNome());
		
		Especialidade xy = new Especialidade("Nome", "");
//		System.out.println(xy.getNome());
//		System.out.println(xy.getDescricao());
		
		

	}

}
