public class DVD extends Product{
  String director;
  int duration;

  public DVD(
      String productName,
      double productPrice,
      String productDirector,
      int productDuration,
      double productDiscount
    ) {
    name = productName;
    price = productPrice;
    director = productDirector;
    duration = productDuration;
    discount = productDiscount;
  }
}