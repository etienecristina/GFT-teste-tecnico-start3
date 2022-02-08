package exercicio2.aplicacao;

import exercicio2.entidades.Jogador;

/**
 * Crie uma classe para representar um jogador de futebol, com os atributos nome, posição,
 * data de nascimento.
 * Crie o método para imprimir todos os dados do jogador.
 * Crie um método para calcular a idade do jogador e
 * outro método para mostrar quanto tempo falta para o jogador se aposentar.
 * Para isso, considere que os jogadores da posição de
 * defesa se aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os
 * atacantes aos 35.
 **/

public class Exercicio2 {
    public static void main(String[] args) {

        Jogador atacante = new Jogador("Neymar", "atacante", "05/02/1992");
        atacante.imprimeDadosJogador();
        atacante.calculaQuantoTempoFaltaAposentar();

        Jogador defesa = new Jogador("Tiago", "defesa", "01/01/1980");
        defesa.imprimeDadosJogador();
        defesa.calculaQuantoTempoFaltaAposentar();

        Jogador meioCampo = new Jogador("Alberto", "meio-campo", "01/01/1990");
        meioCampo.imprimeDadosJogador();
        meioCampo.calculaQuantoTempoFaltaAposentar();
    }
}



