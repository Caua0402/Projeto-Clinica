
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.sound.midi.Patch;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

public class PlanoDeSaudeDAO {
    
    private static final String URL = "C:\\Users\\22282180\\Java\\PlanoDeSaude.txt"; 
    private static final String URL_TEMP = "C:\\Users\\22282180\\Java\\PlanoDeSaudeTemp.txt"; 
    private static final Path PATH = Paths.get(URL);
    private static final Path PATH_TEMP = Paths.get(URL_TEMP);
    
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
        
        //Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
        escritor.write(e.getPlanoSeparadaPorPontoEVirgula());
        escritor.newLine();
        escritor.close();
            
        } catch (IOException err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
            
        }
        
    }

    public static void atualizar(PlanoSaude correta) {

        for (PlanoSaude e : planodesaude) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = planodesaude.indexOf(e);
                planodesaude.set(planodesaude.indexOf(e), correta);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) {

        for (PlanoSaude e : planodesaude) {
            if (e.getCodigo().equals(codigo)) {
                planodesaude.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }
    
    private static void atualizarArquivo(){
        //Passo 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter assisTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adicionar as especialidade
            //no arquivo temporário, exceto o registro que
            //não queremos mais
            for(PlanoSaude e : planodesaude ){
                assisTemp.write(e.getPlanoSeparadaPorPontoEVirgula());
                assisTemp.newLine();
            }
            
            assisTemp.close();
            
            //Excluir o arquivo atual
            arquivoAtual.delete();
            
            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    //Criar uma lista inicial de especialidade
    public static void criarListaPlanosDeSaude() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            
            while( linha != null){
                //Transforma os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                PlanoSaude e = new PlanoSaude(Integer.valueOf(vetor[0]),
                        vetor[1], vetor[2], vetor[3], vetor[4]);
                
                
                //Guarda a especialidade na lista
                planodesaude.add(e);
                
                //Ler a proxima linha
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro no arquivo");
        }
        
        
        
        
//        PlanoSaude e1 = new PlanoSaude("Amil", "Dermatologia", "(11)98768-6790",LocalDate.of(2023, 06, 13) );
//        PlanoSaude e2 = new PlanoSaude("Amil", "Fisioterapia", "(11)94478-4208", LocalDate.of(2026, 07, 15));
//        
//
//        planodesaude.add(e1);
//        planodesaude.add(e2);

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
            dados[i][4] = e.getFormateDate();
            i++;
        
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
        
  }
}
