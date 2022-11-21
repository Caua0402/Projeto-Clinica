package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {

    private static final String URL = "C:\\Users\\22282180\\Java\\Medico.txt";
    private static final String URL_TEMP = "C:\\Users\\22282180\\Java\\Medico-temp.txt";
    private static final Path PATH = Paths.get(URL);
    private static final Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medico = new ArrayList<>();

    public static ArrayList<Medico> getMedico() {
        return medico;
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico e : medico) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void gravar(Medico e) {
        medico.add(e);

        //Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getMedicoSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");

        }

    }

    public static void atualizar(Medico correta) {

        for (Medico e : medico) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = medico.indexOf(e);
                medico.set(medico.indexOf(e), correta);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void excluir(Integer codigo) {

        for (Medico e : medico) {
            if (e.getCodigo().equals(codigo)) {
                medico.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        //Passo 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar o arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter bw = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            //Iterar na lista para adicionar as especialidade
            //no arquivo temporário, exceto o registro que
            //não queremos mais
            for (Medico e : medico) {
                bw.write(e.getMedicoSeparadaPorPontoEVirgula());
                bw.newLine();
            }

            bw.close();

            //Excluir o arquivo atual
            arquivoAtual.delete();

            //Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Criar uma lista inicial de especialidade
    public static void criarListaDeMedico() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transforma os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Medico e = new Medico(vetor[1],
                        vetor[2],
                        vetor[3],
                        Integer.valueOf(vetor[0]));

                //Guarda a especialidade na lista
                medico.add(e);

                //Ler a proxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro no arquivo");
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

    public static DefaultTableModel getMedicoModel() {

        String[] titulos = {"Código", "CRM", "MEDICO", "TELEFONE"};

        String[][] dados = new String[medico.size()][3];

        int i = 0;
        for (Medico e : medico) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getCrm();
            dados[i][2] = e.getmedico();
            dados[i][3] = e.getTelefone();
            i++;

        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;

    }

}
