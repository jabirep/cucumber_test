Feature: Login

  Scenario: Successsful Login using valid credentials
    Given user launch chromeBrowser and opens url "https://admin-demo.nopcommerce.com/login"
    When user enters username as "admin@yourstore.com" and password as "admin"
    And Click on login button
    Then Page title should be "Dashboard / nopCommerce administration"
    And close browser

  Scenario Outline: Successsful Login using valid credentials
    Given user launch chromeBrowser and opens url "https://admin-demo.nopcommerce.com/login"
    When user enters username as "<userName>" and password as "<password>"
    And Click on login button
    Then Page title should be "Dashboard / nopCommerce administration"
    And close browser

    Examples: 
      | userName            | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | admin    |
