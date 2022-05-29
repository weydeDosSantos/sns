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

	@Dado("que o usuario acesse a URL {string}")
	public void que_o_usuario_acesse_a_url(String url) {
		m.ExecutarNavegador(url);
	}

	@Dado("preenchar o dados")
	public void preenchar_o_dados() throws InterruptedException {
		m.preencher(e.getCampoUsername(), "standard_user");
		m.pausa(2000);
		m.preencher(e.getCampoPassword(), "secret_sauce");
	}

	@Dado("selecione o campo login")
	public void selecione_o_campo_login() {
		m.clicar(e.getBtnLogin());
	}

	@Dado("selecione o campo filter e coloque low to high")
	public void selecione_o_campo_filter_e_coloque_low_to_high() {
		m.clicar(e.getBtnFilter());
	m.clicar(e.getBtnLowtoHigh());
	}

	@Dado("selecione o campo ADD to cart no Sauce")
	public void selecione_o_campo_add_to_cart_no_sauce() throws InterruptedException {
		m.pausa(3000);
		m.clicar(e.getBtnAddToCart());
		m.pausa(1000);
		m.scroll(e.getBtnAddToCart2());
	}

	@Dado("selecione o campo cart e prossigar com a comprar")
	public void selecione_o_campo_cart_e_prossigar_com_a_comprar() {

		m.clicar(e.getBtnCart());
	}

}