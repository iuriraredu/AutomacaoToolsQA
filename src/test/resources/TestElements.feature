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