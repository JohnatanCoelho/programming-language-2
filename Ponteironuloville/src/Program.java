import implementacao.Escritor;
import implementacao.Leitor;
import implementacao.Validador;

import java.util.List;

public class Program {

    public static void main(String[] args) {

        String fileInput = "src/arquivos/telefone.txt";
        String fileOutput = "src/arquivos/valido.txt";

        List<String> telefones = Leitor.lerArquivo(fileInput);

        int totalTelefone = telefones.size();
        int totalValido = 0;

        // Escrevendo os telefones válidos no arquivo
        for (String tel : telefones) {
            if (Validador.validar(tel)) {
                Escritor.escreverArquivo(fileOutput, tel);
                totalValido++;
            }
        }

        String finalTotal = "Total1: " + telefones.size() + "| Total2:" + totalValido;
        Escritor.escreverArquivo(fileOutput, finalTotal);

    }
}

