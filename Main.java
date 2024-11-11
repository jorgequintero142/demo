public class Main {
    final static String HOLA_ES = "Hola mundo";
    final static String HOLA_EN = "Hello world";
    final static String ENGLISH = "en";

    public static void main(String[] args) {
        System.out.println("Welcome back Jorge...");
        System.out.println(greeting(args));
    }

    static String greeting(String[] args) {
        String language = args.length > 0 ? args[0] : "";
        if (language.equals(ENGLISH)) {
            return HOLA_EN;
        }
        return HOLA_ES;
    }
}