package Antes;

public class TesteJogador {
    public static void main(String[] args) {
        Jogador a = new Jogador(50, 10, 100);
        Jogador b = new Jogador(30, 9, 110);

        a.pontosAtaque(); 
        b.pontosAtaque(); 

        a.atacar(b); 

        System.out.println("Jogador 1: " + a.pontosAtuais);
        System.out.println("Jogador 2: " + b.pontosAtuais);

        if (a.pontosAtuais > b.pontosAtuais) {
            System.out.println(">>> Jogador 1 tem mais pontos.");
        } else {
            System.out.println(">>> Jogador 2 tem mais pontos.");
        }
    }
}