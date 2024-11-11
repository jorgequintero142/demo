public class Main {
    final static String HOLA_ES = "Hola mundo";
    final static String HOLA_EN = "Hello world";

    public static void main(String[] args) {
        System.out.println("Welcome back Jorge...");
        if (args.length > 0 && args[0].equals("en"))
            System.out.println(Main.HOLA_EN + "<>" + args[0]);
        else
            System.out.println(Main.HOLA_ES);
    }
}