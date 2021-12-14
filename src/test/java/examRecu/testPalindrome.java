package examRecu;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.*;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class testPalindrome {
	
    @Parameters
    public static Collection<Object[]> numbers() {
        return Arrays.asList(new Object[][]{
                        {20,false},
                        {9,true},
                        {13,false},
                        {15,false},
                        {33,true},
                        {44,true}
                }
        );
    }
    
    int input;
    boolean expected;
    palindrome palindromo;
    public testPalindrome(int input, boolean expected) {
    	this.input=input;
    	this.expected=expected;
    }
    
    @Before
    public void inicilizar() {
    	palindromo = new palindrome();
    }
    
    @Test
    public void testearPalindromo() {
    	boolean palindromoaDa = palindromo.palindromeFunc(this.input);
    	assertEquals(this.expected,palindromoaDa);
    }


}
