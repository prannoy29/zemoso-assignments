import static org.junit.Assert.*;

/**
 * @author Prannoy Sarkar
 */
public class RegexTest {
    Regex testrt = new Regex();
    @org.junit.Test
    public void checkpattern() throws Exception {
        assertEquals("Yes, it matches",testrt.checkpattern("My Name is Pr(ANNOY)."));
        assertEquals("Yes, it matches",testrt.checkpattern("T!@#$%^&*()(*&YGBNJUYTRDSDfghjuytfdcv."));
        assertEquals("No, it doesn't match",testrt.checkpattern("hello ...there."));
        assertEquals("No, it doesn't match",testrt.checkpattern("Hello ...there"));

    }

}