package ro.ase.csie.testing.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.testing.exceptions.WrongAgeException;
import ro.ase.csie.testing.exceptions.WrongGradeException;
import ro.ase.csie.testing.models.Student;

public class TestStudentNewTests {

	//TestFixture
	static Student student;
	static ArrayList<Integer> grades;
	static String initialName;
	static int initialAge;
	static int initialNoGrades;
	
	static ArrayList<Integer> performanceGrades;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		initialName = "John Doe";
		initialAge = Student.MIN_AGE + 1;
		initialNoGrades = 3;
		grades = new ArrayList<>();
		
		Random random = new Random();
		
		for (int i=0; i < initialNoGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE) + 1);
		}
		
		performanceGrades = new ArrayList<>();
		int noGrades = (int) 1e6;
		for (int i = 0; i < noGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE) + 1);
		}
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(initialName, initialAge, grades);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test(expected = WrongAgeException.class)
	public void testSetAgeRangeMaxValue() throws WrongAgeException {
		int newAge = Integer.MAX_VALUE;
		student.setAge(newAge);
	}
	
	@Test(expected = WrongAgeException.class)
	public void testSetAgeRangeBigValue() throws WrongAgeException {
		int newAge = 250;
		student.setAge(newAge);
	}
	
	@Test
	public void testSetAgeBoundaryLowLimit() throws WrongAgeException {
		int newAge = Student.MIN_AGE;
		student.setAge(newAge);
		assertEquals("Testing with lower limit age", newAge, student.getAge());
	}

	@Test
	public void testSetAgeBoundaryUpperLimit() throws WrongAgeException {
		int newAge = Student.MAX_AGE;
		student.setAge(newAge);
		assertEquals("Testing with upper limit age", newAge, student.getAge());
	}
	
	@Test
	public void testSetGradesReferenceDeepCopy() throws WrongGradeException {
		int[] grades = new int[] {9,9,10};
		ArrayList<Integer> refGrades = new ArrayList<>();
		
		for(int grade: grades) {
			refGrades.add(grade);
		}
		
		student.setGrades(refGrades);
		refGrades.set(0, 5);
		
		int[] studentGrades = new int[student.getNoGrades()];
		for(int i=0; i< student.getNoGrades(); i++) {
			studentGrades[i] = student.getGrade(i);
		}
		
		assertArrayEquals("We do a shallow copy", grades, studentGrades);
	}
	
	@Test
	public void testGetGradesAveragePerformance() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		int noGrades = (int)1e6;
		Random random = new Random();
		for (int i = 0; i < noGrades; i++) {
			grades.add(random.nextInt(Student.MAX_GRADE) + 1);
		}
		
		student.setGrades(grades);
		
		long tStart = System.currentTimeMillis();
		student.getGradesAverage();
		long tFinal = System.currentTimeMillis();
		
		long delta = tFinal - tStart;
		long performanceLimit = 10;
		if (delta <= performanceLimit) {
			assertTrue(true);
		}
		else {
			fail("Takes too much time: " + delta);
		}
	}
	
	@Test(timeout = 10) 
	public void testGetGradesAveragePerformanceJUnit4() throws WrongGradeException {
		student.setGrades(performanceGrades);
		student.getGradesAverage();
	}
	
	@Test
	public void testSetAgeInverse() throws WrongAgeException {
		int newAge = initialAge + 1;
		student.setAge(newAge);
		assertNotEquals("setAge is not changing the age value", initialAge, student.getAge());
	}
	
	@Test
	public void testGetMinGradeInverse() throws WrongGradeException {
		ArrayList<Integer> grades = new ArrayList<>();
		student.setGrades(performanceGrades);
		
		int minGrade = student.getMinGrade();
		for (int grade : grades) {
			if (minGrade > grade) {
				fail("The value is not minimum");
			}
		}
		
		assertTrue(true);
	}
	
	@Test
	public void testGetMinCrossCheck() throws WrongGradeException {
		student.setGrades(performanceGrades);
		int expectedMin = Collections.min(performanceGrades);
		int computedMin = student.getMinGrade();
		
		assertEquals("Min is not correct", expectedMin, computedMin);		
	}
	
}
