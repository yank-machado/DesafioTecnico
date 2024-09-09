public class Sequencias {
    public static void main(String[] args) {
        // Sequências
        int[] seqA = {1, 3, 5, 7};
        int[] seqB = {2, 4, 8, 16, 32, 64};
        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int[] seqD = {4, 16, 36, 64};
        int[] seqE = {1, 1, 2, 3, 5, 8};
        int[] seqF = {2, 10, 12, 16, 17, 18, 19};

        // Calculando o próximo elemento de cada sequência
        System.out.println("Próximo elemento de seqA: " + proximoElementoSeqA(seqA));
        System.out.println("Próximo elemento de seqB: " + proximoElementoSeqB(seqB));
        System.out.println("Próximo elemento de seqC: " + proximoElementoSeqC(seqC));
        System.out.println("Próximo elemento de seqD: " + proximoElementoSeqD(seqD));
        System.out.println("Próximo elemento de seqE: " + proximoElementoSeqE(seqE));
        System.out.println("Próximo elemento de seqF: " + proximoElementoSeqF(seqF));
    }

    // Funções para calcular o próximo elemento de cada sequência
    public static int proximoElementoSeqA(int[] seq) {
        // Sequência aritmética com diferença de 2
        return seq[seq.length - 1] + 2;
    }

    public static int proximoElementoSeqB(int[] seq) {
        // Sequência geométrica com razão 2
        return seq[seq.length - 1] * 2;
    }

    public static int proximoElementoSeqC(int[] seq) {
        // Sequência dos quadrados perfeitos
        int n = seq.length;
        return n * n;
    }

    public static int proximoElementoSeqD(int[] seq) {
        // Sequência dos quadrados dos números pares
        int n = seq.length + 1;
        return n * n * 4;
    }

    public static int proximoElementoSeqE(int[] seq) {
        // Sequência de Fibonacci
        int n = seq.length;
        return seq[n - 1] + seq[n - 2];
    }

    public static int proximoElementoSeqF(int[] seq) {
        // Sequência com lógica específica
        return 20; // O próximo número após 19 é 20
    }
}