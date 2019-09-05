public class GstCalculator {
  private Product product;
  public GstCalculator(Product product){
    this.product=product;
  }

  public double calculateTotalBill(){

    double bill=(this.product.getPrice()*this.product.getQuantity())+(this.product.getGSTRate()*(this.product.getQuantity()*
        this.product.getPrice()));
    if(bill>1000)
    {
      bill=bill-(bill*(product.getAdditionalDiscount()/100));
    }
    return bill;
  }

}
