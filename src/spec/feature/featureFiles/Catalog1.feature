@catalog
Feature: Je souhaite chercher un produit dans le  catalogue
  En tant que utilisateur je souhaite chercher un produit dans le  catalogue

  Background: 
    Given Je me connecte sur l application nopCommerce
    When Je saisie l email "admin@yourstore.com"
    And Je saisie le password "admin"
    And Je clique sur le bouton logIn
    Then Je redirige vers la page home "Dashboard"
    When Je clique sur catalog

  @searsh_product
  Scenario: Je souhaite chercher un produit dans le  catalogue
    When Je clique sur l option products
    And Je saisis le nom de produit "shirt"
    And Je choisis dans le categorie  l option d une valeur  "11"
    And Je clique sur l option search
    And Je choisis la marque de produit "Nike"
    And Je clique sur le bouton search
    Then le produit affiche "Nike Tailwind Loose Short-Sleeve Running Shirt"

  @add_a_new_category
  Scenario: Je souhaite ajouter un nouveau categorie
    When Je clique sur le sous menu categories bouton
    And Je clique sur le bouton Add new
    And Je saisie le nom "Coffee And Cats TShirt /Unisex/ Funny Design Addict Coffee, Coffee Drinker Lover Starbucks Gift, Foodie Gift"
    And Je passe à l iframe avec id "Description_ifr" "
    And Je saisie "Ce t-shirt est tout ce dont vous avez rêvé et plus encore. Il est doux et léger, avec ce qu'il faut d'élasticité. Il est agréable et flatteur pour tous. " dans le champ avec id "tinymce"
    And Je reviens au contenu principal1
    And Je selectionne l option "Apparel"
    And Je choisis un fichier pour Upload "C:\\Users\\jihen\\OneDrive\\Bureau\\tshirt\\coffee & cats\\COFFEE MURDER IS WRONG\\coffee.png"
    And Je clique sur le bouton Save
    And J accepte l alerte
    And Je cherche  le nom de produit "Coffee And Cats TShirt /Unisex/ Funny Design Addict Coffee, Coffee Drinker Lover Starbucks Gift, Foodie Gift" dans le champ avec l id "SearchCategoryName"
    Then Je verifie que la nouvelle categorie a ete ajoute "The new category has been added successfully."

  @manufacturers
  Scenario: Je souhaite ajouter un nouveau fabricant
    When Je clique sur le sous menu manufacturers
    And Je clique sur le bouton addnew
    And Je saisis le nom de fabricant "louis vuitton"
    And Je passe a l iframe avec id1 "Description_ifr"
    And Je saisie "une entreprise internationale spécialisée dans la fabrication de vétements et de chaussures " dans le champ avec id1 "tinymce"
    And Je reviens au contenu principal
    And Je clique sur le bouton save1
    And Je saisis dans la barre de recherche "louis vuitton" dans le champ avec l id "SearchManufacturerName"
    And Je selectionne l option d une valeur "1"
    And Je clique sur le bouton search1
    Then Je devrais voir le message "The new manufacturer has been added successfully"
