
package Lab_work;

import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
    Book book1 = new Book("Brave New World", "Aldous Huxley", "9780060850524\n");
    Book book2 = new Book("The Grapes of Wrath", "Ernest Hemingway", "9780142000663");
    Book.add_Book(book1);
    Book.add_Book(book2);
    ArrayList < Book > bookCollection = Book.get_BookCollection();
    System.out.println(" List of books:\n");
    for (Book book: bookCollection) {
      System.out.println(" Title:"+ book.get_Title()+"\n Author:" + book.get_Author()+"\n ISBN:" + book.get_ISBN());
    }
    Book.remove_Book(book1);
    System.out.println("\n After removing " + book1.get_Title() + ":");
    System.out.println(" List of books:\n");
    for (Book book: bookCollection) {
      System.out.println(" Title:"+book.get_Title()+"\n Author:" + book.get_Author()+"\n ISBN:" + book.get_ISBN());
    }
  }
}
