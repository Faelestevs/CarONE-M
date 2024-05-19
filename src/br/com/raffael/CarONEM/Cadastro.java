package br.com.raffael.CarONEM;

import java.util.Scanner;
import java.util.ArrayList;

public class Cadastro {

    Scanner leitura = new Scanner(System.in);


    // Atributos do Cadastro

    protected String nome;
    protected String endereco;
    protected String email;
    protected String dataNascimento;
    protected String senha;
    protected String confirmaSenha;
    protected boolean verificaCadastro;
    protected double mediaAvaliacoes;

    private ArrayList<Passageiro> listaPassageiros = new ArrayList<>();
    private ArrayList<Motorista> listaMotoristas = new ArrayList<>();

    // Métodos do cadastro


    public Cadastro(String nome, String endereco, String email, String dataNascimento, String senha, boolean verificaCadastro, double mediaAvaliacoes) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.verificaCadastro = verificaCadastro;
        this.mediaAvaliacoes = mediaAvaliacoes;
    }

    public Cadastro() {
    }

    public void localizaPassageiro(String emailLogin) {
        for (Passageiro p : listaPassageiros) {
            if(emailLogin.equals(p.getEmail())){
                System.out.println("Bem-Vindo " + p.getNome());
            }
        }
    }

    public void verificarSenha() {
        if (confirmaSenha.equals(senha)) {
            System.out.println("As senhas correspondem");
        } else {
            System.out.println("Senha inválida");
        }
    }

    public boolean verificarLoginPassageiro(String emailLogin, String senhaLogin) {

        boolean validacao = false;

        for (Passageiro p : listaPassageiros) {
            if (emailLogin.equals(p.getEmail()) == true && senhaLogin.equals(p.getSenha())) {
                validacao = true;
                break;
            } else {
                System.out.println("O login fornecido é inválido, tente novamente");
                validacao = false;
            }
        }
        return validacao;
    }


    public void adicionarPassageiro(Passageiro passageiro) {
        listaPassageiros.add(passageiro);
        for (Passageiro p : listaPassageiros){
            System.out.println(p);
        }
    }

    public ArrayList<Motorista> getListaMotoristas() {
        return listaMotoristas;
    }

    public ArrayList<Passageiro> getListaPassageiros() {
        return listaPassageiros;
    }

    public void adicionarMotorista(Motorista motorista) {
        listaMotoristas.add(motorista);
        for (Motorista m : listaMotoristas) {
            System.out.println(m);
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
