package GoldmanSachs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
	int StudentId;
	List<Integer> studentPreferences = new ArrayList<>();
	int studentScore;
}

class SortByStudentScore implements Comparator<Student> {
	public int compare(Student p1, Student p2) {
		Integer p1ID = p1.studentScore;
		Integer p2ID = p2.studentScore;		
		return p2ID.compareTo(p1ID);	
	}	
}


public class AdmissionsChallenge {



	public static void main(String[] args) {

		Map<Integer,Integer> schoolDetails = new HashMap<>();
		schoolDetails.put(0, 1);
		schoolDetails.put(1, 3);
		schoolDetails.put(2, 1);
		schoolDetails.put(3, 2);

		Student student0 = new Student();
		student0.StudentId = 0;
		student0.studentScore = 990;
		student0.studentPreferences = new ArrayList<>(Arrays.asList(3,2,1));

		Student student1 = new Student();
		student1.StudentId = 1;
		student1.studentScore = 780;
		student1.studentPreferences = new ArrayList<>(Arrays.asList(3,0,0));

		Student student2 = new Student();
		student2.StudentId = 2;
		student2.studentScore = 830;
		student2.studentPreferences = new ArrayList<>(Arrays.asList(2,0,1));

		Student student3 = new Student();
		student3.StudentId = 3;
		student3.studentScore = 860;
		student3.studentPreferences = new ArrayList<>(Arrays.asList(0,1,3));

		Student student4 = new Student();
		student4.StudentId = 4;
		student4.studentScore = 920;
		student4.studentPreferences = new ArrayList<>(Arrays.asList(0,2,3));

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student0);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);

		Collections.sort(studentList, new SortByStudentScore());

		int studentWithoutAdmission = 0;
		for(Student student: studentList) {
			if(schoolDetails.get(student.studentPreferences.get(0))!=0) {
				schoolDetails.put(student.studentPreferences.get(0), schoolDetails.get(student.studentPreferences.get(0)) - 1);
			} else if(schoolDetails.get(student.studentPreferences.get(1))!=0) {
				schoolDetails.put(student.studentPreferences.get(1), schoolDetails.get(student.studentPreferences.get(1)) - 1);
			} else if(schoolDetails.get(student.studentPreferences.get(2))!=0) {
				schoolDetails.put(student.studentPreferences.get(2), schoolDetails.get(student.studentPreferences.get(2)) - 1);
			} else {
				studentWithoutAdmission += 1;
			}
		}

		int sum = 0;
		for(int value : schoolDetails.values()) {
			sum += value;
		}

		System.out.println("Seats not filled: " + sum);
		System.out.println("No Admission: " + studentWithoutAdmission);

	}
}
