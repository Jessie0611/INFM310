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

    //get lastName
    public String getLastName()
    {
        return lastName;
    }

    //set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //get Social
    public String getSocialSecurity()
    {
        return socialSecurity;
    }

    //set Socail
    public void setSocialSecurityNumber(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }
}