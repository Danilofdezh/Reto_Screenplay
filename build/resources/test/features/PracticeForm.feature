Feature: Practice form

  @testFaker
  Scenario: Full practice form faker
    Given that a web user wants to practice form in demoqa
    When he fills all the requested fields in form section
    Then The information is displayed and a screenshot is taken.

  @testProperties
  Scenario: Full practice form properties
    Given that a web user wants to practice form in demoqa
    When he fills all the requested fields in form section with properties
    Then The information is displayed and a screenshot is taken with properties

  @testExcel
  Scenario: Full practice form Excel
    Given that a web user wants to practice form in demoqa
    When he fills all the requested fields in form section with excel
    Then The information is displayed and a screenshot is taken with excel