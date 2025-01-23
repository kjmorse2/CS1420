//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class beatTheAI{
//    public static void main(String[] args) {
//        String fileName = "\\Users\\KJ\\source\\School\\CS1420\\Homework\\Assignment3\\grades";
//        String topStudent = "";
//        int highestGrade = Integer.MIN_VALUE;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] parts = line.split(" ");
//                String name = parts[0];
//                int grade = Integer.parseInt(parts[1]);
//
//                if (grade > highestGrade) {
//                    highestGrade = grade;
//                    topStudent = name;
//                }
//            }
//
//            if (!topStudent.isEmpty()) {
//                System.out.println("Top student: " + topStudent + " with grade: " + highestGrade);
//            } else {
//                System.out.println("No data found in the file.");
//            }
//
//        } catch (IOException e) {
//            System.out.println("Error reading the file: " + e.getMessage());
//        }
//    }
//}
