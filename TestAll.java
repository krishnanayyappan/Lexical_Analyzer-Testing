import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestAll {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		BufferedReader br = null;
	    Reader input = null;
		corrected_printtokens t = new corrected_printtokens();

		input = new StringReader("Hello\"");
		br = new BufferedReader(input);
		assertEquals(null, t.get_token(br));
	}

}
