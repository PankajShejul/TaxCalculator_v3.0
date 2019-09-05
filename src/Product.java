public class Product {
  private String name;
  private int price;
  private int quantity;
  enum Category{
    FOOD,FURNITURE,ELECTRONICS;


  }
  private Category  category;
  public Product(String name,int price,int quantity,int categoryIndex)
  {
    this.name=name;
    this.price=price;
    this.quantity=quantity;
    this.category=Category.values()[categoryIndex];
  }

  public Category getCategory(){
    return category;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }


  public int getGSTRate(){
      if(category==Category.FOOD){
        return 0;
      }else if(category==Category.FURNITURE){
        return 5;
      }else{
        return 10;
      }
  }
  public int getAdditionalDiscount(){
    if(category==Category.FOOD){
      return 10;
    }else if(category==Category.FURNITURE){
      return 5;
    }else{
      return 20;
    }
  }

}
