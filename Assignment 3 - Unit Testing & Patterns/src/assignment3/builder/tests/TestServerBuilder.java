package assignment3.builder.tests;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import assignment3.builder.models.Server;
import assignment3.builder.models.ServerInterface;

public class TestServerBuilder {

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
	public void testBuilderPattern() {
		Server server = Server.ServerBuilder("Europa", "10.52.100.154").isFiveG().build();
		assertEquals(server.getPort(), 8080);
	}
}
