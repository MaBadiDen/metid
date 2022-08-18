public class Main {
    public static void main(String[] args) {
        Author Rudasov = new Author("Алексей", "Рудазов");
        Author Gogol = new Author("Николай", "Гоголь");

        Book Arhimag = new Book("Архимаг", Rudasov, 2005);
        Book deadSouls = new Book("Мертвые души", Gogol, 1111);

        deadSouls.setPublishYear(1842);

        System.out.println(deadSouls);
        System.out.println(Arhimag.getName());
        System.out.println(Rudasov);


    }
}