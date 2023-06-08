@Lead
Feature: Leads functionality

#  Scenario: Check the user name
#    Given The user is on tt Site
#    When The logged user and the user name is same or not
#    Then The user is continue to process.

  @S1
#  Scenario: Check the Leads redirection from side menu
#    Given The user on the site
#    When The user click on Leads option
#    Then The user redirect to Leads page
#    And Click on add lead button
#    Then The add lead information page is open
#    And Fill all the fields
#    And Click on the save button
#    Then The new lead is create



#  Scenario: Check the Lead is edit proper
#    Given The user on the lead page
#    And user is see the dropdown menu link
#    When User click on the dropdown menu link
#    And choose on edit option
#    And Change the lead name
#    And click on save button
#    Then The lead changes is done

#  Scenario: Check a user on Leads detail page
#    Given The user on the site
#    And The user on the leads page
#    When user find the user's id
#    And check the user id is match or not
#    Then The messaeg is display for user is match
#    When Click on operation icon
#    And choose delete option from drop-down list
#    And click on pop-up for delete the data
#    Then Message is display the row delete successfully.


#  @S1
#  Scenario: Check the selected Lead is deleted proper
#
#    Given User is on the Leads page
#    And user is able to see Dropdown Menu Link
#    When User clicks on the Dropdown menu link
#    And Choose on delete option
#    And Click on yes,delete it option from the pop-up box
#    Then The data is delete successfully


  Scenario: Clock-in and match clock-in time
    Given The user on the TT site
    And Click on private dashboard option
#    And Check the clock-in times
    And Click on clock-in button first
    And Click on clock-in button from pop-up
    Then The click-in successfully
    And Check the clock-in time
    And Match clock-in time with System time
    And Match clock-in Time
#    Then The clock-in time is match