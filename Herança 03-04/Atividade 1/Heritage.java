public class Heritage {
	public static void main(String[] args) {
		Book firstBook = new Book("O senhor dos aneis", 50, "J.R. Tokien", 4000, 20);

		DVD firstMovie = new DVD("Inglorious", 25, "Quentin Tarantino", 400, 5);

		CD firstAlbum = new CD("DAMN", 75, "Kendrick Lamar", 13, 5);
		CD secondAlbum = new CD("To Pimp a Butterfly", 75, "Kendrick Lamar", 13, 15);

		System.out.println("\nProdutos: ");
		firstBook.showProductDetails();
		firstMovie.showProductDetails();
		firstAlbum.showProductDetails();
		secondAlbum.showProductDetails();
	}
}