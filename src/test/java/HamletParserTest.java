import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;



public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        String toEval = hamletParser.changeHamlet("Leon");

        Integer expected = 0;

        assertEquals(expected, hamletParser.findHamlet(hamletParser.changeHamlet("Leon")));

        assertTrue(toEval.contains("Leon"));

    }

    @Test
    public void testChangeHoratioToTariq() {
        Integer expected = 0;
        String toEval = hamletParser.changeHoratio("Tariq");
        assertEquals(expected, hamletParser.findHoratio(toEval));

        assertTrue(toEval.contains("Tariq"));

    }

    @Test
    public void testFindHoratio() {
        Integer expected = 158;



        assertEquals(expected, hamletParser.findHoratio(hamletText));


    }

    @Test
    public void testFindHamlet() {
        Integer expected = 472;


        assertEquals(expected, hamletParser.findHamlet(hamletText));

    }
}