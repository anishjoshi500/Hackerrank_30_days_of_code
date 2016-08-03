class MyBook extends Book
    {
    //public String title;
    //public String author;
    private int price;
    public MyBook(String title, String author, int price)
        {
        super(title, author);
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
        {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
    
}
