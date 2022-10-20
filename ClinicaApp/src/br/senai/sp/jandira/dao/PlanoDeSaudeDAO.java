
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoSaude> planodesaude = new ArrayList<>();

    public static ArrayList<PlanoSaude> getplanodeDeSaude() {
        return planodesaude;
    }

    public static PlanoSaude get(Integer codigo) {
        for (PlanoSaude e : planodesaude) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void gravar(PlanoSaude e) {
        planodesaude.add(e);
    }

    public static void atualizar(PlanoSaude correta) {

        for (PlanoSaude e : planodesaude) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = planodesaude.indexOf(e);
                planodesaude.set(planodesaude.indexOf(e), correta);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) {

        for (PlanoSaude e : planodesaude) {
            if (codigo == e.getCodigo()) {
                planodesaude.remove(e);
                break;
            }
        }
    }

    //Criar uma lista inicial de especialidade
    public static void criarListaPlanosDeSaude() {
        PlanoSaude e1 = new PlanoSaude("Amil", "Dermatologia", "987688-90",LocalDate.of(2023, 06, 13) );
        PlanoSaude e2 = new PlanoSaude("Amil", "Dermatologia", "987688-90", LocalDate.of(2026, 07, 15));
        

        planodesaude.add(e1);
        planodesaude.add(e2);

 }

    public static DefaultTableModel getPlanoDeSaudeModel() {
        
        String[] titulos = {"Codigo", "Operadora", "Categoria", "Numero", "Validade"};
        
        String[][] dados = new String[planodesaude.size()][5];
        
        int i = 0;
        for (PlanoSaude e : planodesaude){
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getCategoria();
            dados[i][3] = e.getNumero();
            dados[i][4] = e.getCodigo().toString();
            i++;
        
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
        
  }
}
