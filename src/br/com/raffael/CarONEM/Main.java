
import br.com.raffael.CarONEM.Cadastro;
import br.com.raffael.CarONEM.Passageiro;
import br.com.raffael.CarONEM.Motorista;
import br.com.raffael.CarONEM.Viagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Passageiro passageiro = new Passageiro();
        Motorista motorista = new Motorista();
        Cadastro cad = new Cadastro();
        Viagem viagem = new Viagem();

        menuPrincipal(passageiro, motorista, cad, viagem);
    }

    public static void menuPrincipal(Passageiro passageiro, Motorista motorista, Cadastro cad, Viagem viagem) {
        Scanner menu = new Scanner(System.in);


        System.out.println(cad.getListaPassageiros());

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
                    exibirPerguntaPassageiro(passageiro, motorista, cad, viagem);
                    break;
                }
                case 2: {
                    menuMotorista(passageiro, motorista, cad, viagem);
                    break;
                }
                default: {
                    System.out.println("Opção Inválida.");
                }
            }
        }
    }

    public static void menuPassageiro(Passageiro passageiro, Motorista motorista, Cadastro cad, Viagem viagem) {
        // Criando a variável para utilzar o Scanner
        Scanner menuCliente = new Scanner(System.in);

        // Criando um contador inicializado para ser utilizado para a atribuição da opção escolhida pelo usuário
        int opcao = 1;

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
                    passageiro.exibirCadastro(cad, passageiro, passageiro.getEmail());
                    break;
                }
                case 2: {
                    passageiro.exibirBuscarCarona();
                    break;
                }
                case 3: {

                    break;
                }
                case 4: {
                    // Invoca o método que irá exibir o formulário de avaliação da viagem
                    menuPrincipal(passageiro, motorista, cad, viagem);
                    break;
                }
                case 5: {
                    // Invoca o método que irá sair do programa
                    sairPrograma();
                    break;
                }
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

    public static void loginPassageiro(Passageiro passageiro, Motorista motorista, Cadastro cad, Viagem viagem) {

        Scanner menu = new Scanner(System.in);

        System.out.println("""
                    ==============================================
                                 -- Login Passageiro --
                    ==============================================""");
        System.out.print("Digite o seu e-mail: ");
        String emailLogin = menu.nextLine();
        System.out.println("Digite a senha: ");
        String senhaLogin = menu.next();
        if(cad.verificarLoginPassageiro(emailLogin, senhaLogin) == true) {
            cad.localizaPassageiro(emailLogin);
            menuPassageiro(passageiro, motorista, cad, viagem);
        }
    }


    public static void menuMotorista(Passageiro passageiro, Motorista motorista, Cadastro cad, Viagem viagem) {
        // Criando a variável para utilzar o Scanner
        Scanner menuMotorista = new Scanner(System.in);

        // Criando um contador inicializado para ser utilizado
        // para a atribuição da opção escolhida pelo usuário
        int opcao = 1;

        // Menu de opções
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
            switch (opcao) {
                case 1: {
                    // Invoca o método que irá inicilizar o cadastro
                    motorista.exibirCadastro(motorista);
                    break;
                }
                case 2: {
                    // Invoca o método que irá inicializar o método
                    // que irá exibir o menu de cadastramento de viagem
                    motorista.exibirCadastroViagem(viagem);
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
                    menuPrincipal(passageiro, motorista, cad, viagem);
                    break;
                }
                case 5: {
                    // Invoca o método que irá sair do programa
                    sairPrograma();
                    break;
                }
                default: {
                    System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

    public static void exibirPerguntaPassageiro(Passageiro passageiro, Motorista motorista, Cadastro cad, Viagem viagem){

        Scanner menu = new Scanner(System.in);

        int opcao = 0;

        System.out.print("""
                ==============================================
                       -- Possui conta no CarONE-M ? --
                ==============================================
                Você deseja: Entrar em uma conta existente?
                1) Sim
                2) Não
                ==============================================
                Escolha uma opção: 
                """);
        opcao = menu.nextInt();

        switch (opcao) {
            case 1: {
                if(cad.getListaPassageiros().size() == 0) {
                    System.out.println("Não há contas cadastradas nessa máquina.");
                } else if(cad.getListaPassageiros().size() > 0) {
                    loginPassageiro(passageiro, motorista, cad, viagem);
                }
                break;
            }
            case 2: {
                menuPassageiro(passageiro, motorista, cad, viagem);
            }
        }
    }

    private static void pularLinha() {
        for (int i = 0; i < 20; i++) {
            System.out.println(" ");
        }
    }

    public static void sairPrograma() {
        System.out.println("""
                ==============================================
                          Projeto desenvolvido por: 
                
                          Graziely Severo - 10425431
                           Paulo Andrade - 10420708
                          Raffael Esteves - 10420414
                                 Turma 02J11
                           
                ==============================================
                """);
    }
}
