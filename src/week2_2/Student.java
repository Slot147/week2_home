package week2_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dina on 29.01.2016.
 */
public class Student {

    private String nameStudent;
    private List<Subject> subjects = new ArrayList<>();
    private Address address;

    public Student(String nameStudent, Address address) {
        this.nameStudent = nameStudent;
        this.address = address;
    }

    public int study (Subject subject, int studentWorkedHours){

        int result = subject.getStudentWorkedHours() + studentWorkedHours;
        subject.setStudentWorkedHours(result);

        return result;
    }

    public Subject addSubject(String nameSubject, int semestrHour){

        Subject subject = new Subject(nameSubject, semestrHour);
        subjects.add(subject);

        return subject;
    }

    public void removeSubject(Subject subject){

        subjects.remove(subject);
    }

    public void subjectsInformation (){

        for (int i = 0; i < subjects.size(); i++) {
            subjects.get(i).subjectInfo();
        }
    }

    public int averageGradeAllSubjects (){

        int sumAllGrade = 0;


        for (int i = 0; i < subjects.size(); i++) {
            sumAllGrade += subjects.get(i).getStudentGrade();
        }

        return sumAllGrade / subjects.size();
    }

    public int subjectCount (){
        return subjects.size();
    }


}
