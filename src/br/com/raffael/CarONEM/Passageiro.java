package br.com.raffael.CarONEM;

import java.util.Scanner;

public class Passageiro extends Cadastro {

    // Atributos do Passageiro

    Partida partida = new Partida();
    Destino destino = new Destino();

    public Passageiro(){
    }

    public Passageiro(String nome, String endereco, String email, String dataNascimento, String senha, boolean verificaCadastro, double mediaAvaliacoes) {
        super(nome, endereco, email, dataNascimento, senha, verificaCadastro, mediaAvaliacoes);
    }

    public void exibirCadastro(Cadastro cad, Passageiro passageiro, String email) {
        System.out.println(getVerificaCadastro());
        if (!getVerificaCadastro()) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("""
                    ==============================================
                                    -- Cadastro --
                    ==============================================""");
            System.out.print("Digite o seu nome: ");
            String nome = entrada.next();
            System.out.print("Digite o seu e-mail: ");
            email = entrada.next();
            System.out.print("Digite o seu endereço residencial: ");
            String endereco = entrada.next();
            System.out.print("Digite a sua data de nascimento: ");
            String dataNascimento = entrada.next();
            System.out.print("Crie uma senha: ");
            String senha = entrada.next();
            while (senha.length() < 6) {
                System.out.println("A senha precisa ter no mínimo 6 caracteres.");
                System.out.print("Crie uma senha: ");
                senha = entrada.next();
            }
                System.out.println("Cadastro realizado com sucesso!");
                setVerificaCadastro(true);
                mediaAvaliacoes = 5.0;
                cad.adicionarPassageiro(new Passageiro(nome, endereco, email, dataNascimento, senha, verificaCadastro, mediaAvaliacoes));
            } else {
                System.out.println("Você já possui cadastro.");
            }

    }

    public void exibirBuscarCarona(Partida partida, Destino destino) {
        System.out.println("""
                ==============================================
                              -- Buscar Carona --
                ==============================================
                
                """);
    }



    public String toString() {
        {return "Nome: " + getNome() + "\nEmail: " + getEmail() + "\nEndereço: " + getEndereco() + "\nData de Nascimento: " + getDataNascimento();}
    }


}
