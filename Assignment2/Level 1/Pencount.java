public class Pencount {
   public static void main(String[] args) {

       int totalPen = 14;
       int totalStudents = 3;
       int pensPerStudent = totalPen / totalStudents;
       int leftPens = totalPen % totalStudents;
       System.out.println("The Pen Per Student is " + pensPerStudent +
               " and the remaining pen not distributed is " + leftPens);
   }
}
