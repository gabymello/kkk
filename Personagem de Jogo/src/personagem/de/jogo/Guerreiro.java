
package personagem.de.jogo;



    class Guerreiro extends Personagem {
    private int forca;  

    public Guerreiro(int energia, int forca) {
        super(energia);
        this.forca = forca;
    }

  
    public void definirForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void atacar() {
        if (energia >= 10) {
            energia -= 10; 
            System.out.println("O Guerreiro atacou com força! Energia restante: " + energia);
        } else {
            System.out.println("Energia insuficiente para atacar.");
        }
    }
}

    
    

