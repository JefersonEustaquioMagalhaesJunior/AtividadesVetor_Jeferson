import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner atividadevetor = new Scanner(System.in);
        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo12();
        Algoritmo13();
        Algoritmo14();
        Algoritmo15();
        Algoritmo16();
        Algoritmo17();
        Algoritmo18();
        Algoritmo19();
        Algoritmo20();
    }

    private static void Algoritmo1() {
        System.out.println("Algoritmo1");
        Scanner Algoritmo1 = new Scanner(System.in);

        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número: ");
            vetor[i] = Algoritmo1.nextInt();
        }
        System.out.println("Digite os números primos e suas posições: ");

        for (int i = 0; i < 10; i++) {
            int divisores = 0;
            for (int j = 1; j <= vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    divisores = divisores + 1;
                }
            }
            if (divisores == 2) {
                System.out.println("Número: " + vetor[i] + "Posição: " + i);
            }
        }
    }

    private static void Algoritmo2() {
        System.out.println("Algoritmo2");
        Scanner Algoritmo2 = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] resultado = new int[20];
        System.out.println("Digite os 10 números do primeiro vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = Algoritmo2.nextInt();
        }
        System.out.println("Digite os 10 números do segundo vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = Algoritmo2.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            vetor1[i] = resultado[i * 2];
            vetor2[i] = resultado[i * 2 + 1];
        }
        System.out.println("Vetor resultante: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(resultado[i] + " ");
        }
    }

    private static void Algoritmo3() {
        System.out.println("Algoritmo3");
        Scanner Algoritmo3 = new Scanner(System.in);

        int[] vetor = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            vetor[i] = Algoritmo3.nextInt();
            soma = soma + vetor[i];
        }
        System.out.println("Números do vetor: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }
        double media = (double) soma / 10;
        System.out.println("Média: " + media);
    }

    private static void Algoritmo4() {
        System.out.println("Algoritmo4");
        Scanner Algoritmo4 = new Scanner(System.in);

        int[] vetor = new int[20];
        int contador = 0;

        for (int i = 0; i < 20; i++) {
            vetor[i] = Algoritmo4.nextInt();
        }
        System.out.println("Vetor:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }
        for (int i = 0; i < 20; i++) {
            if (vetor[i] == 25) {
                contador = contador + 1;
            }
        }
        if (contador > 0) {
            System.out.println("O número 25 existe no vetor.");
        } else {
            System.out.println("O número 25 não existe no vetor.");
        }
    }

    private static void Algoritmo5() {
        System.out.println("Algoritmo5");
        Scanner Algoritmo5 = new Scanner(System.in);

        int[] vetor = new int[15];
        int indice = -1;

        for (int i = 0; i < 15; i++) {
            vetor[i] = Algoritmo5.nextInt();
        }
        System.out.println("Vetor: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(vetor[i] + " ");
        }
        for (int i = 0; i < 15; i++) {
            if (vetor[i] == 20) {
                indice = i;
                break;
            }
        }
        if (indice != -1) {
            System.out.println("O número 20 está no índice: " + indice);
        } else {
            System.out.println("O número 20 não existe no vetor.");
        }
    }

    private static void Algoritmo6() {
        System.out.println("Algoritmo6");
        Scanner Algoritmo6 = new Scanner(System.in);

        int[] vetor = new int[30];

        for (int i = 0; i < 30; i++) {
            int numero = (int) (Math.random() * 100) + 1;
            vetor[i] = numero;
        }
        System.out.print("Digite um valor: ");
        int valor = Algoritmo6.nextInt();
        int posicao = -1;
        for (int i = 0; i < 30; i++) {
            if (vetor[i] == valor) {
                posicao = i;
                break;
            }
        }
        if (posicao != -1) {
            System.out.println("O valor está no vetor.");
            for (int i = posicao; i < 29; i++) {
                vetor[i] = vetor[i + 1];
            }
            for (int i = 0; i < 29; i++) {
                System.out.print(vetor[i] + " ");
            }
        } else {
            System.out.println("O valor não está no vetor.");
            for (int i = 0; i < 30; i++) {
                System.out.print(vetor[i] + " ");
            }
        }
    }

    private static void Algoritmo7() {
        System.out.println("Algoritmo7");
        Scanner Algoritmo7 = new Scanner(System.in);

        double[] vetor = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = Algoritmo7.nextDouble();
        }
        double maior = vetor[0];
        double menor = vetor[0];
        for (int i = 1; i < 5; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
    }

    private static void Algoritmo8() {
        System.out.println("Algoritmo8");
        Scanner Algoritmo8 = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println("Digite 15 números inteiros: ");
        for (int i = 0; i < 15; i++) {
            A[i] = Algoritmo8.nextInt();
        }
        for (int i = 0; i < 15; i++) {
            B[i] = A[14 - i];
        }
        System.out.println("Vetor A: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("Vetor B: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(B[i] + " ");
        }
    }

    private static void Algoritmo9() {
        System.out.println("Algoritmo9");
        Scanner Algoritmo9 = new Scanner(System.in);

        System.out.print("Digite a quantidade de recibos: ");
        int quantidade = Algoritmo9.nextInt();
        int[] recibos = new int[quantidade];
        int i = 0;

        while (i < quantidade) {
            recibos[i] = i + 1;
            i = i + 1;
        }
        i = 0;
        while (i < quantidade) {
            System.out.println("Recibo número: " + recibos[i]);
            i = i + 1;
        }
    }

    private static void Algoritmo10() {
        System.out.println("Algoritmo10");
        Scanner Algoritmo10 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Algoritmo10.nextInt();
        int[] tabuada = new int[10];
        int i = 0;

        while (i < 10) {
            tabuada[i] = numero * (i + 1);
            i = i + 1;
        }
        i = 0;

        while (i < 10) {
            System.out.println(numero + "x " + (i + 1) + "= " + tabuada[i]);
            i = i + 1;
        }
    }

    private static void Algoritmo11() {
        System.out.println("Algoritmo11");
        Scanner Algoritmo11 = new Scanner(System.in);

        double[] temperaturas = new double[10];
        double soma = 0;
        int i = 0;

        while (i < 10) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = Algoritmo11.nextDouble();
            soma = soma + temperaturas[i];
            i = i + 1;
        }
        double media = soma / 10;
        System.out.println("Temperatura média: " + media);
    }

    private static void Algoritmo12() {
        System.out.println("Algoritmo12");
        Scanner Algoritmo12 = new Scanner(System.in);

        int[] numeros = new int[50];
        for (int i = 0; i < 50; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < 50; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

    private static void Algoritmo13() {
        System.out.println("Algoritmo13");
        Scanner Algoritmo13 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = Algoritmo13.nextInt();
        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            numeros[i] = i + 1;
        }
        for (int i = 0; i < N; i++) {
            int divisores = 0;
            for (int j = 1; j <= numeros[i]; j++) {
                if (numeros[i] % j == 0) {
                    divisores = divisores + 1;
                }
            }
            if (divisores == 2) {
                System.out.println(numeros[i]);
            }
        }
    }

    private static void Algoritmo14() {
        System.out.println("Algoritmo14");
        Scanner Algoritmo14 = new Scanner(System.in);

        System.out.print("Digite o número de etapas: ");
        int quantidade = Algoritmo14.nextInt();
        int[] etapas = new int[quantidade];
        int i = 0;
        int tempoTotal = 0;

        while (i < quantidade) {
            etapas[i] = 1;
            tempoTotal = tempoTotal + etapas[i];
            i = i + 1;
        }
        System.out.println("Tempo total de produção: " + tempoTotal);
    }

    private static void Algoritmo15() {
        System.out.println("Algoritmo15");
        Scanner Algoritmo15 = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int N = Algoritmo15.nextInt();
        int[] fibonacci = new int[N];
        if (N > 0) {
            fibonacci[0] = 0;
        }
        if (N > 1) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < N; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println("Sequência de Fibonacci: ");
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    private static void Algoritmo16() {
        System.out.println("Algoritmo16");
        Scanner Algoritmo16 = new Scanner(System.in);

        int[] respostas = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a resposta " + (i + 1) + ": ");
            respostas[i] = Algoritmo16.nextInt();
        }
        System.out.println("Respostas na ordem inversa: ");
        for (int i = 4; i >= 0; i--) {
            System.out.println(respostas[i]);
        }
    }

    private static void Algoritmo17() {
        System.out.println("Algoritmo17");
        Scanner Algoritmo17 = new Scanner(System.in);

        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = Algoritmo17.nextDouble();
            soma = soma + notas[i];
        }
        double media = soma / 10;
        System.out.println("Média: " + media);
    }

    private static void Algoritmo18() {
        System.out.println("Algoritmo18");
        Scanner Algoritmo18 = new Scanner(System.in);

        double[] temperaturas = new double[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = Algoritmo18.nextDouble();
        }
        double maior = temperaturas[0];
        for (int i = 1; i < 8; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }
        System.out.println("Maior temperatura: " + maior);
    }

    private static void Algoritmo19() {
        System.out.println("Algoritmo19");
        Scanner Algoritmo19 = new Scanner(System.in);

        int[] produtos = {501, 502, 503, 504, 504, 506};

        System.out.print("Digite o código do produto: ");
        int codigo = Algoritmo19.nextInt();
        int produtoencontrado = 0;

        for (int i = 0; i < 6; i++) {
            if (produtos[i] == codigo) {
                produtoencontrado = 1;
            }
        }
        if (produtoencontrado == 1) {
            System.out.println("O produto está no estoque.");
        } else {
            System.out.println("O produto não se encontra no estoque.");
        }
    }

    private static void Algoritmo20() {
        System.out.println("Algoritmo20");
        Scanner Algoritmo20 = new Scanner(System.in);

        double[] precos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = Algoritmo20.nextDouble();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (precos[j] > precos[j + 1]) {
                    double troca = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = troca;
                }
            }
        }
        System.out.println("Em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(precos[i]);
        }
    }
}

