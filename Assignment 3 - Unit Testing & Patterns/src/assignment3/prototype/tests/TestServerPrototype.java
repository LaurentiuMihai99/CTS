package assignment3.prototype.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import assignment3.prototype.models.Server;

public class TestServerPrototype {

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
	public void testPrototypeClone() throws InterruptedException, CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Server server = new Server("192.168.0.1", 8080, 10);
		long finish = System.currentTimeMillis();
		long serverCreateTime = finish - start;
		
		start = System.currentTimeMillis();
		Server copy = (Server) server.clone();
		finish = System.currentTimeMillis();
		long serverCloneTime = finish - start;
		
		if (serverCloneTime >= serverCreateTime) {
			fail("Cloning takes longer than creation");
		}
		
		if (server == copy) {
			fail("Server and copy are the same object");
		}
		if ( (server.getIpAddress() != copy.getIpAddress()) ||
				server.getPort() != copy.getPort() ||
				server.getMaxConnections() != copy.getMaxConnections()) {
			fail("Cloning done unproperly");
		}
		
		
	}

}
