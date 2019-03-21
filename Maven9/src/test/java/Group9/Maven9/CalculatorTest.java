package Group9.Maven9;

import static org.hamcrest.CoreMatchers.is;


import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void add() throws Exception {
		final int result = new Calculator().add(3, 3);
        assertThat(result, is(6));
	}
	@Test
	public void add1() throws Exception {
		final int result = new Calculator().add(3, 3);
        assertThat(result, is(6));
	}
	@Test
	public void add2() throws Exception {
		final int result = new Calculator().add(3, 3);
        assertThat(result, is(6));
	}
	
	@Test
    public void addTwoThree() throws Exception {
        final int result = new Calculator().add(2, 3);
        assertThat(result, is(5));
    }
    
    @Test
    public void subThreeThree() throws Exception {
        final int result = new Calculator().subtract(3, 3);
        assertThat(result, is(0));
    }
    
    @Test
    public void mulThreeThree() throws Exception {
        final int result = new Calculator().multiply(3, 3);
        assertThat(result, is(9));
    }
    
    @Test
    public void divThreeMinusThree() throws Exception {
        final Long result = (long) new Calculator().divide(3, -3);
        assertThat(result, is(-1L));
    }
    @Test
    public void mulThreeFour() throws Exception {
        final int result = new Calculator().multiply(4, 3);
        assertThat(result, is(12));
    }
    @Test
    public void subThreeTwo() throws Exception {
        final int result = new Calculator().subtract(3, 2);
        assertThat(result, is(1));
    }
    @Test
    public void divThreeMinusThree() throws Exception {
        final Long result = (long) new Calculator().divide(3, -3);
        assertThat(result, is(-1L));
    }
        
    
	
}
