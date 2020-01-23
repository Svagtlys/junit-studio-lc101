package test;

import org.junit.Test;

import static main.BalancedBrackets.hasBalancedBrackets;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //Test if balanced no extraneous
    @Test
    public void testBalancedBasic(){
        assertEquals(true, hasBalancedBrackets("[]"));
    }

    //Test unbalanced no extraneous
    @Test
    public void testUnbalancedBasic(){
        assertEquals(false, hasBalancedBrackets("]"));
    }

    @Test
    public void testSwitchedBracketsBasic(){
        assertEquals(false, hasBalancedBrackets("]["));
    }

    @Test
    public void testBalancedExtra(){
        assertEquals(true, hasBalancedBrackets("[Fancy]Stuff"));
    }

    @Test
    public void testUnbalancedExtra(){
        assertEquals(false, hasBalancedBrackets("[Nomore] fanciness]"));
    }

    @Test
    public void testSwitchedBracketsExtra(){
        assertEquals(false, hasBalancedBrackets("Fun]andGame["));
    }

    @Test
    public void testLotsOfBalancedBrackets(){
        assertEquals(true, hasBalancedBrackets("[]What?[][No!]"));
    }

    @Test
    public void testLotsOfUnbalancedBrackets(){
        assertEquals(false, hasBalancedBrackets("[[]What?[][No!]"));
    }

    @Test
    public void testLotsOfBalancedBracketsBasic(){
        assertEquals(true, hasBalancedBrackets("[][][]"));
    }

    @Test
    public void testLotsOfUnbalancedBracketsBasic(){
        assertEquals(false, hasBalancedBrackets("[[][][]"));
    }

    @Test
    public void testBalancedInnerBrackets(){
        assertEquals(true, hasBalancedBrackets("[[]]"));
    }

    @Test
    public void testUnbalancedInnerBrackets(){
        assertEquals(false, hasBalancedBrackets("[[]"));
    }

}
