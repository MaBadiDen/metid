public class Main {
    public static void main(String[] args) {
        Author Rudasov = new Author("�������", "�������");
        Author Gogol = new Author("�������", "������");

        Book Arhimag = new Book("�������", Rudasov, 2005);
        Book deadSouls = new Book("������� ����", Gogol, 1111);

        deadSouls.setPublishYear(1842);

        System.out.println(deadSouls);
        System.out.println(Arhimag.getName());
        System.out.println(Rudasov);


    }
}