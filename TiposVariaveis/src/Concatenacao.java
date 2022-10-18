public class Concatenacao {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";
        System.out.print(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.print(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.print(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.print(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.print(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.print(concatenacao);
    }

}
