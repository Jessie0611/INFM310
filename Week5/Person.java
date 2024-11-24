public class Person
{
    private String lastName;
    private String socialSecurity;

    // Constructor to initialize the Person object
    public Person()
    {
        this.lastName = "";
        this.socialSecurity = "";
    }

    //get method - lastName
    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //get method - social
    public String getSocialSecurity()
    {
        return socialSecurity;
    }

    public void setSocialSecurityNumber(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
}