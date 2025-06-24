import java.util.Scanner;

public class SistemEscolar {
    public static void main(String[] args) {
        double[] notas = new double[8];  // Corrigido para 8, já que você pede nota 1 a nota 8
        Scanner sc = new Scanner(System.in);

        // Entrada das notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = sc.nextDouble();
        }

        // Cálculo das médias
        double media1Bimestre = (notas[0] + notas[1]) / 2;
        double media2Bimestre = (notas[2] + notas[3]) / 2;
        double media1Semestre = (media1Bimestre + media2Bimestre) / 2;

        double media3Bimestre = (notas[4] + notas[5]) / 2;
        double media4Bimestre = (notas[6] + notas[7]) / 2;
        double media2Semestre = (media3Bimestre + media4Bimestre) / 2;

        double mediaFinal = (media1Semestre + media2Semestre) / 2;

        // Impressão dos resultados
        System.out.println("Bimestre 1: " + media1Bimestre);
        System.out.println("Bimestre 2: " + media2Bimestre);
        System.out.println("Semestre 1: " + media1Semestre);
        System.out.println("Bimestre 3: " + media3Bimestre);
        System.out.println("Bimestre 4: " + media4Bimestre);
        System.out.println("Semestre 2: " + media2Semestre);
        System.out.println("Média Final: " + mediaFinal);

        sc.close();
    }
}