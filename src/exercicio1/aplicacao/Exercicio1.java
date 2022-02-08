package exercicio1.aplicacao;

import exercicio1.entidades.Veiculo;

/**
 * Seguindo o diagrama UML a seguir, implemente a classe Veiculo e seus métodos. Após a
 * implementação, testar cada um dos métodos via console.
 * acelerar(): este método acrescenta um valor de 20 no atributo velocidade.
 * abastecer(int combustivel): recebe como parâmetro uma quantidade de combustível e
 * atribui a listrosCombustivel.
 * OBS.: O limite do tanque de combustível é de 60 litros, validar  * para não ultrapassar.
 * frear(): a cada chamada do método diminui a velocidade em 20. Não aceitar a chamada do
 * método se o veículo estiver parado.
 * pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
 * ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
 * desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga o carro. Não
 * permitir que desligue o veículo com (velocidade > 0).
 */

public class Exercicio1 {
    public static void main(String[] args) {
        Veiculo corsa = new Veiculo("Chevrolet", "Corsa", "ARX-3345", "Branco", "50.000", false, 0, 0, 25000);

        corsa.frear();
        corsa.ligar();
        corsa.acelerar();
        corsa.desligar();
        corsa.frear();
        corsa.desligar();
        corsa.abastecer(10);
        corsa.abastecer(60);
        corsa.pintar("Amarelo");
    }
}
