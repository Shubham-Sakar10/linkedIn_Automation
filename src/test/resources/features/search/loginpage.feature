Feature: feature to test login functionality

  @test1
  Scenario Outline: check the login is successful with the valid credentials

    Given user is log in to the site with credentials with <username>,<Password>
    Then User is opening profile and update the profile

    Examples:
      | username                | Password    |
      | shubhameb1997@gmail.com | Messi@12345 |


