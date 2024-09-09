public class EnigmaInterruptores {
    public static void main(String[] args) {
        boolean[] interruptores = new boolean[3];
        boolean[] lampadas = new boolean[3];
        boolean[] lampadasQuentes = new boolean[3];

        // Passo 1: Ligar o primeiro interruptor e esperar um tempo
        interruptores[0] = true;
        esperar(5); // Espera 5 minutos para a lâmpada esquentar

        // Passo 2: Ligar o segundo interruptor e desligar o primeiro
        interruptores[0] = false;
        interruptores[1] = true;

        // Passo 3: Ir para a sala das lâmpadas e verificar
        lampadas[0] = true; // Lâmpada 1 está acesa
        lampadasQuentes[0] = true; // Lâmpada 1 está quente
        lampadas[1] = true; // Lâmpada 2 está acesa

        // Verificação
        for (int i = 0; i < 3; i++) {
            if (lampadas[i]) {
                if (lampadasQuentes[i]) {
                    System.out.println("Interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + " (quente).");
                } else {
                    System.out.println("Interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + " (fria).");
                }
            } else {
                System.out.println("Interruptor " + (i + 1) + " controla a lâmpada " + (i + 1) + " (desligada).");
            }
        }
    }

    private static void esperar(int minutos) {
        try {
            Thread.sleep(minutos * 60000); // Espera em milissegundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}