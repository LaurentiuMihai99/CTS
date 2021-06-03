package assignment3.singleton.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import assignment3.singleton.models.Server;

public class TestServerSingleton {

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

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testSingletonImplementation() {
		Server s1 = Server.getServer();
		s1.connect();
		Server s2 = Server.getServer();
		if (!s2.isConnected() || !(s1==s2)) {
			fail("S2 is not connected");
		}
		s2.disconnect();
		assertSame(s1, s2);
	}

}
