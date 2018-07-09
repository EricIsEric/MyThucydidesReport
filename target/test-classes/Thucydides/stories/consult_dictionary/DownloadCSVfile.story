Meta:
@feature DownloadCSVfile
Scenario: Download the CSV file for one specific product
Given Delete all cookies before start testing
When the user has opened the Openl10n webpage
Then the user enters username 15202184317@qq.com and password 123qwe!@#QWE to Openl10n login page
Then click the Login submit button of Openl10n Page
Then the Openl10n main page should be displayed
Then select product as 'PPM'
Then select version as '9.50'
Then select language as 'Finnish'
Then click 'Download' button