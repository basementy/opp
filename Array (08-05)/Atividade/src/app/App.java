package app;

import app.Product.Product;
import javax.swing.JOptionPane;

public class App {
	public static void main(String[] args) throws Exception {
		String productsAmount = JOptionPane.showInputDialog("Digite quantos CD's deseja comprar:");
		Product productsArray[] = new Product[Integer.parseInt(productsAmount)];

		for (int i = 0; i < productsArray.length; i++) {
			String productName = JOptionPane.showInputDialog("Digite o nome do CD:");
			String productArtist = JOptionPane.showInputDialog("Digite o artista:");
			String productPrice = JOptionPane.showInputDialog("Digite o preço:");
			String productQuantity = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar:");

			productsArray[i] = new Product(
				productName,
				productArtist,
				Integer.parseInt(productPrice)
			);

			productsArray[i].calculateSale(Integer.parseInt(productQuantity));
		}
	}
}
