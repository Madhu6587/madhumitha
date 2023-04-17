public class Book {

    public  int price;
    public String name;
    Author author;

    Book(int price, String name, Author author)
    {
        this.price=price;
        this.name=name;
        this.author=author;
    }

    public static void main(String[] args) {
        Author author = new Author("William");
        Book b1= new Book(20,"The King", author);
        System.out.println(b1.author.name);
        System.out.println(b1.name);
        System.out.println(b1.price);
    }
}

