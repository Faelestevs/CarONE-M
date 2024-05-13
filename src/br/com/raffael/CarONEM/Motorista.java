package br.com.raffael.CarONEM;


import java.util.ArrayList;
import java.util.Scanner;

// A classe Motorista herda tudo que a classe Passageiro possui
// Só que a classe Motorista possui placa e quantidade de lugares
public class Motorista extends Passageiro {

    private String placa;
    private int lugaresDisponiveis;

    // Sobrescrevendo o método existente na classe Passageiro

    @Override
    public void exibirCadastro() {

        Scanner entradaMotorista = new Scanner(System.in);
        System.out.println("""
                    ==============================================
                                    -- Cadastro --
                    ==============================================""");
        System.out.print("Digite o seu nome: ");
        String nome = entradaMotorista.next();
        System.out.print("Digite o seu e-mail: ");
        String email = entradaMotorista.next();
        System.out.print("Digite a sua data de nascimento: ");
        String dataNascimento = entradaMotorista.next();
        System.out.print("Digite a placa do seu veículo: ");
        String placa = entradaMotorista.next();
        while(placa.length() != 7) {
            System.out.println("Placa digitada é inválida.");
            placa = entradaMotorista.next();
        }
        System.out.print("Crie uma senha: ");
        String senha = entradaMotorista.next();
        while (senha.length() < 6) {
            System.out.println("A senha precisa ter no mínimo 6 caracteres.");
            System.out.print("Crie uma senha: ");
            senha = entradaMotorista.next();
        }

        // Perguntar ao prof o motivo do verificador de cadastro não estar funcionando,
        // impossibilitando que limite o acesso as outras opções
        // Além de não estar sendo possível impedir o cadastro novamente do usuário nesta opção

        setVerificaCadastro(true);

        if (!getVerificaCadastro()) {
            Cadastro cad = new Cadastro();
            cad.setNome(nome);
            cad.setEmail(email);
            cad.setDataNascimento(dataNascimento);
            setPlaca(placa);
            cad.setSenha(senha);
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("Você já possui cadastro.");
        }
    }

    // Método que irá realizar o cadastro da viagem
    public void exibirCadastroViagem() {
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
            lugares =novaViagem.nextInt();
        }
        System.out.println("Adicionando os pontos da viagem:");

        // Serão adicionados os pontos X e Y dos locais e partida e destino
        // Os dados obtidos serão calculados para obter a distância entre o ponto de partida e destino

        System.out.print("Adicione o ponto X do local de partida: ");
        int x = novaViagem.nextInt();

        System.out.print("Adicione o ponto Y do local de partida: ");
        int y = novaViagem.nextInt();

        System.out.print("Digite o endereço do local: ");
        String end = novaViagem.next();


        // Perguntar ao prof se durante como funcionaria a funcionalidade de trajetos, eu vou definir esses trajetos antes mesmo de iniciar o programa?

        // Perguntar ao prof sobre a confirmação de carona, se estamos na perpectiva de passageiro, como que vamos aceitar a corrida como motorista?

        // Essa lista de viagens possíveis, eu escolheria a opção por meio do get(item) do ArrayList?

        Local local = new Local(x, y, end); // Objeto instanciado para adicionar os dados dos pontos de partida através do construtor

        Viagem viagem = new Viagem(); // Perguntar ao prof sobre se é possível alterar a variável de instância a cada novo cadastro
        viagem.adicionarLocal(local);

        // Após perguntar tudo, estamos no caminho certo?

        System.out.println(viagem.getListaViagens());
        System.out.println("Viagem cadastrada com sucesso.");
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
