package Steps;

import org.openqa.selenium.WebDriver;

import Elementos.Elementos;
import Metodos.Metodos;
import Page.Page1;
import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;

  
public class Steps {
	WebDriver driver;
	Metodos m = new Metodos();
	Elementos e = new Elementos();
	Page1 p = new Page1();
	
	@Dado("que o usuario acesse a URL {string}")
	public void que_o_usuario_acesse_a_url(String url) {
	   m.ExecutarNavegador(url);
	}

	@E("preenchar o dados")
	public void preenchar_o_dados() throws InterruptedException {
	   p.preencher(e.getCampoUsername(), "standard_user");
	   p.pausa(2000);
	   p.preencher(e.getCampoPassword(), "secret_sauce");
	}

	@E("selecione o campo login")
	public void selecione_o_campo_login() {
	    p.clicar(e.getBtnLogin());
	}

	@E("selecione o campo filter e coloque low to high")
	public void selecione_o_campo_filter_e_coloque_low_to_high() {
	    p.clicar(e.getBtnFilter());
	    p.clicar(e.getBtnLowtoHigh());
	}

	@E("selecione o campo ADD to cart no Sauce Labs Onesie e no Test.allTheThings\\() T-Shirt \\(Red")
	public void selecione_o_campo_add_to_cart_no_sauce_labs_onesie_e_no_test_all_the_things_t_shirt_red() throws InterruptedException {
	   p.clicar(e.getBtnAddToCart());
	   p.pausa(1000);
	   p.clicar(e.getBtnAddToCart2());
	}

	@E("selecione o campo cart e prossigar com a comprar")
	public void selecione_o_campo_cart_e_prossigar_com_a_comprar() {
	    p.clicar(e.getBtnCart());
	}
}
