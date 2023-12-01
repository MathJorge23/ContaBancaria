import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Conta {
	/**
	 * Variável para armazenar o saldo atual do cliente.
	 */
	private double saldoAtual;

	/**
	 * Cenário 1: Cliente especial realiza um saque.
	 *
	 * @param valor O saldo inicial do cliente especial (negativo).
	 * @throws Throwable Exceção lançada para indicar que a implementação ainda não foi feita.
	 */
	@Given("^Um cliente especial com saldo atual de -(\\d+) reais$")
	public void um_cliente_especial_com_saldo_atual_de_reais(double valor) throws Throwable {
	    this.saldoAtual = -valor;
	    throw new PendingException();
	}

	/**
	 * Passo 1: Cliente especial solicita um saque.
	 *
	 * @param valorDoSaque O valor do saque solicitado pelo cliente especial.
	 * @throws Throwable Exceção lançada se ocorrer um erro durante a execução.
	 */
	@When("^for solicitado um saque no valor de (\\d+) reais$")
	public void for_solicitado_um_saque_no_valor_de_reais(double valorDoSaque) throws Throwable {
	    // Simulação: Verifica se o valor do saque não ultrapassa o saldo
	    if (valorDoSaque <= Math.abs(saldoAtual)) {
	        saldoAtual -= valorDoSaque;
	    }
	}

	/**
	 * Passo 2: Cliente especial verifica se o saque foi efetuado corretamente.
	 *
	 * @param novoSaldo O novo saldo esperado após o saque.
	 * @throws Throwable Exceção lançada se ocorrer um erro durante a execução.
	 */
	@Then("^deve efetuar o saque e atualizar o saldo da conta para -(\\d+) reais$")
	public void deve_efetuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(double novoSaldo) throws Throwable {
	    // Verifica se o saldo foi atualizado após o saque
	    assertEquals(-novoSaldo, saldoAtual);
	}

	/**
	 * Passo 3: Cliente especial verifica outros resultados, se necessário.
	 *
	 * @throws Throwable Exceção lançada se ocorrer um erro durante a execução.
	 */
	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Implementação dos resultados adicionais se necessário
	}

	/**
	 * Cenário 2: Cliente comum tenta sacar com saldo negativo.
	 *
	 * @param valor O saldo inicial do cliente comum (negativo).
	 * @throws Throwable Exceção lançada se ocorrer um erro durante a execução.
	 */
	@Given("^Um cliente comum com saldo atual de -(\\d+) reais$")
	public void um_cliente_comum_com_saldo_atual_de_reais(int valor) throws Throwable {
	    this.saldoAtual = -valor;
	}

	/**
	 * Passo 1: Cliente comum solicita um saque.
	 *
	 * @param valorDoSaque O valor do saque solicitado pelo cliente comum.
	 * @throws Throwable Exceção lançada se ocorrer um erro durante a execução.
	 */
	@When("^solicitar um saque de (\\d+) reais$")
	public void solicitar_um_saque_de_reais(int valorDoSaque) throws Throwable {
	    // Simulação: Cliente comum não pode sacar se o saldo for negativo
	    if (saldoAtual >= 0 && valorDoSaque <= saldoAtual) {
	        saldoAtual -= valorDoSaque;
	    }
	}

	/**
	 * Passo 2: Cliente comum verifica se o saque não foi efetuado e retorna mensagem de saldo insuficiente.
	 *
	 * @throws Throwable Exceção lançada se ocorrer um erro durante a execução.
	 */
	@Then("^não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente$")
	public void nao_deve_efetuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() throws Throwable {
	    // Verifica se o saldo não foi alterado (ou seja, o saque não foi efetuado)
	    assertFalse(saldoAtual < 0);
	}

	
}
