import java.io.*;
public class employeesMerged{
    public static void main(String[] args) throws Exception
    {
        String firstName, lastName, salaryString;
        double salary;

        FileReader fr = new FileReader("employeesAtlanta.txt");
        BufferedReader br = new BufferedReader(fr);


        FileReader fr = new FileReader("employeesMacon.txt");
        
        
        FileWriter fw = new FileWriter("employeesMerged.txt");
        while (lastName = br.readLine() != null)
        {
            firstName = br.readLine();
            salaryString = br.readLine();
            salary = Double.parseDouble(salaryString);
            System.out.println(lastName + " " + firstName + " " + salary);
            
        }



    }
}

/*Sta
 * 
 * 
 */