Feature:Amazon
  @automated
Scenario:User wants to add a item to the basket
Given  User is on the homepage of the amazon site "Amazon.co.uk"
When User enters "toys" in search textbox
And User clicks on search button
When User selects a product
And User adds the product to basket
Then User should view the product added to basket "Basket subtotal"



