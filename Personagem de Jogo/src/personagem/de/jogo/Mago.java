
package personagem.de.jogo;


 class Mago extends Personagem {
    private double mana;  // Atributo mana com visibilidade privada

    public Mago(int energia, double mana) {
        super(energia);
        this.mana = mana;
    }

    // Sobrecarga do método definirMana para aceitar um valor inteiro
    public void definirMana(int mana) {
        this.mana = mana;
    }

    // Sobrecarga do método definirMana para aceitar um valor decimal (double)
    public void definirMana(double mana) {
        this.mana = mana;
    }

    @Override
    public void atacar() {
        if (mana >= 10) {
            energia -= 5;  // Reduz a energia ao atacar
            mana -= 10;    // Consome mana
            System.out.println("O Mago atacou! Energia restante: " + energia + ", Mana restante: " + mana);
        } else {
            System.out.println("Mana insuficiente para atacar.");
        }
    }
}
   

