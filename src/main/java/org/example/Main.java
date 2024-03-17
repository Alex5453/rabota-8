public class FormData {
    public int day;
    public int month;
    public int year;
}

public class Post {
    public String name;
    public String email;
    public int age;
    public FormData birthday;
}

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.email = "ivan@example.com";
        post.age = 25;

        post.birthday = new FormData();
        post.birthday.day = 13;
        post.birthday.month = 5;
        post.birthday.year = 1996;

        // В этой точке отладчиком можно посмотреть значения post и post.birthday

        System.out.println("Анкета:");
        System.out.println("Имя: " + post.name);
        System.out.println("Email: " + post.email);
        System.out.println("Возраст: " + post.age);
        System.out.println("Дата рождения: " + post.birthday.day + "." + post.birthday.month + "." + post.birthday.year);
    }
}