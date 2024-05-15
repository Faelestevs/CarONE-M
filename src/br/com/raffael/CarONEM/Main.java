
import br.com.raffael.CarONEM.Cadastro;
import br.com.raffael.CarONEM.Local;
import br.com.raffael.CarONEM.Passageiro;
import br.com.raffael.CarONEM.Motorista;
import br.com.raffael.CarONEM.Viagem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();

    }


    public static void menuPrincipal() {
        Scanner menu = new Scanner(System.in);

        int opcao = 1;

        while (true) {
            System.out.print("""
                    ==============================================
                               -- Bem-Vindo CarONE-M --
                    ==============================================
                    1) Perfil Passageiro
                    2) Perfil Motorista
                    ==============================================
                    ---> Escolha uma opção:
                    """);
            // Atribuindo o valor digitado pelo usuário à variável "opcao"
            opcao = menu.nextInt();

            switch (opcao) {
                case 1: {
                    menuPassageiro();
                    break;
                }
                case 2: {
                    menuMotorista();
                    break;
                }
                default: {
                    System.out.println("Opção Inválida.");
                }
            }
        }
    }

    public static void menuPassageiro() {
        // Criando a variável para utilzar o Scanner
        Scanner menuCliente = new Scanner(System.in);

        // Criando um contador inicializado para ser utilizado para a atribuição da opção escolhida pelo usuário
        int opcao = 1;

        Passageiro passageiro = new Passageiro();
        // Menu de opções sendo invocado por meio do DO WHILE
        while (true) {
            System.out.print("""
                    ==============================================
                                    -- CarONE-M --
                                   -- Passageiro --
                    ==============================================
                    1) Cadastrar usuário
                    2) Buscar por carona
                    3) Avaliar uma viagem
                    4) Trocar Perfil
                    5) Sair
                    ==============================================
                    ---> Escolha uma opção:
                    """);
            // Atribuindo o valor digitado pelo usuário à variável "opcao"
            opcao = menuCliente.nextInt();

            // Avaliação do valor da variável "opcao" para verificar a satisfação da condição atribuída


            switch (opcao) {
                case 1: {
                    // Invoca o método que irá inicilizar o cadastro
                    passageiro.exibirCadastro();
                    break;
                }
                case 2: {
                    // Invoca o método que irá inicializar o método que irá exibir o menu de cadastramento de viagem
                    // exibirBuscarCarona();
                    break;
                }
                case 3: {
                    // Invoca o método que irá buscar a carona solicitada pelo usuário

                    break;
                }
                case 4: {
                    // Invoca o método que irá exibir o formulário de avaliação da viagem
                    menuPrincipal();
                    break;
                }
                case 5: {
                    // Invoca o método que irá sair do programa
                    // sairPrograma();
                    break;
                }
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

    public static void menuMotorista() {
        // Criando a variável para utilzar o Scanner
        Scanner menuMotorista = new Scanner(System.in);

        // Criando um contador inicializado para ser utilizado
        // para a atribuição da opção escolhida pelo usuário
        int opcao = 1;

        // Menu de opções sendo invocado por meio do DO WHILE
        while (true) {
            System.out.print("""
                    ==============================================
                                    -- CarONE-M --
                                   -- Motorista --
                    ==============================================
                    1) Cadastrar usuário
                    2) Cadastrar nova viagem
                    3) Avaliações
                    4) Trocar Perfil
                    5) Sair
                    ==============================================
                    ---> Escolha uma opção:
                    """);
            // Atribuindo o valor digitado pelo usuário à variável "opcao"
            opcao = menuMotorista.nextInt();

            // Avaliação do valor da variável "opcao" para
            // verificar a satisfação da condição atribuída

            Motorista motorista = new Motorista();
            switch (opcao) {
                case 1: {
                    // Invoca o método que irá inicilizar o cadastro
                    motorista.exibirCadastro();
                    break;
                }
                case 2: {
                    // Invoca o método que irá inicializar o método
                    // que irá exibir o menu de cadastramento de viagem
                    motorista.exibirCadastroViagem();
                    break;
                }
                case 3: {
                    // Invoca o método que irá buscar a carona
                    // solicitada pelo usuário
                    // exibirAvaliacoes();
                    break;
                }
                case 4: {
                    // Invoca o método que irá exibir o formulário
                    // de avaliação da viagem
                    menuPrincipal();
                    break;
                }
                case 5: {
                    // Invoca o método que irá sair do programa
                    // sairPrograma();
                    break;
                }
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

    private static void pularLinha() {
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }
}
