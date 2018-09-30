Feature: Testing customer registration

  Scenario Outline: To registrate the customer
    Given customer data
      | email       | a@b.com                                                                                                                    |
      | phone       | +371 6111111                                                                                                               |
      | pwd         | 111aaa                                                                                                                     |
      | birthDate   | 60                                                                                                                         |
      | description | Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua |

    And address is
      | country | US        |
      | city    | New York  |
      | state   | John Doe  |
      | zip     | LV-1011   |
      | street  | Ropazu 10 |

    When we getting customer data from RequesterResponse

    Then answer is  On success
      | result  | true |
      | details | none |

    Then we are trying register data with missed field
      | email       | a@b.com      |
      | phone       | +371 6111111 |
      | pwd         | 111aaa       |
      | birthDate   | 60           |
      | description |              |

    And answer is On error:
      | result  | false |
      | details | Field XXX missed |

    Then we are trying to get