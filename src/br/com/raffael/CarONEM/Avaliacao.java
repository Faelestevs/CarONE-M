import java.util.Scanner;

public class Avaliacao {

    private int nota;
    private String comentario;

    public Avaliacao(int nota, String comentario) {
        this.nota = nota;
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public String getComentario() {
        return comentario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota = lerNota(scanner);
        String comentario = lerComentario(scanner);

        Avaliacao avaliacao = new Avaliacao(nota, comentario);

        exibirAvaliacao(avaliacao);

        scanner.close();
    }

    public static int lerNota(Scanner scanner) {
        int nota;
        do {
            System.out.println("Digite a nota da viagem (de 1 a 5): ");
            nota = scanner.nextInt();
            if (nota < 1 || nota > 5) {
                System.out.println("Por favor, digite uma nota válida (de 1 a 5).");
            }
        } while (nota < 1 || nota > 5);
        return nota;
    }

    public static String lerComentario(Scanner scanner) {
        System.out.println("Digite um comentário (opcional): ");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static void exibirAvaliacao(Avaliacao avaliacao) {
        System.out.println("\nAvaliação:");
        System.out.println("Nota: " + avaliacao.getNota());
        System.out.println("Comentário (Opcional): " + avaliacao.getComentario());
    }
}
