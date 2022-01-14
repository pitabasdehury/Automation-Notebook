package Java.Array;


public class demo {
    public static void main(String [] args)
    {
        String student[][] = {{"Jaga", "Pitabas", "27"}, {"Kalia", "Bibhuti", "26"}};

        for(int i=0; i<student.length; i++)
        {
            for(int j=0; j<student[i].length; j++)
            {
                System.out.print(student[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
