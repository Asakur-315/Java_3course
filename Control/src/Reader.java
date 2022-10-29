public class Reader {
    private int id;
    private String name, faculty, phone;
    

    public Reader(int id,String name,  String phone, String faculty){
        this.id = id;
        this.name = name;
        this.faculty = faculty;
        this.phone = phone;
    }


    private void takeBookOut(String booklist){
        System.out.println(String.format("%s взял книги: %s",this.name, booklist));
    }

    public void takeBook(int q) {
        takeBookOut(Integer.toString(q));
    }

    public void takeBook(String ... books){
        String booklist = "";
        for (String string : books) {
            booklist+= string + ", " ;
        }

        booklist = booklist.substring(0, booklist.length() - 2);
        takeBookOut(booklist);
    }

    public void takeBook(Book ... books){
        String booklist = "";
        for (Book book : books) {

            booklist+= book.getName() + ", " ;
        }
        booklist = booklist.substring(0, booklist.length() - 2) + ".";
        takeBookOut(booklist);
    }

    private void returnBookOut(String booklist){
        System.out.println(String.format("%s вернул книги: %s",this.name, booklist));

    }
    public void returnBook(int q) {
        returnBookOut(Integer.toString(q));
    }

    public void returnBook(String ... books){
        String booklist = "";
        for (String string : books) {
            booklist+= string + ", " ;
        }

        booklist = booklist.substring(0, booklist.length() - 2);
        returnBookOut(booklist);
    }

    public void returnBook(Book ... books){
        String booklist = "";
        for (Book book : books) {

            booklist+= book.getName() + ", " ;
        }
        booklist = booklist.substring(0, booklist.length() - 2) + ".";
        returnBookOut(booklist);
    }
}


