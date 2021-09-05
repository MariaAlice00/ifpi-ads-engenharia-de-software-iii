package Depois;

public class TesteJogadorUm {
    public static void main(String[] args) {
    	JogadorUm  a = new JogadorUm (50, 10, 100);
    	JogadorUm  b = new JogadorUm (30, 9, 110);

        a.pontosAtaque(); 
        b.pontosAtaque(); 

        a.atacar(b); 

        System.out.println("Jogador 1: " + a.pontosAtuais);
        System.out.println("Jogador 2: " + b.pontosAtuais);

        System.out.println(b.maisPontos(a, b));
    }
}