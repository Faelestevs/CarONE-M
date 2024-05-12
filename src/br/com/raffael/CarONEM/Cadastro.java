package br.com.raffael.CarONEM;

import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {

    Scanner leitura = new Scanner(System.in);


    // Atributos do Cadastro

    private String nome;
    private String endereco;
    private String email;
    private String dataNascimento;
    private String senha;
    private String confirmaSenha;

    // Métodos do cadastro

    public void verificarSenha() {
        if (confirmaSenha.equals(senha)) {
            System.out.println("As senhas correspondem");
        }
        else {
            System.out.println("Senha inválida");
        }
    }

    public String getConfirmaSenha() {
        return confirmaSenha;
    }

    public void setConfirmaSenha(String confirmaSenha) {
        this.confirmaSenha = confirmaSenha;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
