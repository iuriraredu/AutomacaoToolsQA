#language: pt
#enconding: UTF-8
#author: teamone
#date: 27/05/2021
#version: 1.0


@Formulario
Funcionalidade: Elementos do site ToolsQA

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