@multiusers
Feature: Je souhaite verifier la connexion avec plusieurs utilisateurs
  ETQ utilisateur je souhaite verifier la connexion avec plusieurs utilisateurs

  Background: 
    Given Je me connecte sur l application nopCommerce

  @authentificationmultiusers
  Scenario Outline: Je souhaite verifier la connexion avec plusieurs utilisateurs
    Given Je saisie l email "<name>"
    When Je saisie le password "<value>"
    And Je clique sur le bouton logIn

    Examples: 
      | name                  | value   |
      | admin@yourstore.com   | admin   |
      | john@yourstore.com    | john    |
      | eline@yourstore.com   | eline   |
      | camille@yourstore.com | camille |
