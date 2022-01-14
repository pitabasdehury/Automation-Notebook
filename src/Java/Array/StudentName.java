package Java.Array;

public class StudentName {
    public static void main(String [] args){
        String [][] student = new String[4][3];
        student[0][0] = "Pitabas";
        student[0][1] = "Nabin";
        student[0][2] = "Asanti";

        student[1][0] = "Bibhuti";
        student[1][1] = "Nabin";
        student[1][2] = "Umarani";

        student[2][0] = "Manoj";
        student[2][1] = "Bidyadhara";
        student[2][2] = "Dalimba";

        student[3][0] = "Ramu";
        student[3][1] = "Shyam";
        student[3][2] = "Malati";

        for (int i=0; i<student.length; i++){
            for (int j=0; j<student[i].length; j++){
                System.out.print(student[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
