@customers
Feature: Je souhaite ajouter un nouveau client
  En tant que utilisateur Je souhaite ajouter un nouveau client

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisie l email "admin@yourstore.com"
    And Je saisie le password "admin"
    And Je clique sur le bouton logIn
    Then Je redirige vers la page home "Dashboard"

  @add_a_new_customer
  Scenario: Je souhaite ajouter un nouveau client
    Given Je clique sur customers
    When Je clique sur le sous menu customers
    And Je clique sur le bouton add new
    And Je saisis l email "elinem24@gmail.com"
    And Je saisis le password "eline123"
    And Je saisis le prenom "eline"
    And Je saisis le nom "ange"
    And Je coche sur l option feminin
    And Je saisis la date de naissance "12/05/1998"
    And Je selectionne le role "Vendors" dans la liste deroulante
    And Je clique sur le bouton save
    Then Je verifie que le nouveau client a ete ajoute "The new customer has been added successfully."
