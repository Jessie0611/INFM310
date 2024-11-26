public class Person {
    private String lastName;
    private String socialSecurity;

    // Method to set the last name
    public void setLastName(String name)
    {
        lastName = name; // Set lastName to the new value
    }
    // Method to set the social security number
    public void setSocialSecurityNumber(String newSocialSecurity)
    {
        socialSecurity = newSocialSecurity; // Set socialSecurity to the new value
    }
    // Method to get the last name
    public String getLastName() {
        return lastName; // Return the value of lastName
    }
    // Method to get the social security number
    public String getSocialSecurity() {
        return socialSecurity; // Return the value of socialSecurity
    }

}