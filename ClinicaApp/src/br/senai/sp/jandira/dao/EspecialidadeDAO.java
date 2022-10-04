package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidade = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }
    
    public static void gravar(Especialidade e) {
        especialidade.add(e);
    }
    
}
