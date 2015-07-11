Meta:
@positive
@nonRegisteredUser

Narrative:
As a guest user
I want to search by phone name
So that I can see this phone first in search results

Scenario: Search by phone name
Given a main page is opened
When I perform search by phone <phoneName>
And open first search results link
Then I see phone <phoneName> <phoneCompany>

Examples:
|phoneCompany|phoneName|
|htc|htc one m9|
|apple|iphone 6|
|samsung|galaxy s6|

