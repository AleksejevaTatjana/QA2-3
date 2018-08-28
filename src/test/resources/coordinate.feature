Feature: Testing coordinates for weather

  Scenario: Coordinates test
    When we getting weather from server
    Then lon is -0.13
    And lat is 51.51
    And weather following data is
      | id          | 300                     |
      | main        | Drizzle                 |
      | description | light intensity drizzle |
      | icon        | 09d                     |

    And base is stations
    And the main is
      | temp     | 280.32 |
      | pressure | 1012   |
      | humidity | 81     |
      | temp_min | 279.15 |
      | temp_max | 281.15 |

    And visibility is 10000
    And the wind is
      | speed | 4.1 |
      | deg   | 80  |

    And clouds all is 90
    And dt is 1485789600
    And the sys is
      | type    | 1          |
      | id      | 5091       |
      | message | 0.0103     |                                                                    
      | country | GB         |
      | sunrise | 1485762037 |
      | sunset  | 1485794875 |

    And id is 2643743
    And name is London
    And cod is 200