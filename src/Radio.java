public class Radio implements Device {
    private boolean ligado = false;
    private int volume = 20;
    
    @Override
    public void ligar() {
        this.ligado = true;
        System.out.println("A TV esta ligada");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume da TV ajustado para " + volume);
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean isLigado() {
        return this.ligado;
    }   
}