package br.com.raffael.CarONEM;

import java.net.PasswordAuthentication;
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
    private boolean verificaCadastro;

    private ArrayList<Passageiro> listaPassageiros = new ArrayList<>();
    private ArrayList<Motorista> listaMotoristas = new ArrayList<>();


    // Métodos do cadastro


    public Cadastro(String nome, String endereco, String email, String dataNascimento, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public Cadastro() {
    }

    public void verificarSenha() {
        if (confirmaSenha.equals(senha)) {
            System.out.println("As senhas correspondem");
        }
        else {
            System.out.println("Senha inválida");
        }
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        listaPassageiros.add(passageiro);
        for (Passageiro p : listaPassageiros){
            System.out.println(p);
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

    public boolean getVerificaCadastro(){
        return verificaCadastro;
    }

    public void setVerificaCadastro(boolean verificaCadastro){
        this.verificaCadastro = verificaCadastro;
    }
}
