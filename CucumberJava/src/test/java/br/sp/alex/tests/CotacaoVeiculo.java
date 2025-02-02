package br.sp.alex.tests;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;

import br.sp.alex.core.DriverManager;
import br.sp.alex.core.ElementsPage;

public class CotacaoVeiculo extends ElementsPage {

	public void Finaliza() {
		DriverManager.killDriver();
	}

	@Given("Acesso a pagina inicial")
	public void acesso_a_pagina_inicial() throws Throwable {
		DriverManager.getDriver().get("http://sampleapp.tricentis.com/101/app.php");
	}

	@When("Seleciono a Marca do veiculo")
	public void seleciono_a_marca_do_veiculo() {
		clicarBotao(By.xpath("//option[@value='BMW']"));
		clicarBotao(By.xpath("//option[@value='Scooter']"));
	}

	@When("Potencia de {string}")
	public void potenciaDe(String string) {
		escrever(By.id("cylindercapacity"), string);

	}

	@When("Perfomace em {string}")
	public void perfomaceEm(String string) {
		escrever(By.id("engineperformance"), string);

	}

	@When("Data da fabricacao {string}")
	public void dataDaFabricacao(String string) {
		escrever(By.id("dateofmanufacture"), string);

	}

	@When("Capacidade do carro para")
	public void capacidadeDoCarroPara() {
		selecionarCombo("numberofseats", "8");

	}

	@When("lado da direcao direta como No")
	public void lado_da_direcao_direta_como_no() {
		clicarBotao(By.xpath("//label[text()='Yes']"));
	}

	@When("Numero de assentos como {string}")
	public void numero_de_assentos_como(String string) {
		selecionarCombo("numberofseatsmotorcycle", string);
	}

	@When("o tipo de combustive {string}")
	public void oTipoDeCombustive(String string) {
		selecionarCombo("fuel", string);
	}

	@When("capacidade de carga {string}")
	public void capacidadeDeCarga(String string) {
		escrever(By.id("payload"), string);
	}

	@When("Peso total {string}")
	public void pesoTotal(String string) {
		escrever(By.id("totalweight"), string);
	}

	@When("preco {string}")
	public void preco(String string) {
		escrever(By.id("listprice"), string);
	}

	@When("License {string}")
	public void license(String string) {
		escrever(By.id("licenseplatenumber"), string);
	}

	@When("Quando termino de Preenche o campo com {string} milhas")
	public void quandoTerminoDePreencheOCampoComMilhas(String string) {
		escrever(By.id("annualmileage"), string);
	}

	@Then("Clico em Next e Avanco para Proxima Pagina")
	public void clicoEmNextEAvancoParaProximaPagina() {
		DriverManager.JS("document.querySelector('#nextenterinsurantdata').click()");
	}

	@When("Preencho o campo Nome {string}")
	public void preenchoOCampoNome(String string) {
		escrever(By.id("firstname"), string);
	}

	@When("Sobrenome {string}")
	public void sobrenome(String string) {
		escrever(By.id("lastname"), string);
	}

	@When("data de Aniversario {string}")
	public void dataDeAniversario(String string) {
		escrever(By.id("birthdate"), string);
	}

	@When("Sexo Masculino")
	public void sexoMasculino() {
		clicarBotao(By.xpath("//label[text()='Male']"));
	}

	@When("Endereco {string}")
	public void endereco(String string) {
		escrever(By.id("streetaddress"), string);
	}

	@When("Pais {string}")
	public void pais(String string) {
		selecionarCombo("country", string);
	}

	@When("CEP {string}")
	public void cep(String string) {
		escrever(By.id("zipcode"), string);
	}

	@When("cidade {string}")
	public void cidade(String string) {
		escrever(By.id("city"), string);
	}

	@When("preencho a  profissao {string} e seleciono os Hobbies")
	public void preenchoAProfissaoESelecionoOsHobbies(String string) {
		selecionarCombo("occupation", string);
		clicarRadio(By.xpath("//label[text()=' Bungee Jumping']"));
		DriverManager.JS(
				"document.querySelector('#insurance-form > div > section:nth-child(2) > div.field.idealforms-field.idealforms-field-checkbox > p > label:nth-child(4) > span').click()");
		DriverManager.JS("document.querySelector('#nextenterproductdata').click()");
	}

	@When("Insiro os dados da cotacao")
	public void insiroOsDadosDaCotacao() {
		DriverManager.JS("document.querySelector('#enterproductdata').click()");
	
	}

	@When("Insiro a data de inicio {string}")
	public void insiroADataDeInicio(String string) {
		escrever(By.id("startdate"), string);
	}

	@When("Soma do seguro {string}")
	public void somaDoSeguro(String string) {
		selecionarCombo("insurancesum", string);
		
		
	}

	@When("Classificacao de merito {string}")
	public void classificacaoDeMerito(String string) {
		selecionarCombo("meritrating", string);
	}

	@When("tipo de cobertura {string}")
	public void tipoDeCobertura(String string) {
		selecionarCombo("damageinsurance", string);
	}

	@When("Produtos Opcionais Euro Protection")
	public void produtosOpcionaisEuroProtection() {
		DriverManager.JS("document.querySelector('#EuroProtection').click()");
		
	}

	@Then("Seleciono a cortesia {string} e clico em next")
	public void selecionoACortesiaEClicoEmNext(String string) {
		selecionarCombo("courtesycar", string);
		clicarBotao("nextselectpriceoption");
		
		
	}
	
	@When("Seleciono o Plano Gold")
	public void selecionoOPlanoGold() {
		DriverManager.JS("document.querySelector('#selectgold').click()");
	    
	}
	@Then("Clico em Next")
	public void clicoEmNext() {
		clicarBotao("nextsendquote");
	  
	}
	
	@When("Preencho os campos de Resposta de Email {string}")
	public void preenchoOsCamposDeRespostaDeEmail(String string) {
		escrever(By.id("email"), string);
	   
	}
	@When("Telefone {string}")
	public void telefone(String string) {
		escrever(By.id("phone"), string);
	}
	@When("usuario {string}")
	public void usuario(String string) {
		escrever(By.id("username"), string);
	  
	}
	@When("Senha {string} e Confirma a senha")
	public void senhaEConfirmaASenha(String string) {
		escrever(By.id("password"), string);
		escrever(By.id("confirmpassword"), string);
	
	}
	@When("Clica em {string}")
	public void clicaEm(String string) {
		clicarBotao(string);
	  
	}
	
	@Then("Mensagem de confirmacao {string}")
	public void mensagemDeConfirmacao(String string) throws InterruptedException {
		Thread.sleep(10000);
		obterTexto(By.xpath("//h2[text()='Sending e-mail success!']"));		
	}

}
