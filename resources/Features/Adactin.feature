Feature: To booking the room and get the Order number

  Scenario Outline: To Login Adactin website with valid credentials
    Given User needs to land in the Adactin Home Page
    When User needs to fill the "<username>" and "<password>"
    And User needs to click the login button
    Then Verify User is successfully get into the Adactin Hotel booking page

    Examples: 
      | username  | password  |
      | Gowthami | Poorni |

     Scenario: To Search Hotel in the Adactin website
     Given User needs to land in the Adactin Search page
     When User needs to select Location
     And User needs to select Hotels
     And User needs to select Roomtype
     And User needs to select NoOfRooms
     And User needs to select NoOfAdult
     And User needs to select NoOfChildren
     And User needs to click the Search button
     Then Verify User is successfullt get into the Hotel details page
     
     Scenario: To confirm the Hotel booking
     Given User needs to land in the Hotel details Page
     When User needs to click on the selected Hotel
     And user needs to click Continue for proceeding further
     Then Verify User is successfully get into the Payment page
     
     Scenario: To Book the selected Hotel
     Given User needs to land in the Hotel Payment Page
     When User needs to fill firstname
     And User needs to fill lastname
     And User needs to fill address
     And User needs to fill ccnum
     And User needs to select cctype
     And User needs to select ccmonth
     And User needs to select ccyear
     And User needs to fill cvv
     And User needs to click the book button
     Then Verify User is in the Booking Confirmation Page
     
     Scenario: To print the Order no and Price 
     Given User needs to land in the Booking confirmation page
     When print the Order no and price
     And User needs to click the logout button
     Then Verify User is in logout page
     
     
     