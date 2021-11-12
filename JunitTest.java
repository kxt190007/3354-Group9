package JunitTester;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JunitTest {
    
   @Test
   
   public void testNotation() {      
	   String notate = "This is page 13";
	   assertEquals(notate, Notations.notate(notate));
   }
}	