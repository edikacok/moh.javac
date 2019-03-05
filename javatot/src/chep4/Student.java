package chep4;

public class Student {
    void setName(String name) {
        System.out.println(name);
        name = name + " bin zakaria";
    }
    void changeBookTitle(Book b) {
        b.title = "Java Advanced";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        String nama = "azman";
        s1.setName(nama);
        System.out.println(nama);
        
        Book b1 = new Book();
        b1.title = "Java for Beginner";
        System.out.println(b1.title);
        s1.changeBookTitle(b1);
        System.out.println(b1.title);       
    }
}
