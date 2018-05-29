Feature: TEST FREE CRM APLLICTION

Scenario: ADDING THE NEW CONTACTS TO THE CONTACTS PAGE

##### >>>>>>---->Add Contacts Steps with (List<List<String>> values=data.raw()) limited values 
#When the user opens the browser and enter url

#Then the user should be on homepage

#And the user enters username and password
#| karcrm | crm@425 |

#Then user clicks on loginbutton

#And user clicks on addcontacts button

#Then user enters all required info 
 # | Name | surname | department |
 #| ashok | P | mech |
 #| ashok.p | Puppala | Mtech | 
  #| Srikanth | Modi | OU |

#And user closes the browser




When the user opens the browser and enter url

Then the user should be on homepage

And the user enters username and password
|username | password |
| karcrm | crm@425 |

Then user clicks on loginbutton

And user clicks on addcontacts button

Then user enters all required info 
  | Title | Name | surname | department |
  | Mr.   | rakesh | G | CSE |
  | Mr.   | SAI | GANAPA | Mining | 
  | Mr.    | SUDHA | G | ECE |

And user closes the browser






