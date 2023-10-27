Feature: User login and add a customers details and search for customer

  Scenario Outline: Two Successsful Login one after another using valid credentials and add customer and search for added customer
    Given user launch chromeBrowser and opens url "https://admin-demo.nopcommerce.com/login"
    When user enters username as "<username>" and password as "<passwords>"
    And Click on login button
    Then Page title should be "Dashboard / nopCommerce administration"
    Then user go to Customers page and add two customer details including fields like "<email>" "<password>" "<firstName>" "<lastName>" "<DOB>" "<companyName>" "<comments>"
    Then user search for added customer details using "<firstName>"
    And close browser

    Examples: 
      | email            | password | firstName | lastName | DOB       | companyName | comments                | username            | passwords |
      | df@yourstore.com | adm123   | jeer      | khann    | 9/02/1996 | kran        | software enthusiast     | admin@yourstore.com | admin     |
      | fd@mystore.com   | an333    | jinnna    | joss     | 9/08/1994 | infosys     | embedded systems seeker | admin@yourstore.com | admin     |
