package br.senai.sp.jandira;

import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoSaude;

public class Clinica {

	public static void main(String[] args) {
		
		//Criar 5 especialidade
		//Cardiologia, otorrinolaringologia
		//Gastroentereologia, fisioterapia
		//Clinico Geral
		
		Especialidade especilidade1 = new Especialidade("Cardiologia");
		especilidade1.setNome("Cardiologia");
		System.out.println("Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração.");
		
		Especialidade especilidade2 = new Especialidade("Otorrinolaringologia");
		especilidade2.setNome("Otorrinolaringologia");
		System.out.println("Otorrinolaringologista é especializado em tratamento de garganta");
		
		Especialidade especilidade3 = new Especialidade("Gastroenterelogia");
		especilidade3.setNome("Gastroenterelogia");
		System.out.println("Gastroenterologia é a especialidade, em varias doenças que afetam a parte do estomago");
		
		Especialidade especilidade4 = new Especialidade("Fisioterapia");
		especilidade4.setNome("Fisioterapia");
		System.out.println("Ajuda nas melhoras dos seus ossos e musculos");
		
		Especialidade especilidade5 = new Especialidade("Clinico  Geral");
		especilidade5.setNome("Clinico  Geral");
		System.out.println("Cuida de tudo");
		
		
		//Criar 2 medicos
		//1 medico Clinico Geral e cardiologista
		//2 medico Fisioterapeuta, Cardiologista e Clinico Geral
		
		Medico medico1 = new Medico();
		medico1.setNome("Gabriel");
		medico1.setTelefone("(11)9875-8909");
		medico1.setEmail("gabriel14@gmail.com");
		medico1.setCrm("5678-7");
		Especialidade[] especialidade1 = {especilidade1, especilidade5};
		medico1.setEspecialidade(especialidade1);
		
		
		Medico medico2 = new Medico();
		medico2.setNome("David");
		medico2.setTelefone("(11)9876-6754");
		medico2.setEmail("davidjk@gmail.com");
		medico2.setCrm("9878-4");
		Especialidade[] especialidade2 = {especilidade1, especilidade4, especilidade5};
		medico2.setEspecialidade(especialidade2);
		
		//Exibir os dados dos 2 medicos 
		//Medico1
		System.out.println("---------------------------");
		System.out.println("Nome do medico: " + medico1.getNome());
		System.out.println("CRM:" + medico1.getCrm());
		System.out.print("Especialidade: ");
		
		int i = 0;
		while (i < medico1.getEspecialidade().length){
			System.out.print(especialidade1[i].getNome() + " ");
			i++;
		}
		
		//Medico2
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("Nome do medico: " + medico2.getNome());
		System.out.println("CRM:" + medico2.getCrm());
		System.out.print("Especialidade: ");
		
		i = 0;
		while (i < medico2.getEspecialidade().length){
			System.out.print(especialidade2[i].getNome() + " ");
			i++;
		}
		
		//Criar 2 Endereços
		//endereço1
		Endereco endereco1 = new Endereco();
		endereco1.setLogradouro("Rua Jacinto");
		endereco1.setNumero("123");
		endereco1.setCidade("Osasco");
		endereco1.setBairro("Jardim Das Flores");
		endereco1.setEstado("São Paulo");
		endereco1.setCep("0987-3456");
		endereco1.setComplemento("Igreja Espirito Santo");
		
		//endereço2
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Av. João de Andrade");
		endereco2.setNumero("45");
		endereco2.setCidade("Osasco");
		endereco2.setBairro("Jardim Das Flores");
		endereco2.setEstado("São Paulo");
		endereco2.setCep("08890-090");
		endereco2.setComplemento("Mercado Car");
		
		//Cria 2 Plano de Saude
		
		//plano1
		PlanoSaude plano1 = new PlanoSaude();
		plano1.setOperadora("cooperativas médicas");
		plano1.setCategoria("Notredame Notrelife");
		plano1.setNumero("980");
		plano1.setValidade(LocalDate.of(2045, 3, 22));
		
		//plano2
		PlanoSaude plano2 = new PlanoSaude();
		plano2.setOperadora("autogestões");
		plano2.setCategoria("Superior");
		plano2.setNumero("678");
		plano2.setValidade(LocalDate.of(2025, 6, 12));
		
		//Criar 2 Paciente
		//Paciente1
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Julia Soares");
		paciente1.setDataNascimento(LocalDate.of(2004, 12, 23));
		paciente1.setRg("098-567-879-0");
		paciente1.setTelefone("(11)9876-8909 ");
		paciente1.setCpf("456-567-989-89");
		paciente1.setPlanoSaude(plano1);
		paciente1.setEndereco(endereco1);
		
		//plano2
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Alexssandro");
		paciente2.setDataNascimento(LocalDate.of(2003, 04, 24));
		paciente2.setRg("987-098-659-0");
		paciente2.setTelefone("(11)9987-6545");
		paciente2.setCpf("356-457-789-12");
		paciente2.setPlanoSaude(plano2);
		paciente2.setEndereco(endereco2);
		
		//Exibir um relatorio com os dados dos paciente
		
		//Paciente1
		System.out.println();
		System.out.println("------Lista de Paciente-----");
		System.out.println("Nome:" + paciente1.getNome());
		System.out.println("Nascimento:" + paciente1.getDataNascimento());
		System.out.println("Tefelfone" + paciente1.getTelefone());
		System.out.println("Cidade:" + paciente1.getEndereco().getCidade());
		System.out.println("Estado:" + paciente1.getEndereco().getEstado());
		System.out.println("Plano de Saude:" + paciente1.getPlanoSaude().getCategoria());
		
		//Paciente2
		System.out.println("---------------------------");
		System.out.println("Nome:" + paciente2.getNome());
		System.out.println("Nascimento:" + paciente2.getDataNascimento());
		System.out.println("Tefelfone" + paciente2.getTelefone());
		System.out.println("Cidade:" + paciente2.getEndereco().getCidade());
		System.out.println("Estado:" + paciente2.getEndereco().getEstado());
		System.out.println("Plano de Saude:" + paciente2.getPlanoSaude().getCategoria());
		
		
		//Agendar para o paciente uma consulta com fisioterapia
		//para o dia 27/09/2023 às 15:45h
		
		//agenda1
		Agenda agenda1 = new Agenda();
		agenda1.setData(LocalDate.of(2023, 9, 27));
		agenda1.setHorario(LocalTime.of(15, 45));
		agenda1.setMedico(medico2);
		agenda1.setEspecialidade(especilidade4);
		agenda1.setPaciente(paciente2);
		
		//agenda2
		Agenda agenda2 = new Agenda();
		agenda2.setData(LocalDate.of(2022, 5, 14));
		agenda2.setHorario(LocalTime.of(11, 30));
		agenda2.setMedico(medico2);
		agenda2.setEspecialidade(especilidade4);
		agenda2.setPaciente(paciente1);
		
		//Exibir a agenda do paciente
		
		System.out.println();
		System.out.println("------Agendamento------");
		System.out.println("Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Sua agenda esta marcada para: " + agenda1.getdataDaConsulta());
		System.out.println("No horario: " + agenda1.getHorario());
		System.out.println("Medico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Plano de Saude: " + agenda1.getPaciente().getPlanoSaude().getOperadora());
		System.out.println("Tefelofone: " + agenda1.getPaciente().getTelefone());
		
		//Paciente2
		System.out.println("------------");
		System.out.println("Paciente: " + agenda2.getPaciente().getNome());
		System.out.println("Sua agenda esta marcada para: " + agenda2.getdataDaConsulta());
		System.out.println("No horario: " + agenda2.getHorario());
		System.out.println("Medico: " + agenda2.getMedico().getNome());
		System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
		System.out.println("Plano de Saude: " + agenda2.getPaciente().getPlanoSaude().getOperadora());
		System.out.println("Tefelofone: " + agenda2.getPaciente().getTelefone());
		
		
		
		
	}
	
}