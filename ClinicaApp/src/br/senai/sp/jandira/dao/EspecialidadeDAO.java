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
    public static void excluir(Integer codigo) {
        
        for (Especialidade e : especialidade) {
            if(codigo == e.getCodigo()){
                especialidade.remove(e);
                break;
            }
        } 
    }
    public static void atualizar(Especialidade correta) {
        
        for(Especialidade e : especialidade) {
            if(correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidade.indexOf(e); 
                especialidade.set(posicao, correta);
            }
        }
    }
}
    

