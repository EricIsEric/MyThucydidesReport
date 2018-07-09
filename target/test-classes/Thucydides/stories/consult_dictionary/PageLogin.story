Meta:
@feature DownloadCSVfile
Scenario: Start to loin the Openl10n site
Given Delete all cookies before start testing
When the user has opened the Openl10n webpage
Then the user enters username 15202184317@qq.com and password 123qwe!@#QWE to Openl10n login page
Then click the Login submit button of Openl10n Page
Then the Openl10n main page should be displayed
