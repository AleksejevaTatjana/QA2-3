Feature: Testing coordinates for weather

  Scenario: Coordinates test
    When we getting weather from server
    Then lon is -0.13
    And lat is 51.51
    Then weather following data is
      | id          | 300                     |
      | main        | Drizzle                 |
      | description | light intensity drizzle |
      | icon        | 09d                     |
    And base is stations
    Then the main temp is 280.32 and pressure is 1012 the humidity is 81 and temp_min is 279.15 and temp_max is 281.15
    And visibility is 10000
    Then the wind data and speed is 4.1 and deg is 80
    And clouds all is 90
    Then dt is 1485789600
    And the sys type is 1 and id is 5091 message is 0.0103 country is GB and sunrise is 1485762037 and sunset is 1485794875
    Then id is 2643743
    And name is London
    Then cod is 200