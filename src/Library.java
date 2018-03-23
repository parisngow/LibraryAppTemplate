/**
 * Library class
 */
public class Library {


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
