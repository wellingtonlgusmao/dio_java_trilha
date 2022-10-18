public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void somar() {
        ++canal;
        // canal++;
        // canal = canal +1;
    }

    public void subtrair() {
        --canal;
    }

    public void elevar() {
        ++volume;
        System.out.println("volume aumentado para" + volume);
    }

    public void reduzir() {
        --volume;
        System.out.println("volume diminuido para" + volume);
    }
}
