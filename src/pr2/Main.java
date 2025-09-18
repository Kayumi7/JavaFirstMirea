package pr2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Татаренко Михаил Вадимович", "tatarenko.m.v@edu.mirea.ru", 'm', 20 );
        System.out.println(author);
        Author author1 = new Author();
        author1.setName("Марк Твен");
        author1.setEmail("MTVen@gmail.ru");
        author1.setAge(38);
        System.out.println(author1);
        System.out.println(author.getName());
    }
}
