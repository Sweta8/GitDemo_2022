Feature: Validating Place API

@AddPlace
Scenario Outline: Verify new Place is successfully created using AddPlace API
Given Add Place Payload with "<name>" "<language>" "<address>"
When user calls "AddPlaceAPI" with "Post" http request
Then the API call is success with the status code 200
And "status" in response body is "OK"
And "scope" in response body is "APP"
And verify place_id created maps to "<name>" using "GetPlaceAPI"

Examples:
	|name  |language |address|
	|Ahouse|English  |sonari |
	|check|Hindi     |Jsr    |   
	
	