package br.com.raffael.CarONEM;

import java.util.Scanner;

public class Passageiro extends Cadastro {

    // Atributos do Passageiro

    private boolean verificaCadastro;


    public void exibirCadastro() {
        System.out.println(verificaCadastro);

            Scanner entrada = new Scanner(System.in);
            System.out.println("""
                    ==============================================
                                    -- Cadastro --
                    ==============================================""");
            System.out.print("Digite o seu nome: ");
            String nome = entrada.next();
            System.out.print("Digite o seu e-mail: ");
            String email = entrada.next();
            System.out.print("Digite a sua data de nascimento: ");
            String dataNascimento = entrada.next();
            System.out.print("Crie uma senha: ");
            String senha = entrada.next();
            while (senha.length() < 6) {
                System.out.println("A senha precisa ter no mínimo 6 caracteres.");
                System.out.print("Crie uma senha: ");
                senha = entrada.next();
            }

            setVerificaCadastro(true);

            if (!verificaCadastro) {
                Cadastro cad = new Cadastro();
                cad.setNome(nome);
                cad.setEmail(email);
                cad.setDataNascimento(dataNascimento);
                cad.setSenha(senha);
                System.out.println("Cadastro realizado com sucesso!");
            } else {
                System.out.println("Você já possui cadastro.");
            }
    }

    public void exibirCadastroViagem() {

    }

    public boolean getVerificaCadastro(){
        return verificaCadastro;
    }

    public void setVerificaCadastro(boolean verificaCadastro){
        this.verificaCadastro = verificaCadastro;
    }

}
