#language: pt
#enconding: UTF-8
#author: teamone
#date: 03/08/2021
#version: 1.0

@Elements
Funcionalidade: Elementos do site ToolsQA

  Como um usuario do ToolsQA
  Quero testar todos os elementos
  Para aprender a mapear elementos em cenários de teste web

  Contexto: Acessar Página de Elements
    Dado que clico no card "Elements"

  @web @TextBox
  Esquema do Cenario: Realizar preenchimento de TextBox
    Dado que navego ate pagina de "TextBox"
    E realizo preenchimento dos campos "<Full_Name>", "<Email>", "<Current_Address>" e "<Permanent_Address>"
    Quando clico no botao "Submit"
    Entao eh apresentado os campos "<Full_Name>", "<Email>", "<Current_Address>" e "<Permanent_Address>" preenchidos corretamente

    Exemplos:
      | Full_Name    | Email                | Current_Address | Permanent_Address |
      | Mariah Carey | mariah@epic.com      | NYC, US         | TX, US            |
      | Beyoncé      | beyonce@parkwood.com | TX, US          | NYC, US           |

  @web @CheckBox
  Cenario: Selecionar a opcao "Private"
    Dado que navego ate pagina de "CheckBox"
    E clico na seta ao lado de "Home"
    E clico na seta ao lado de "Documents"
    E clico na seta ao lado de "Office"
    Quando clico em "Private"
    Entao é apresentado a mensagem "You have selected :private"

  @web @WebTables @Inclusao
  Cenario: Inserir dados em uma Web Table
    Dado que navego ate pagina de "Web Tables"
    E clico no botao de "Add"
    E preencho os dados solicitados
    Quando clico no botao para "Submit"
    Entao eh listado os dados inseridos na Web Table

  @web @WebTables @Alteracao
  Cenario: Alterar dados em uma Web Table
    Dado que navego ate pagina de "Web Tables"
    E clico no botao com o simbolo de um lapis na linha de First Name "Cierra"
    E altero os dados solicitados
    Quando clico no botao para "Submit"
    Entao eh atualizado os dados da linha da Web Table

  @web @WebTables @Exclusao
  Cenario: Excluir dados em uma Web Table
    Dado que navego ate pagina de "Web Tables"
    Quando clico no botao com o simbolo de um lixeira na linha de First Name "Cierra" e Last Name "Vega"
    Entao a linha de First Name Cierraa da Web Table não está mais visivel
