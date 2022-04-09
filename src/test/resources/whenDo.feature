Feature: whenDo
  @WhenDo
  Scenario: whenDo Task
    Given  I have access to WhenDo app
    When I create a new task
      |title|Taller final|
      |notes|detalles|
    Then the task "Taller final" and "detalles" should be created