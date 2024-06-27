@SignUp
Feature: TC 01 Verificar que un usuario pueda crear una cuenta nueva en el sistema de Camper Control

  Background:
    Given El usuario navega a la url

  Scenario: TC 1.1 Acceder a la sección de la página para crear una cuenta nueva
    When El usuario hace click en el botón de CrearCuentaNueva
    Then Se muestra el ProfileUpdate
    Then El usuario hace click en el botón de SoyNuevoEnCamperControl
    And El usuario es dirigido a la página de Registro
    Then El usuario escribe el correoParaRegistro en el cuadro de CorreoElectronico
    Then El usuario escribe el correoParaRegistro en el cuadro de ConfirmaCorreoElectronico
    Then El usuario escribe el passwordParaRegistro en el cuadro de Contrasena
    Then El usuario escribe el passwordParaRegistro en el cuadro de ConfirmaContrasena
    Then El usuario escribe el Nombre1 en el cuadro de NombrePrincipal
    Then El usuario escribe el ApellidoP1 en el cuadro de ApellidoPaternoPrincipal
    Then El usuario escribe el ApellidoM1 en el cuadro de ApellidoMaternoPrincipal
    Then El usuario escribe el TelMovil1 en el cuadro de TelefonoMovilPrincipal
    Then El usuario escribe el TelCasa1 en el cuadro de TelefonoCasaPrincipal
    Then El usuario escribe el TelOficina1 en el cuadro de TelefonoOficinaPrincipal
    Then El usuario escribe el Nombre2 en el cuadro de NombreSegundoTutor
    Then El usuario escribe el ApellidoP2 en el cuadro de ApellidoPaternoSegundoTutor
    Then El usuario escribe el ApellidoM2 en el cuadro de ApellidoMaternoSegundoTutor
    Then El usuario escribe el TelMovil2 en el cuadro de TelefonoMovilSegundoTutor
    Then El usuario escribe el TelOficina2 en el cuadro de TelefonoOficinaSegundoTutor
    Then El usuario escribe el TelCasa2 en el cuadro de TelefonoCasaSegundoTutor
    Then El usuario escribe el emailSegundoTutor en el cuadro de EmailSegundoTutor
    Then El usuario selecciona la casilla de TerminosYcondiciones



#  Scenario Outline: TC 1.2 Successful login with valid credentials
#    And The user gets <title> as a title
#    When The user enters emailAdress in the emailBox
#    And The user clicks on nextButton
#    And The users password is password in the passwordBox
#    And The user clicks on loginButton
#    Then The user should be redirected to <endpoint>
#    And The user clicks on userLink
#    And The user clicks on logOutButton
#    Examples:
#      | title | endpoint |
#      | Zoho Accounts | homeurl |
#
#  Scenario: TC 1.3 Error message is correctly displayed if a valid credential is missing
#    When The user clears the emailBox
#    And The user clicks on nextButton
#    Then The user gets the message missingMessage
#
#  Scenario: TC 1.4 Error message is correctly displayed if a valid credential is invalid
#    When The user enters unregisteredEmailAdress in the emailBox
#    And The user clicks on nextButton
#    Then The user gets the message invalidMessage
