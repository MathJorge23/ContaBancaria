# Projeto de Automação Bancária BDD

Este projeto foi desenvolvido como parte de uma atividade acadêmica para explorar os conceitos de Desenvolvimento Orientado a Comportamento (BDD) e automação de testes em um cenário de ambiente bancário.

## Descrição

O **Projeto de Automação Bancária BDD** simula um ambiente bancário simples, onde são testadas as operações de saque para clientes especiais e comuns. Utilizando a linguagem Gherkin, os cenários de teste são descritos de maneira legível e compreensível, proporcionando uma visão clara do comportamento esperado do sistema.

## Cenários de Teste

O projeto inclui dois cenários principais:

1. **Cliente Especial Realiza Saque:**
   - Um cliente especial com saldo negativo realiza um saque.
   - Verifica se o saque é efetuado corretamente e se o saldo é atualizado conforme esperado.

2. **Cliente Comum com Saldo Insuficiente:**
   - Um cliente comum com saldo negativo tenta realizar um saque.
   - Verifica se o saque não é efetuado e se o sistema retorna a mensagem adequada de saldo insuficiente.
     
3. **Imagens Console:**
![print_console](https://github.com/MathJorge23/ContaBancaria/assets/108235675/d51f2b0d-a480-4d9e-9c09-86be3a0f2878)

![print_feature](https://github.com/MathJorge23/ContaBancaria/assets/108235675/aa9e3cf8-3125-4a5b-808b-b73eb268fa15)

![scenarios_teste](https://github.com/MathJorge23/ContaBancaria/assets/108235675/4b629b4f-03a5-4645-b6bd-ddcfa7913150)

## Configuração e Execução

### Pré-requisitos

- Eclipse IDE ou IDE de sua preferência.
- Maven instalado.
- Java JDK 8 ou superior.

### Configuração do Projeto

1. Clone este repositório.
2. Importe o projeto na sua IDE como um projeto Maven existente.
3. Configure o Maven Build Path para o projeto.

### Executando os Testes

1. Abra a classe `ContaTestRunner.java`.
2. Execute a classe como um teste JUnit.

Os resultados dos testes serão exibidos no console da IDE.

## Contribuições

Contribuições são bem-vindas! Se você encontrar problemas ou tiver sugestões para melhorar o projeto, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Autor

Matheus Jorge da Silva






