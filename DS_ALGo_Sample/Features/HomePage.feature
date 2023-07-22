  Scenario: DS ALGo_Sample
  
    Given launch Chrome Browser
    And The user opens DS Algo portal link "https://dsportalapp.herokuapp.com"
    When The user clicks the "Get Started" button
    

	Scenario: User launches the homepage
    Given the user is on the homepage
    When the user clicks on the "Get Started" link
    Then the user should be redirected to the homepage
    
    
 	Scenario: User is on Home page and click getstarted link on  home page without sign in
			When The user clicks on Get Started link on homepage "<option>" without login
			Then The user get warning message "You are not logged in"
			
			
		 	Scenario: User is on Home page and click on dropdown without sign in
			Given The user is on Home pageC:\Users\mitul\eclipse-workspace\DS_ALGo_Sample\DriverC:\Users\mitul\eclipse-workspace\DS_ALGo_Sample\Driver
			When The user clicks on Get Started link on homepage "<option>" without login
			Then The user get warning message "You are not logged in"
			
			
			 	Scenario: User is on Home page and click on sign in
			Given The user opens Home Page
			When The user clicks "Sign in"
			Then The user should be redirected to Sign in page
			
				Scenario:  User is on Home page and click on Register
			Given The user opens Home Page
			When The user clicks "Register"
			Then The user should be redirected to Register form