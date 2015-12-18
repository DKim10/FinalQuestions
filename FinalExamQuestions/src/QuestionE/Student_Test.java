package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("John", "Randall", "John", dBirthDate, "212 Labrador Lane", "302-893-6889", "gibbons@udel.edu","MIS");
		Student stu3 = new Student("Man", "Randall", "Randy", dBirthDate, "213 Labrador Lane", "302-893-6889", "ibbons@udel.edu","MIS");
		Student stu4 = new Student("Dude", "Randall", "Jacobs", dBirthDate, "224 Labrador Lane", "302-893-6889", "bons@udel.edu","MIS");
		Student stu5 = new Student("Carson", "Randall", "Selvester", dBirthDate, "514 Labrador Lane", "302-893-6889", "ons@udel.edu","MIS");

		HashMap<UUID,Student> hash = new HashMap<UUID,Student>();
		hash.put(stu1.getPersonID(), stu1);
		hash.put(stu2.getPersonID(), stu2);
		hash.put(stu3.getPersonID(), stu3);
		hash.put(stu4.getPersonID(), stu4);
		hash.put(stu5.getPersonID(), stu5);
		 //assertTrue ensuring the size of the HashMap = 5.
		assertTrue(hash.size()== 5);
	}

}
