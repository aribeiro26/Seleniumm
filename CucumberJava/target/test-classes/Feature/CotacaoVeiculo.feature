Feature: Cotacao de veiculos

  Scenario: Preencher dados do veiculo
    Given Acesso a pagina inicial
    When Seleciono a Marca do veiculo
    And Potencia de "100"
    And Perfomace em "50"
    And Data da fabricacao "02/04/2021"
    And Capacidade do carro para 
    And lado da direcao direta como No
    And Numero de assentos como "3"
    And o tipo de combustive "Gas"
    And capacidade de carga "1000"
    And Peso total "1000"
    And preco "1000"
    And License "12345567"
    When Quando termino de Preenche o campo com "110" milhas
    Then Clico em Next e Avanco para Proxima Pagina
    When Preencho o campo Nome "Alexisandro"
    And Sobrenome "Ribeiro"
    And data de Aniversario "03/24/1994"
    And Sexo Masculino
    And Endereco "Araraquara"
    And Pais "Brazil"
    And CEP "14808000"
    And cidade "Araraqura"
    When preencho a  profissao "Public Official" e seleciono os Hobbies
    Then Clico em Next e Avanco para Proxima Pagina
    When Insiro os dados da cotacao
    And Insiro a data de inicio "05/25/2021"
    And Soma do seguro " 3.000.000,00"
    And Classificacao de merito "Bonus 1"
    And tipo de cobertura "Partial Coverage"
    And Produtos Opcionais Euro Protection
    Then Seleciono a cortesia "No" e clico em next
    When Seleciono o Plano Gold 
    Then Clico em Next
    When Preencho os campos de Resposta de Email "alexetec.ribeiro@gmail.com"
    And Telefone "16997818026"
    And usuario "teste"
    And Senha "Cypress2021" e Confirma a senha 
    When Clica em "sendemail"
    Then Mensagem de confirmacao "Sending e-mail success!" 
     
  
    
    
