// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe 
public class App {
    // Método principal que é chamado ao executar o programa
    public static void main(String[] args) {
        // Criação de um Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);

        // Constante para armazenar o valor de PI
        final double PI = 3.14;

        // Solicita ao usuário que insira o raio do círculo
        System.out.print("Digite o raio do círculo: ");

        // Lê o raio inserido pelo usuário
        double raio = leitor.nextDouble();

        // Calcula a área do círculo usando a fórmula: Area = π * raio^2
        double area = PI * raio * raio;

        // Calcula o perímetro do círculo usando a fórmula: Perímetro = 2 * π * raio
        double perimetro = 2 * PI * raio;

        // Exibe os resultados
        System.out.println("Área do círculo: " + area);
        System.out.println("Perímetro do círculo: " + perimetro);

        // Fecha o Scanner
        leitor.close();
    }
}
