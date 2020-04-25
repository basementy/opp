public class Book extends Product {
	int pages;
	String author;

	public Book(
			String productName,
			double productPrice,
			String productAuthor,
			int productPages,
			double productDiscount
	) {
		name = productName;
		price = productPrice;
		author = productAuthor;
		pages = productPages;
		discount = productDiscount;
	}

	public boolean isBig() {
		return (pages > 200);
	}

	public void verifySize() {
		String result;

		if (this.isBig()) result = "Grande";
		else result = "Pequeno";

		System.out.println("O Livro '" + this.name + "' tem " + this.pages + " paginas, portanto é " + result);
	}
}
