
import br.com.raffael.CarONEM.Cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando a variável para utilzar o Scanner
        Scanner leitura = new Scanner(System.in);

        // Criando um contador inicializado para ser utilizado para a atribuição da opção escolhida pelo usuário
        int opcao = 1;

        // Menu de opções sendo invocado por meio do DO WHILE
        while (true) {
            System.out.print("""
                    ==============================================
                                    -- CarONE-M --
                    ==============================================
                    1) Cadastrar usuário
                    2) Cadastrar uma viagem
                    3) Buscar por carona
                    4) Avaliar uma viagem
                    5) Sair
                    ==============================================
                    ---> Escolha uma opção:
                    """);
            // Atribuindo o valor digitado pelo usuário à variável "opcao"
            opcao = leitura.nextInt();

            // Avaliação do valor da variável "opcao" para verificar a satisfação da condição atribuída
            switch (opcao) {
                case 1: {
                    // Invoca o método que irá inicilizar o cadastro
                    exibirCadastro();
                    break;
                }
                case 2: {
                    // Invoca o método que irá inicializar o método que irá exibir o menu de cadastramento de viagem
                    // exibirCadastroViagem();
                    break;
                }
                case 3: {
                    // Invoca o método que irá buscar a carona solicitada pelo usuário
                    // exibirBuscarCarona();
                    break;
                }
                case 4: {
                    // Invoca o método que irá exibir o formulário de avaliação da viagem
                    // avaliarViagem();
                    break;
                }
                case 5: {
                    // Invoca o método que irá sair do programa
                    // sairPrograma();
                    break;
                }
            }
        }
    }

    public static void exibirCadastro() {

        Cadastro cad = new Cadastro();
        Scanner entrada = new Scanner(System.in);
        pularLinha();
        System.out.println("""
                ==============================================
                                -- Cadastro --
                ==============================================
                """);
        System.out.print("Digite o seu nome: ");
        cad.setNome(entrada.next());
        System.out.print("Digite o seu e-mail: ");
        cad.setEmail(entrada.next());
        System.out.print("Digite a sua data de nascimento: ");
        cad.setDataNascimento(entrada.next());

    }

    public static void pularLinha() {
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }
}

