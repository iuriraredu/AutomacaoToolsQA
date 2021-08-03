#language: pt
#enconding: UTF-8
#author: teamone
#date: 03/08/2021
#version: 1.0

Funcionalidade: Formulario do site ToolsQA

  Contexto: Acessar Página de Forms
    Dado que clico no card "Forms"

  @web @Formulario
  Cenario: Preencher Formulario
    Dado que navego ate a pagina de "Practice Form"
    E preencho todos os campos com dados validos
    Quando aberto em "Submit"
    Entao eh apresentado um pop-up com os dados que foram preenchidos