public class task32 {
    public static void main(String[] args) {
        Book b=new Book(23, "jungle");
        Book b1=new Book(42, "Cat", "Chinnu");
        b.displayBook();
        b1.displayBook();
    }
}
class Book{
    int bookId;
    String title;
    String author;
    Book(int bookId,String title){
        this.bookId=bookId;
        this.title=title;
    }
    Book(int bookId,String title,String author){
        this.bookId=bookId;
        this.title=title;
        this.author=author;
    }
    void displayBook(){
        System.out.println(bookId+"\n"+title+"\n"+author);
    }
    
}