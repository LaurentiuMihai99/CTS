package ro.ase.csie.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.testing.exceptions.WrongAgeException;
import ro.ase.csie.testing.exceptions.WrongGradeException;
import ro.ase.csie.testing.exceptions.WrongNameException;
import ro.ase.csie.testing.models.Student;

public class TestStudent {

	static Student student;
	static ArrayList<Integer> grades;
	static int initialAge;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		grades =  new ArrayList<>();
		grades.add(9);
		grades.add(10);
		grades.add(8);
		student = new Student("John", 21, grades);
		initialAge = student.getAge();
	}

	@After
	public void tearDown() throws Exception {
		grades.clear();
		grades = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSetNameConformanceForRightInput() throws WrongNameException {
		String newName = "John Doe";
		student.setName(newName);
		assertEquals("Testing with right name", newName, student.getName());
	}
	
	@Test
	public void testSetAgeConformanceForRightInput() throws WrongAgeException {
		int newAge = 31;
		student.setAge(newAge);
		assertEquals("Testing with right age", newAge, student.getAge());
	}
	
	@Test
	public void testSetAgeErrorConditionNegativeValue() {
		int newAge = initialAge * -1;
		try {
			student.setAge(newAge);
			fail("We didn't get the exception");
		} catch (WrongAgeException e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = WrongNameException.class)
	public void testSetNameErrorConditionSmallName() throws WrongNameException {
		String newName = "io";
		student.setName(newName);
	}

	@Test
	public void testGetGradesAverage() throws WrongGradeException {
		ArrayList<Integer> gradesSorted = new ArrayList<>();
		for (int i = 6; i<10; i++) {
			gradesSorted.add(i);
		}
		student.setGrades(gradesSorted);
		
		float expectedAverage = 7.5f;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with sorted grades array", expectedAverage, computedAverage, 0);
	}
	
	@Test
	public void testGetGradesCardinalityZero() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(grades);
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with sorted empty array", expectedAverage, computedAverage, 0);
	}
	
	@Test
	public void testGetGradesCardinalityOne() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		grades.add(Student.MAX_GRADE);
		student.setGrades(grades);
		float expectedAverage = Student.MAX_GRADE;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with sorted empty array", expectedAverage, computedAverage, 0);
	}
	
	@Test
	public void testGetGradesAverageExistenceNullReferenceForGrades() throws WrongGradeException {
		student.setGrades(null);
		
		float expectedAverage = 0;
		float computedAverage = student.getGradesAverage();
		
		assertEquals("Testing with null for grades", expectedAverage, computedAverage, 0);
	}
}
