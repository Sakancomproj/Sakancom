Feature: item

@testcreate
Scenario: Create_item successfully
Given  that the user with email "ahmad@gmail.com" is log in 
And there is an item  with Category "Furniture" ,name "Sofa",picture "pic1.jpg", description "grey sofa" 
Then the  item  with Category "Furniture" ,name "Sofa",picture "pic1.jpg", description "grey sofa" is created successfully 


@testdelete
Scenario: delete item by Serial Number 
Given that the user with email "ahmad@gmail.com" wants to delete item 
And the item with SN "1"
Then the item with SN "1" is actually deleted


@testupdate 

Scenario: update item successfully 
Given that the user is created item with SN "2" successfully 
And  the item with SN "2" , Category "Furniture" ,name "Sofa",picture "pic2.jpg", description "black"
Then the item with SN "2" is update 

@testsearch
Scenario: search item by Serial Number 
Given that the user with email "ahmad@gmail.com" wants to search item 
And the item with SN "2"
Then the item with SN "2" is searched