package Elementos;
import org.openqa.selenium.By;
public class Elementos {

	private By campoUsername = By.id("user-name");
	private By campoPassword = By.id("password");
	private By btnLogin = By.id("login-button");
	private By btnFilter = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > span");
	private By btnLowtoHigh = By.cssSelector("#header_container > div.header_secondary_container > div.right_component > span > select > option:nth-child(3)");
	private By btnAddToCart = By.cssSelector("add-to-cart-sauce-labs-onesie");
	private By btnAddToCart2 = By.cssSelector("add-to-cart-test.allthethings()-t-shirt-(red)");	
	private By btnCart = By.cssSelector("#shopping_cart_container > a");
	private By btnCheckout = By.id("checkout");
	
	public By getCampoPassword() {
		return campoPassword;
	}
	public By getCampoUsername() {
		return campoUsername;
	
	}
	public By getBtnLogin() {
		return btnLogin;
	
	}
	public By getBtnFilter() {
		return btnFilter;
	
	}
	public By getBtnLowtoHigh() {
		return btnLowtoHigh;
	
	}
	public By getBtnAddToCart() {
		return btnAddToCart;
	
	}
	public By getBtnAddToCart2() {
		return btnAddToCart2;
	
	}
	public By getBtnCart() {
		return btnCart;
	
	}
	public By getBtnCheckout() {
		return btnCheckout;
	}
	
	
	
	
}
