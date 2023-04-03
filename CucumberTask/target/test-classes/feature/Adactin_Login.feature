Feature: Verify Adactin Hotel Login

  Scenario Outline: Verify Adactin Hotel Login With Valid Credentials
    When User Should Login Using"<Username>"and"<Password>"
    And User Should Search Hotels By "<Loacation*>","<Hotels>","<Roomtype>","<Number of Rooms*>", "<Check In Date*>","<Check Out Date*>","<Adults per Room*>","<Children per Room>"
    And User Should Select Hotel
    And User Should Book Hotel By"<First Name*>","<Last Name*>","<Billing Address*>""<Credit Card No.*>","<Credit Card Type*>","<Expiry Date*>","<CVV Number*>"
    Then User Should Select Hotel

    Examples: 
      | Username  | Password | Loacation   | Hotels         | Roomtype     | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address | Credit Card No   | Credit Card Type | Expiry Month | ExpiryYear | CVV Number |  |
      | Princesan | Elan246# | Sydney      | Hotel Sunshine | Double       | 2 - Two         | 17/07/2022    | 18/07/2022     | 1 - One         | 1 - One           | Nishanth   | K         | omr             | 6789456776543456 | American Express | February     |       2013 |        566 |  |
      | Princesan | Elan246# | Melbourne   | Hotel Creek    | Standard     | 2 - Two         | 15/08/2022    | 18/08/2022     | 3 - Three       | 0 - None          | Nivetha    | k         | ecr             | 4512369852156452 | VISA             | January      |       2015 |        366 |  |
      | Princesan | Elan246# | Brisbane    | Hotel Hervey   | Deluxe       | 3 - Three       | 12/07/2022    | 15/07/2022     | 3 - Three       | 3 - Three         | kumar      | k         | nir             | 4512369875123654 | Master Card      | March        |       2013 |        655 |  |
      | Princesan | Elan246# | Adelaide    | Hotel Hervey   | Super Deluxe | 4 - Four        | 30/08/2022    | 05/09/2022     | 4 - Four        | 4 - Four          | sharmila   | k         | roy             | 2315648597851236 | Other            | March        |       2012 |        255 |  |
      | Princesan | Elan246# | London      | Hotel Cornice  | Standard     | 5 - Five        | 05/07/2022    | 08/07/2022     | 1 - One         | 0 - None          | amutha     | k         | nek             | 7845123265987845 | American Express | January      |       2013 |        356 |  |
      | Princesan | Elan246# | New York    | Hotel Hervey   | Super Deluxe | 6 - Six         | 16-07-2022    | 17-07-2022     | 4 - Four        | 2 - Two           | san        | jk        | namakkal        | 6576543211234567 | VISA             | June         |       2018 |        456 |  |
      | Princesan | Elan246# | Los Angeles | Hotel Creek    | Double       | 7 - Seven       | 17-07-2022    | 18-07-2022     | 2 - Two         | 3 - Three         | karan      | karuna    | karur           | 9566543211234567 | American Express | July         |       2019 |        789 |  |
      | Princesan | Elan246# | Paris       | Hotel Sunshine | Standard     | 8 - Eight       | 17-07-2022    | 17-07-2022     | 1 - One         | 2 - Two           | san        | bala      | palani          | 9876893211234567 | Master Card      | August       |       2018 |        456 |  |
      | Princesan | Elan246# | Sydney      | Hotel Creek    | Double       | 9 - Nine        | 16-07-2022    | 17-07-2022     | 2 - Two         | 4 - Four          | krisnan    | hari      | kumbakonam      | 9876323211234567 | American Express | September    |       2017 |        654 |  |
      | Princesan | Elan246# | London      | Hotel Creek    | Deluxe       | 10 - Ten        | 17-07-2022    | 17-07-2022     | 3 - Three       | 2 - Two           | san        | abishek   | ramanathapuram  | 9877843211234567 | Master Card      | October      |       2016 |        753 |  |
