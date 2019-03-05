package chep4;

public class Book {
    static int bil = 1;
    String title;
    
    public static void cetak() {
        System.out.println("Jumlah Buku = " + Book.bil);
    }
    
    
    Book() {
        Book.bil = Book.bil + 1;
        System.out.println("Bil buku = " + Book.bil);
    }
    
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book.cetak();
                
    }
     
}
