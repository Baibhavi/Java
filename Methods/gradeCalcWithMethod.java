public class gradeCalcWithMethod {
    public static void main(String[] args)
    {
        String studentName = "Aman";
        int student_marks = 93;
        char gradePoint=GradeCalc(student_marks);
        studentResult(studentName, gradePoint);
    }
    public static char GradeCalc(int marks)
    {   char grade;
        if (90<marks&&marks<=100){
            grade = 'A';}
        else if (80<marks&&marks<=90){
            grade = 'B';
        }
        else if (70<marks&&marks<=80){
            grade = 'C';
        }
        else if (60<marks&&marks<=70){
            grade = 'D' ;       }
        else if (50<marks&&marks<=60)
           grade = 'E';
        else {
            grade ='F';
        }   
        return grade;
    }
    public static void studentResult (String name,char gradePoint){
        System.out.println("The grade of "+name+" is "+gradePoint);
    }
}
