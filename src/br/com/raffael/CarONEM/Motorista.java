package br.com.raffael.CarONEM;

import java.util.Scanner;

// A classe Motorista herda tudo que a classe Passageiro possui
// Só que a classe Motorista possui placa e quantidade de lugares

public class Motorista extends Passageiro {

    private int lugaresDisponiveis;
    private String placa;

    public Motorista() {

    }

    public Motorista(String nome, String endereco, String email, String dataNascimento, String senha, boolean verificaCadastro, String placa, double mediaAvaliacoes) {
        super(nome, endereco, email, dataNascimento, senha, verificaCadastro, mediaAvaliacoes);
        this.placa = placa;
    }


    // Sobrescrevendo o método existente na classe Passageiro

    public void exibirCadastro(Motorista motorista) {
        if (!getVerificaCadastro()) {
        Scanner entradaMotorista = new Scanner(System.in);
        System.out.println("""
                    ==============================================
                                    -- Cadastro --
                    ==============================================""");
        System.out.print("Digite o seu nome: ");
        String nome = entradaMotorista.next();
        System.out.print("Digite o seu endereço: ");
        String endereco = entradaMotorista.next();
        System.out.print("Digite o seu e-mail: ");
        String email = entradaMotorista.next();
        System.out.print("Digite a sua data de nascimento: ");
        String dataNascimento = entradaMotorista.next();
        System.out.print("Digite a placa do seu veículo: ");
        String placa = entradaMotorista.next();
        while(placa.length() != 7) {
            System.out.println("Placa digitada é inválida.");
            System.out.print("Digite a placa do seu veículo: ");
            placa = entradaMotorista.next();
        }
        System.out.print("Crie uma senha: ");
        String senha = entradaMotorista.next();
        while (senha.length() < 6) {
            System.out.println("A senha precisa ter no mínimo 6 caracteres.");
            System.out.print("Crie uma senha: ");
            senha = entradaMotorista.next();
        }
            setVerificaCadastro(true);
            mediaAvaliacoes = 5.0;
            adicionarMotorista(new Motorista(nome, endereco, email, dataNascimento, senha, verificaCadastro, placa, mediaAvaliacoes));
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("Você já possui cadastro.");
        }
    }

    // Método que irá realizar o cadastro da viagem
    public void exibirCadastroViagem(Viagem viagem) {
        Scanner novaViagem = new Scanner(System.in);

        System.out.println("""
                ==============================================
                             -- Cadastrar Viagem --
                ==============================================""");
        System.out.println("Lugares disponíveis no veículo (1 a 4): ");
        int lugares = novaViagem.nextInt();
        while(lugares > 4 || lugares <= 0){
            System.out.println("Valor é inválido.");
            System.out.print("Lugares disponíveis no veículo (1 a 4): ");
            lugares = novaViagem.nextInt();
        }
        System.out.println("Adicionando os pontos da viagem:");

        // Serão adicionados os pontos X e Y dos locais e partida e destino
        // Os dados obtidos serão calculados para obter a distância entre o ponto de partida e destino

        int numeroLocais;
        int x = 0;
        int y = 0;
        String end = "";
        // Perguntar ao prof sobre se é possível alterar a variável de instância a cada novo cadastro

        do {
            System.out.print("Quantos locais você quer adicionar? \n");
            numeroLocais = novaViagem.nextInt();
        } while (numeroLocais < 1 || numeroLocais > 4); {
            for (int i = 0; i < numeroLocais; i++) {
                System.out.printf("%dº local: ", i+1);
                System.out.print("Adicione o ponto X do local de partida: ");
                x = novaViagem.nextInt();

                System.out.print("Adicione o ponto Y do local de partida: ");
                y = novaViagem.nextInt();

                System.out.print("Digite o endereço do local: ");
                end = novaViagem.next();

                viagem.adicionarLocal(new Local(x, y, end));
            }
        }

        // Perguntar ao prof se durante como funcionaria a funcionalidade de trajetos, eu vou definir esses trajetos antes mesmo de iniciar o programa?

        // Perguntar ao prof sobre a confirmação de carona, se estamos na perpectiva de passageiro, como que vamos aceitar a corrida como motorista?

        // Essa lista de viagens possíveis, eu escolheria a opção por meio do get(item) do ArrayList?

         // Objeto instanciado para adicionar os dados dos pontos de partida através do construtor


        viagem.exibirViagem();

        // Após perguntar tudo, estamos no caminho certo?

        System.out.println("Viagem cadastrada com sucesso.");
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String toString() {
        {return "Nome: " + getNome() + "\nPlaca do Veículo: " + getPlaca();}
    }
}
