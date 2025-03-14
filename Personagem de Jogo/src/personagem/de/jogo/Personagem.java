
package personagem.de.jogo;



    abstract class Personagem {
    protected int energia;  // Atributo energia com visibilidade protegida

    public Personagem(int energia) {
        this.energia = energia;
    }

    // Método abstrato que será implementado pelas subclasses
    public abstract void atacar();
}


