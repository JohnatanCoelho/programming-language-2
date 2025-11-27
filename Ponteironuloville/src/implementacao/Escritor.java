package implementacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escritor {

    public static void escreverArquivo(String arquivoSaida, String conteudo){

        // Escrever o numero válido linha por linha
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoSaida, true))){
            bw.write(conteudo);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
