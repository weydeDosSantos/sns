package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page1 {
	WebDriver driver;

	public void clicar(By elemento) {
		driver.findElement(elemento).click();

	}

	public void preencher(By elemento, String texto)  {
		driver.findElement(elemento).sendKeys(texto);
	}
	
	public void pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
}
}
