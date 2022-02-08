package exercicio2.entidades;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Jogador {

    private String nome;
    private String posicao;
    private String dataNascimento;

    public Jogador(String nome, String posicao, String dataNascimento) {
        this.nome = nome;
        this.posicao = posicao;
        this.dataNascimento = dataNascimento;
    }

    public void imprimeDadosJogador() {
        System.out.println("Nome: " + this.nome + ", posição: " + this.posicao + ", data de nascimento: " + this.dataNascimento);
    }

    private int calcularIdadeDojogador() {
        LocalDate dataNasc = LocalDate.parse(this.dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataAtual = LocalDate.now();

        Period period = Period.between(dataNasc, dataAtual);

        int years = Math.abs(period.getYears());
        System.out.println("A idade do jogador é: " + years);
        return years;
    }

    public void calculaQuantoTempoFaltaAposentar() {
        int idadeJogador = calcularIdadeDojogador();
        int idadeAposentar = 0;
        if (this.posicao.equals("defesa")) {
            idadeAposentar = 40;
        } else if (this.posicao.equals("meio-campo")) {
            idadeAposentar = 38;
        } else if (this.posicao.equals("atacante")) {
            idadeAposentar = 35;
        } else {
            System.out.println("Posição do jogador é inválida, não é possivel calcular idade de aposentar!");
            return;
        }

        int quantoFaltaParaAposentar = idadeAposentar - idadeJogador;

        if (quantoFaltaParaAposentar > 0) {
            System.out.println("Faltam " + quantoFaltaParaAposentar + " anos para se aposentar");
        } else {
            System.out.println("Jogador já pode se aposentar pois já possui idade!");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}





