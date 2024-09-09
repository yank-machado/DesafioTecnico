public class ContarLetraA {
    public static void main(String[] args) {
        String texto = "Aqui está um exemplo de string com várias letras A e a.";
        int contador = 0;

        // Converte a string para minúscula para contar 'A' e 'a' juntos
        texto = texto.toLowerCase();

        // Percorre cada caractere da string
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        // Exibe o resultado
        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes.");
        } else {
            System.out.println("A letra 'a' não foi encontrada.");
        }
    }
}