public class Product {
	String name;
	double price;
	double discount;

	public boolean isExpensive() {
		return (price > 100);
	}

	public double finalPrice() {
		double finalDiscount = this.price * (this.discount / 100);
		return this.price - finalDiscount;
	}

	public void showProductDetails() {
		System.out.println("O produto '" + this.name + "', tem um desconto de " + this.discount + "% e seu preço é de R$" + this.finalPrice());
	}
}
