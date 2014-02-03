import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;


public class CounterTest {

	@Test
	public void test() {
		
		Integer first, mockedFirst;
		
		Counter count = new Counter ();
		
		Counter mockedCounter = mock(Counter.class);
		when(mockedCounter.getValue()).thenReturn(1);
		
		first = count.getValue();
		mockedFirst = mockedCounter.getValue();
	assertEquals ("Wrong Answer !", first, mockedFirst);
	}

}
