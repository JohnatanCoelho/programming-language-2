package implementacao;

public class Validador {

    public static boolean validar(String tel) {

        // Consecutivos
        for (int i = 0; i < tel.length() - 1; i++) {
            if (tel.charAt(i) == tel.charAt(i + 1)) {
                return false;
            }
        }

        // Soma dos dígitos
        int soma = 0;
        int num = 0;

        for (int i = 0; i < tel.length(); i++) {
            num = Integer.valueOf(tel.charAt(i));
            soma = soma + num;
        }

        if (soma % 2 != 0) {
            return false;
        }

        // Primeiro e último iguais
        if (tel.charAt(0) == tel.charAt(5)) {
            return false;
        }

        return true;
    }
}
