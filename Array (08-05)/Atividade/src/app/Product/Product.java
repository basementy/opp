package app.Product;

public class Product {
  private String name;
  private String artist;
  private int price;

  public Product(String name, String artist, int price) {
    this.setName(name);
    this.setArtist(artist);
    this.setPrice(price);
  }

  public String getArtist() {
    return artist;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void calculateSale(int quantity) {
    double totalAmount = quantity * this.price;
    System.out.printf("O valor total de %d CD's do %s é de: %.2f\n", quantity, this.name, totalAmount);
  }
}