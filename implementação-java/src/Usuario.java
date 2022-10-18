public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        SmartTV smartTV = new SmartTV();

        System.out.println("tv ligada ?" + smartTV.ligada);
        System.out.println("canal atual" + smartTV.canal);
        System.out.println("Volume atual" + smartTV.volume);

        smartTV.ligar();
        System.out.println("novo status - tv ligada ?" + smartTV.ligada);

        smartTV.desligar();
        System.out.println("novo status - tv ligada ?" + smartTV.ligada);

        smartTV.somar();
        System.out.println("canal atual é ?" + smartTV.canal);

        smartTV.subtrair();
        System.out.println("canal atual é ?" + smartTV.canal);

        smartTV.elevar();
        System.out.println("volume atual é ?" + smartTV.volume);

        smartTV.reduzir();
        System.out.println(" volume atual é ?" + smartTV.volume);
    }

}
