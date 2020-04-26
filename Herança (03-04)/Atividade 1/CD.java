public class CD extends Product{
  String artist;
  int tracks;

  public CD(
      String productName,
      double productPrice,
      String productArtist,
      int productTracks,
      double productDiscount
    ) {
    name = productName;
    price = productPrice;
    artist = productArtist;
    tracks = productTracks;
    discount = productDiscount;
  }
}