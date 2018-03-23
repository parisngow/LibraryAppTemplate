import java.util.Scanner;
/**
 * Library class
 */
public class Library {

    String name;
    Address location;
    Book[] books;
    Member[] members;


    /**
     * addBook(Book) : void
     * Creates a new array which is a copy of this.books, but, whose length is
     * this.books.length + 1, to be able to add the new book.
     *
     * this.books is then replaced by the new array.
     *
     * @param book
     *          A new book object to add to the books list
     */

    public void addBook(Book) {
//        Book bookList = new Book();
//        bookList.books[this.books.length];
        Scanner input = new Scanner(System.in);
        int length = this.books.length + 1
        Book[] tempBooks = new Book[length];
        
        for (int i = 0; i < this.books.length; i++) {
            tempBooks[i] = books[i];
        }

        System.out.print("New book title: ");
        tempBooks[length-1] = input.nextLine();
        
        books = tempBooks;
        
        
    }
    /**
     * addMember(Member) : void
     * Creates a new array which is a copy of this.members, but, whose length is
     * this.members.length + 1, to be able to add the new member.
     *
     * this.members is then replaced by the new array.
     *
     * @param member
     *          A new member object to add to the members list, 
     */
    void addMember(Member[] members){
        Member[] temparray = new Member[this.members.length - 1];
        for (int i = 0; i < temparray.length; i++){
            if (i < this.members.length){
                temparray[i] = this.members[i];
            } else {
                temparray[i] = members;
            }
        }
        this.members = temparray;
    }





}
