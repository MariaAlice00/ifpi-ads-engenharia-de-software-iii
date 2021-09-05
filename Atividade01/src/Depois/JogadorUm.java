package Depois;

public class JogadorUm {
    int forca, nivel, pontosAtuais;

    JogadorUm (int forca, int nivel, int pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    public void pontosAtaque() {
        this.pontosAtuais += this.forca * this.nivel;
    }

    public void atacar(JogadorUm adversario) {
        adversario.pontosAtuais -= this.pontosAtuais;
    }
    
    public String maisPontos(JogadorUm eu, JogadorUm adversario) {
    	if (eu.pontosAtuais > adversario.pontosAtuais) {
            return ">>> Jogador 1 tem mais pontos.";
        }
    	return ">>> Jogador 2 tem mais pontos.";
    }
}