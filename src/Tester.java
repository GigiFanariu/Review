public class Tester {
    public static void main(String[] args) {
        Student student1 = new Student("S001", "Luca", "Rossi", "1995-05-15");
        Student student2 = new Student("S002", "Mario", "Vecchio", "1998-08-20");
        Student student3 = new Student("S003", "Anna", "Verdi", "1997-02-10");
        Student student4 = new Student("S004", "Nino", "Bruni", "1999-11-30");

        Professor professor1 = new Professor("P001", "Matteo", "Reyes", "Mathematics");
        Professor professor2 = new Professor("P002", "Georgia", "Furnari", "Physics");

        professor1.assignGrade(student1, 90);
        professor1.assignGrade(student2, 75);
        professor1.assignGrade(student3, 85);
        professor2.assignGrade(student2, 60);
        professor2.assignGrade(student3, 95);
        professor2.assignGrade(student4, 70);

        Student[] students = {student1, student2, student3, student4};

        Professor[] professors = {professor1, professor2};

        System.out.println("Excellent students:");
        for (Student student : students) {
            if (student.isExcellent()) {
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }

        Student highestAverageStudent = null;
        double highestAverage = 0.0;
        for (Student student : students) {
            double average = student.calculateGradeAverage();
            if (average > highestAverage) {
                highestAverage = average;
                highestAverageStudent = student;
            }
        }
        if (highestAverageStudent != null) {
            System.out.println("Student with the highest grade average: "
                    + highestAverageStudent.getFirstName() + " " + highestAverageStudent.getLastName());
        }
    }
    }

