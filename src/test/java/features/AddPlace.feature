@AddPlace 
Feature: validate the add place
@Regression
Scenario Outline: verify the add place API
    Given Add place payload "<name>" "<address>"
    When user calls "AddPlace" api with "post" http requet
    Then "status" response body is "OK"
    
Examples: 
	     | name | address|
 #     |Frontline house|29, side layout, cohen 09|
 #     |shweta house|20, side layout, germany 20 |
      
#@Regression
#Scenario: verify the delete place API
#    Given delete place payload 
#    When user calls "deletePlace" api with "post" http requet
#    Then "status" response body is "OK"
    