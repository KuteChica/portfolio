public class Book {
    private String title;
   private String author;
    private String isbn;
    private int pageCount;
   private double price;


   //constractor//

   public Book(String title,String author,String isbn ,int pageCount,double price){
    this.title=title;
    this.author=author;
    this.isbn=isbn;
    this.pageCount=pageCount;
    this.price=price;


   }



   //get//

    public String getTitle(){
        return title;
    }
        public String getauthur(){
        return author;
    }
        public String getisbn(){
        return isbn;
    }
        public int getpageCount (){
        return pageCount;
    }
        public double price(){
        return price;
    }



    //set//
    public void setTitle(String title){
       this.title=title;
    }
     public void setauthor(String t){
       this. author=t;
    }
     public void setisbn(String title){
        this.title=title;
    }
     public void setpageCount(int pageCount){
       this. pageCount=pageCount;
    }
     public void setprice(double price ){
        this.price=price;
    }
    

    
}
         






