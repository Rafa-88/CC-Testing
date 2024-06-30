@Navigation
Feature: TC 02 Navegación de la Página Web de Camper Control

  Background:
    Given El usuario navega a la url

  Scenario: TC 2.1 Se tiene acceso a la página web de "Camper Control"
    And El usuario es dirigido a la página con el título de Camper Control

  Scenario: TC 2.2 Hacer login exitoso con credenciales válidas
    When El usuario escribe su correo en el cuadro de Email
    And El usuario escribe el password en el cuadro de EnterPassword
#    And El usuario hace click en el botón de LogIn
#    And El usuario es dirigido a la página de Dashboard



#  Scenario Outline: TC 2.1 The user navigates through the dropdown menu called "Empresas"
#    Given The user clicks on navigationMenu
#    When I go to <section> button using the dropdown menudropdown
#    Then The user should be redirected to <endpoint>
#    And The user gets <title> as a title
#    Examples:
#      | section              | endpoint        | title                                                    |
#      | Acerca de nosotros   | aboutUsurl      | Acerca de Zoho                                           |
#      | Nuestra historia     | ourStoryurl     | Nuestra historia \| Zoho                                 |
#      | Revitalización rural | ruralRevivalurl | Rural Revival \| Zoho                                    |
#      | Prensa               | pressurl        | Zoho - Press Releases                                    |
#      | Events               | eventsurl       | Zoho Events - Upcoming Events, Trade Shows, and Webinars |
#      | Careers              | careersurl      | Zoho Corporation \| Careers                              |
#      | Humans of Zoho       | humansOfZohourl | Humans of Zoho                                           |
#
#  Scenario: TC 2.2 The user navigates to the "Clientes" page
#    Given The user clicks on clientes
#    And The user gets Zoho Customer Success Stories & Testimonials as a title
#
#
#  Scenario: TC 2.3 The user selects the "Products" menu
#    Given The user clicks on products
#    And The user gets the ProductsMenu
#
#  Scenario Outline: TC 2.4 The user is able to change the webpage language successfully
#    Given The user clicks on languageSelectMenu
#    When I go to <section> button using the dropdown languageSelectButton
#    And The user gets <title> as a title
#    Examples:
#      | section | title                                        |
#      | en      | Zoho \| Cloud Software Suite for Businesses  |
#      | pt-br   | Zoho \| Cloud Software Suite para empresas   |
#      | de      | Zoho \| Cloud-Software-Suite für Unternehmen |
#      | fr      | Zoho \| Cloud Software Suite for Businesses  |
#      | nl      | Zoho \| Cloud Software Suite voor bedrijven  |
#      | ar      | Zoho \| مجموعة البرامج السحابية للشركات      |
#
#
#
#
