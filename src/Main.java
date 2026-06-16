public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Pessoa gustavo = new Pessoa(1, "Gustavo", 20);

        System.out.println("Gustavo: " + gustavo.getNome());
        System.out.println(gustavo.toString());
    }
}
