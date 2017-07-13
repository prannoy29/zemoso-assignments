

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zemoso on 13/7/17.
 */
public class inputCheckTest {
    inputCheck in = new inputCheck();
@Test
    public void checkLetterAll() throws Exception{
    assertTrue(in.checkLetterAll("AZQxswcdeVFRbgtnhyMJU,,ki.lo/;p"));
    assertFalse(in.checkLetterAll("qwertyuiolkjnbvcdre4345678i)"));
}
}