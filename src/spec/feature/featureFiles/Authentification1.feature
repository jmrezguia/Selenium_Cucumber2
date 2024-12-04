@authentification @regression
Feature: Je souhaite vérifier la page de connexion
  En tant que utilisateur je souhaite vérifier la page de connexion

  @authentification-valid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopCommerce
    When Je saisie l email "admin@yourstore.com"
    And Je saisie le password "admin"
    And Je clique sur le bouton logIn
    Then Je redirige vers la page home "Dashboard"

  @authentification-invalid
  Scenario: Je souhaite vérifier la page de connexion
    Given Je me connecte sur l application nopCommerce
    When Je saisie l email "example@yourstore.com"
    And Je saisie le password "example"
    And Je clique sur le bouton logIn
    Then Je verifie le message d erreur "Login was unsuccessful. Please correct the errors and try again"

  @logout
  Scenario: Je souhaite me deconnecter
    Given Je me connecte sur l application nopCommerce
    When Je saisie l email "admin@yourstore.com"
    And Je saisie le password "admin"
    And Je clique sur le bouton logIn
    When Je clique sur le bouton logout
