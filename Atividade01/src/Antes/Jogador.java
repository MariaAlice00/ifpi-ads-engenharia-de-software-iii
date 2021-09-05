package Antes;

public class Jogador {
    int forca, nivel, pontosAtuais;

    Jogador (int forca, int nivel, int pontosAtuais) {
        this.forca = forca;
        this.nivel = nivel;
        this.pontosAtuais = pontosAtuais;
    }

    public void pontosAtaque() {
        this.pontosAtuais += this.forca * this.nivel;
    }

    public void atacar(Jogador adversario) {
        adversario.pontosAtuais -= this.pontosAtuais;
    }
}