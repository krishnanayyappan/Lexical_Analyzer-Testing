import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameter;
//import org.junit.runners.Parameterized.Parameters;
import org.junit.jupiter.api.BeforeAll;
//import java.util.Arrays;
//import java.util.Collection;

public class corrected_printtokensTest {
	 
    private char symbol;
    private String symbol_val;
    
    @BeforeAll
	public static void setUpBeforeClass() throws Exception {
//	System.out.println("Hi All,The test begins now..!!");
	}
	
 	@AfterAll
	public static void tearDownAfterClass() throws Exception {
//		System.out.println("Hi All,The test ends successfully..!!");
		}

	@Test
    public void check_symbol_lparan(){
		symbol = '(';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_rparan(){
		symbol = ')';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_lsquare(){
		symbol = '[';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_rsquare(){
		symbol = ']';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_quote(){
		symbol = '\'';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_bquote(){
		symbol = '`';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_comma(){
		symbol = ',';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertTrue(is_Symbol);
    }
	
	@Test
    public void check_symbol_invalid(){
		symbol = '+';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertFalse(is_Symbol);
    }
	
	@Test
    public void check_symbol_null_input(){
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertFalse(is_Symbol);
    }
	
	@Test
    public void check_symbol_space(){
		symbol = ' ';
        boolean is_Symbol = corrected_printtokens.is_spec_symbol(symbol);
        assertFalse(is_Symbol);
    }
	
	@Test
    public void printtest_symbol_lparan(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "(";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("lparen.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_rparan(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = ")";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("rparen.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_lsquare(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "[";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("lsquare.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_rsquare(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "]";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("rsquare.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_quote(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "\'";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("quote.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_bquote(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "`";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("bquote.\n",outContent.toString());
    }

	@Test
    public void printtest_symbol_comma(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = ",";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("comma.\n",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_others(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "+";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_null_input(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = "";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("",outContent.toString());
    }
	
	@Test
    public void printtest_symbol_space(){
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();		 
        System.setOut(new PrintStream(outContent));
        symbol_val = " ";
        corrected_printtokens.print_spec_symbol(symbol_val);
        assertEquals("",outContent.toString());
    }
	
	
	/*@Test
	public void testTokenStream() {
		corrected_printtokens cp = new corrected_printtokens(); 
		assertEquals(null,cp.open_token_stream(""));
	}*/
	
}
