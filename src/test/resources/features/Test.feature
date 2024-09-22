Feature: Amazon search feature

  @smoke
  Scenario: Verify User is able to login to Book Store with correct credentials
    Given user navigates to "url"
    When user selects "Electronics" drop down menu
    And user enters "iPhone 13" value in search box
    Then verify suggestions are related to "iphone 13"
    And user enters "iPhone 13 128GB" value in search box 
    And click on 1 suggestion
    When select "iPhone 13 (128GB)" from search results
    Then verify new tab "Amazon.in: Electronics" opens
    And click on visit apple store
    When select "Apple Watch" from store
    And select "Apple Watch SE (GPS + Cellular)" from store
    Then click on "Quick look" showing on 1 product
    And verify newly opened modal is related to same product
    
    
    