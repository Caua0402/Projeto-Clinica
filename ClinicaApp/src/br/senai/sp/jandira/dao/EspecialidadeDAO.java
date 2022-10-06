package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {

        private static ArrayList<Especialidade> especialidade = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }
    public static Especialidade getEspecialidade(Integer codigo) {
        for(Especialidade e : especialidade){
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }
    public static void gravar(Especialidade e) {
        especialidade.add(e);
    }
    
    public static void atualizar(Especialidade correta) {
        
        for(Especialidade e : especialidade) {
            if(correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidade.indexOf(e); 
                especialidade.set(posicao, correta);
            }
        }
    }
    
    public static void excluir(Integer codigo) {
        
        for (Especialidade e : especialidade) {
            if(codigo == e.getCodigo()){
                especialidade.remove(e);
                break;
            }
        } 
    }
    
    //Criar uma lista inicial de especialidade
    public static void criarListaDeEpecialidade() {
        Especialidade e1 = new Especialidade("Fisioterapia", "Ajuda você com seus musculos");
        Especialidade e2 = new Especialidade("Cardiologia", "Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças que acometem o coração bem como os outros componentes do sistema circulatório.");
        Especialidade e3 = new Especialidade("Otorrino", "O otorrinolaringologista é o médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço.");
        Especialidade e4 = new Especialidade("Gastroenterologia", "Não deixa ficar com dor de barriga");
        
        especialidade.add(e1);
        especialidade.add(e2);
        especialidade.add(e3);
        especialidade.add(e4);
        
    }
    
    
    
}
    

