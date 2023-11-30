Feature: Creacion cuenta Spotify
  Como usuario que le gusta la musica y no quiere pagar por discos
  Quiero ingresar a la aplicacion spotify
  Para crear mis listas de musica con diversos artistas

  Scenario: Creacion cuenta Spotify -  correo utilizado
    Given Estoy en la pagina de spotify
    And Presiono el boton registrarte en home de spotify
    When Ingreso en el campo direccion correo el valor "domingo.saavedra.saavedra@gmail.com" en formulario de registro
    And Presiono el boton siguiente en formulario de registro
    Then Visualizo mensaje de error "Esta dirección ya está vinculada a una cuenta. Para continuar, inicia sesión."

  Scenario: Creacion cuenta Spotify -  correo utilizado
    Given Estoy en la pagina de spotify
    And Presiono el boton registrarte en home de spotify
    When Ingreso en el campo direccion correo el valor "domingo.saavedra.saavedra@gmail.com" en formulario de registro
    And Presiono el boton siguiente en formulario de registro
    Then Visualizo mensaje de error "Esta dirección ya está vinculada a una cuenta. Para continuar, inicia sesión."

  Scenario: Creacion cuenta Spotify -  correo utilizado
    Given Estoy en la pagina de spotify
    And Presiono el boton registrarte en home de spotify
    When Ingreso en el campo direccion correo el valor "domingo.saavedra.saavedra@gmail.com" en formulario de registro
    And Presiono el boton siguiente en formulario de registro
    Then Visualizo mensaje de error "Esta dirección ya está vinculada a una cuenta. Para continuar, inicia sesión."
