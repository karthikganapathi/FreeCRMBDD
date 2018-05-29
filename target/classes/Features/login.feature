Feature: SOUTH WEST AIRLINES

#Scenario: SOUTH WEST AIRLINES TEST
#
#When user need to enter the url
#
#Then user will be on homepage
#
#Then user enter the "<from>"  and "<to>" field 
#
#And users clicks on searchbutton
#
#But user shloud move to another page
#
#Then user need to close the app



Scenario Outline: SOUTH WEST AIRLINES TEST

When user need to enter the url

Then user will be on homepage

Then user enter the "<from>"  and "<to>" field 

And users clicks on searchbutton

But user shloud move to another page

Then user need to close the app

Examples:
  | from|  to |
  | AUS | ECP |
  | DCA | BOS |
                |BOS|DCA|     
   
   

