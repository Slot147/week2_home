package week2_2;

/**
 * Created by Dina on 29.01.2016.
 */
public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student("Petya", new Address("UK", "Kiev", "Gogolya", 5));

        Subject s1subject1 = student.addSubject("Mathematics", 68);
        Subject s1subject2 = student.addSubject("Physics", 58);

        System.out.println((student.subjectCount() == 2) + " addSubject student");

        System.out.println((student.study(s1subject1, 43) == 43) + " s1subject1.study");

        System.out.println((student.study(s1subject2, 25) == 25) + " s1subject2.study");
        System.out.println((student.study(s1subject2, 29) == 54) + " s1subject2.study");

        System.out.println((s1subject1.passExam()== 4) + " s1subject1.passExam");
        System.out.println((s1subject2.passExam() == 5)+ " s1subject2.passExam");

        System.out.println((student.averageGradeAllSubjects() == 4) + " student.averageGradeAllSubjects");

        System.out.println("\n student.subjectsInformation: ");
        student.subjectsInformation();

    }

}
