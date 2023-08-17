 class BCatalog {
    public static void main(String[] args) {
        String[] books = { "Book A", "Book B", "Book C" };
        String[] authors = new String[books.length]; 
        // Initialize ho raha ha 
        // Copy from book to author
        for (int i = 0; i < books.length; i++) {
            authors[i] = books[i]; }
        // ya code ka TV ha 
        System.out.println("Authors:");
        for (String author : authors) {
            System.out.println(author+ "  ");
        }}}
/* 
---------------OUTPUT----------------
  Authors:
Book A  
Book B  
Book C */
