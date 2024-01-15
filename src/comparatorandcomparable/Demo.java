package comparatorandcomparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Collections.sort() does work with Student, provided you "implements" Comparable
class Student implements Comparable<Student> {
	
	int age;
	String name;
	
	public Student(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student that) {
		if (this.age > that.age)
			return 1;
		else
			return -1;
	}
}

public class Demo {

	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<>();
		studs.add(new Student(21, "Nabin"));
		studs.add(new Student(22, "Nika"));
		studs.add(new Student(33, "Dod"));
		studs.add(new Student(18, "Bob"));
		
		System.out.println(studs); // [Student [age=21, name=Nabin], Student [age=22, name=Nika], Student [age=33, name=Dod], Student [age=18, name=Bob]]
		
		for (Student s : studs) {
			System.out.println(s);
		}
//		Student [age=21, name=Nabin]
//		Student [age=22, name=Nika]
//		Student [age=33, name=Dod]
//		Student [age=18, name=Bob]

		Collections.sort(studs);
		
		System.out.println(studs); // [Student [age=21, name=Nabin], Student [age=22, name=Nika], Student [age=33, name=Dod], Student [age=18, name=Bob]]
		
		for (Student s : studs) {
			System.out.println(s);
		}
//		Student [age=18, name=Bob]
//		Student [age=21, name=Nabin]
//		Student [age=22, name=Nika]
//		Student [age=33, name=Dod]
		
						
		studs.add(new Student(88, "Nan"));
		studs.add(new Student(16, "Faf"));
		
		System.out.println(studs);

//		Comparator<Student> com1 = new Comparator<Student>() {
//			
//			public int compare(Student i, Student j) {
//				if (i.age > j.age)
//					return 1; // swap
//				else
//					return -1; // don't swap
//			}
//		};	
		//     /\ /\ /\
		//   This works, but let's try to simplify it:
		Comparator<Student> com1 = (i, j) -> i.age > j.age?1:-1;
		
		Collections.sort(studs, com1);
		
		System.out.println(studs);
		
		for (Student s : studs) {
			System.out.println(s);
		}
		
		
		////
		
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(3);
		nums.add(7);
		nums.add(9);
		nums.add(43);
		nums.add(31);
		nums.add(72);
		nums.add(29);
		
		Collections.sort(nums); // Sort the collection
		
		System.out.println(nums); // [3, 4, 7, 9, 29, 31, 43, 72]
		
		// But how to sort based on the last number, for example?
		// For that, we can use a comparator!
		
		Comparator<Integer> com = new Comparator<Integer>() {
			
			public int compare(Integer i, Integer j) {
				if (i%10 > j%10)
					return 1;
				else
					return -1;
							
//				return 1; // it will swap
//				return -1; // it will not swap
			}
		};
		
		Collections.sort(nums, com);
		
		System.out.println(nums); // [31, 72, 43, 3, 4, 7, 29, 9]

		
	}

}
