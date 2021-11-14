package Constructor;

class Author{
    String authorName;
    Author(String authorName){
        this.authorName=authorName;
    }
}
public class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String name, Author author, double price, int qtyInStock){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }

    public String getName() {
        return name;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public double getPrice() {
        return price;
    }

    public Author getAuthor() {
        return author;
    }


    public static void main(String[] args) {
       Author ob1 = new Author("Sumita");
       Author ob2 = new Author("Yatnesh");
       Book obj = new Book("java",ob1,230.0,50);
       Book obj2 = new Book("C",ob2,250.0,100);
        System.out.println(obj.getName()+" "+ obj.getAuthor().authorName+" "+obj.getPrice()+" "+obj.getQtyInStock());
        System.out.println(obj2.getName()+" "+ obj2.getAuthor().authorName+" "+obj2.getPrice()+" "+obj2.getQtyInStock());
    }
}


