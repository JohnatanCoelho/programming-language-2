package implementacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Leitor {

    public static List<String> lerArquivo(String arquivoEntrada){

        List<String> listTelefone = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(arquivoEntrada))){
            String line;

            while((line = br.readLine()) != null){
                String[] nums = line.split("\\s+");

                for(String n: nums){
                    listTelefone.add(n.trim());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listTelefone;
    }
}
