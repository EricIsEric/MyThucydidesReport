Meta:
@feature All the testing factors of openl10n site
Scenario: (1) Start to login the Openl10n site
Given Delete all cookies before start testing
When the user has opened the Openl10n webpage
Then the user enters username 15202184317@qq.com and password 123qwe!@#QWE to Openl10n login page
Then click the Login submit button of Openl10n Page
Then the Openl10n main page should be displayed

Scenario: (2) Download the CSV file for one specific product
!--Then Get values from the parameters
!--Then click 'Download' button

Scenario: (3) Risk_01--Zero byte Zip file
!--Then click Logout button
!--Then click login button on the logout first page
!--Then Re-Enter the username and password
!--Then click the Login submit button of Openl10n Page
Then select product/version/language as PPM/9.50/Finnish
Then click upload button
Then Run AutoIt script to upload file for Risk01
Then check correct message displayed for Risk01

Scenario: (4) Risk_02--Disallowed uploaded file type (".jpg")
Then click Logout button
Then click login button on the logout first page
Then Re-Enter the username and password
Then click the Login submit button of Openl10n Page
Then select product/version/language as PPM/9.50/Finnish
Then click upload button
Then Run AutoIt script to upload file for Risk02 (Upload ".jpg" file)
Then Take screenshot of the Alert window Using Robot
Then check correct message displayed for Risk02 (Check result of ".jpg" file)