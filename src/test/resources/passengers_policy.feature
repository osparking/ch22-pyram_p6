#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@byPassengerLevel
Feature: 항공편에서 승객 제거/이동 정책
  승객 등급 VIP 여부에 따라 승객을 항공편에서 제거 가능한지 결정한다

  @byLevel
  Scenario Outline: 일반 승객용 항공편 승객 이동 정책
    Given 한 항공편 - 번호는 "<flightNumber>" 좌석은 <seats>개, "<file>"에 승객 정보가 있다
    When 일반 승객이 여러 명 있다
    Then 우리는 일반 승객들을 항공편에서 제거할 수 있다
    And 일반 승객들을 다른 항공편에 넣을 수 있다

    Examples: 
      |flightNumber  | seats  | file                       |
      |  AA1234      | 50     | flights_information.csv    |
      |  AA1235      | 50     | flights_information2.csv   |
      |  AA1236      | 50     | flights_information3.csv   |

  @byLevel
  Scenario Outline: VIP 승객의 항공편 변경 정책
    Given 한 항공편 - 번호는 "<flightNumber>" 좌석은 <seats>개, "<file>"에 승객 정보가 있다
    When VIP 승객이 여러 명 있다
    Then 우리는 VIP 승객들을 항공편에서 제거할 수 없다

    Examples: 
      |flightNumber  | seats  | file                       |
      |  AA1234      | 50     | flights_information.csv    |
      |  AA1235      | 50     | flights_information2.csv   |
      |  AA1236      | 50     | flights_information3.csv   |
