package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private static final String URL = "C:\\Users\\22282180\\Java\\Especialidade.txt";
    private static final String URL_TEMP = "C:\\Users\\22282180\\Java\\Especialidade-temp.txt";
    private static final Path PATH = Paths.get(URL);
    private static final Path PATH_TEMP = Paths.get(URL_TEMP);
           
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static ArrayList<String> especialidadeNomes = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidade() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static void gravar(Especialidade e) {
        especialidades.add(e);

        //Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");

        }

    }

    public static void atualizar(Especialidade correta) {

        for (Especialidade e : especialidades) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(especialidades.indexOf(e), correta);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) {
        
        for (Especialidade e : especialidades) {
                if (e.getCodigo().equals(codigo)) {
                    especialidades.remove(e);
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
            for(Especialidade e : especialidades){
                assisTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
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
    
    public static ArrayList<Especialidade> separarCodigos ( String linha ) {
        String[] vetor = linha.split(";");
        
        int codigoEspecialidade = 6;
        
        ArrayList<Especialidade> codigo = new ArrayList<>();
        while (codigoEspecialidade < vetor.length){
            codigo.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[codigoEspecialidade])));
        }
        return codigo;
    }

    //Criar uma lista inicial de especialidade
    public static void criarListaDeEpecialidade() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transforma os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2],
                        Integer.valueOf(vetor[0]));

                //Guarda a especialidade na lista
                especialidades.add(e);

                //Ler a proxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no arquivo");
        }
        
        

//        Especialidade e1 = new Especialidade("Fisioterapia", "Ajuda você com seus musculos");
//        Especialidade e2 = new Especialidade("Cardiologia", "Cardiologia é a especialidade médica que se ocupa do diagnóstico e tratamento das doenças que acometem o coração bem como os outros componentes do sistema circulatório.");
//        Especialidade e3 = new Especialidade("Otorrino", "O otorrinolaringologista é o médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço.");
//        Especialidade e4 = new Especialidade("Gastroenterologia", "Não deixa ficar com dor de barriga");
//
//        especialidades.add(e1);
//        especialidades.add(e2);
//        especialidades.add(e3);
//        especialidades.add(e4);
    }
    
    public static DefaultListModel<Especialidade> getEspModel(){
        DefaultListModel<Especialidade> especialidadeLista = new DefaultListModel<Especialidade>();
        for (Especialidade percorrer : getEspecialidade()){
            especialidadeLista.addElement(percorrer);
        }
        return especialidadeLista;
    }

    public static DefaultTableModel getEspecialidadeModel() {

        String[] titulos = {"Código", "Nome da Especialidade", "Descrição"};

        String[][] dados = new String[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;

        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }
    
    

}
