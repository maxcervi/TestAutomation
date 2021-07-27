package calendario;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalendarTest2 {
	
	private static Calendario cal;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		cal = new Calendario();
		assertNotNull(cal);
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
	public void test() {
		String result = cal.calend(2, 7, 2021);
		assertEquals("Sabato",result);
		
	}

}
