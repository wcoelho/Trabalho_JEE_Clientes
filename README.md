# Trabalho JEE - Cadastro de Clientes e Fornecedores
Trabalho de Laboratório da disciplina "Arquitetura JEE 2019" - Cadastro de Clientes e Fornecedores  
  
#Requisitos  

* Deverá ser criada uma tela de cadastro de clientes com os seguintes dados:  
-- Nome  
-- CPF  
-- Email  
-- Data de Nascimento 
* Deverá ser criada uma tela de cadastro de fornecedores com os seguintes dados:  
-- Razão Social  
-- CNPJ  
-- Endereço  
-- Inscrição Municipal  
-- Email  
* Deverão ser criadas telas de listagem de clientes e de fornecedores, ambas possuindo DataTable e um botão de voltar para a tela de cadastro da respectiva entidade.  
* Dentro do contexto do Cliente, é obrigatório o preenchimento do nome e do cpf, sendo:  
-- O nome do cliente deve ter, no mínimo, 15 caracteres e, no máximo, 300 caracteres.  
-- O CPF deve conter, exatamente, 11 caracteres.  
-- O CPF deve ser único.  
-- Ao entrar dados incorretos nestes campos, deve-se apresentar uma mensagem de erro.  
-- Caso o CPF já exista para outro cliente, deve-se lançar a exceção CpfJaExistenteException, a qual deve utilizar RuntimeExcpetion como ancestral.  
* Dentro do contexto do Fornecedor, é obrigatório o preenchimento do cnpj, sendo:  
-- O CNPJ deve ser único.  
-- Caso o CNPJ já exista para outro fornecedor, deve-se lançar a exceção CnpjJaExistenteException, a qual deve utilizar RuntimeExcpetion como ancestral.  
* Para ambas entidades, os valores devem ser salvos no banco de dados e deve-se criar as estruturas e camadas necessárias para se armazenar os registros no banco de dados.
  
#Notas
**URL que direciona para lista de opções de cadastro:** http://localhost:8080/trabalho\_jee\_walter_coelho/
  
Cliente e Fornecedor iniciais adicionados automaticamente:  
  
**Nome:** Administrador  
**CPF:** 00011122233  
**Email:** admincust@sys.com  
**Nascimento:** 01/01/1978  
  
**Razão Social:** Administrador  
**CNPJ:** 00011122234  
**Endereço:** Rua Admin  
**Inscrição Municipal:** 1234567  
**Email:** adminsup@sys.com  

