import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
public class UnitTest {
    private LineCharCount counter;

    @Test
    public void testInitialCounts() {
        counter = new LineCharCount();

        assertEquals("Första raden bör räknas som 0", 0, counter.getLineCount());
        assertEquals("Första bokstaven bör räknas som 0", 0, counter.getCharCount());
    }

    @Test
    public void testUpdateLineCharCount() {
        counter = new LineCharCount();

        String testString = "test";
        counter.updateLineCharCount(testString);
        assertEquals("Antalet rader bör öka med 1 vid varje update", 1, counter.getLineCount());
        assertEquals("Antalet bokstäver bör matcha längden av strängen vid varje update", testString.length(), counter.getCharCount());
    }

    @Test
    public void testMultipleUpdates() {
        counter = new LineCharCount();

            String test1 ="test1";
            String test2 ="test2";
            String test3 ="test3";

            counter.updateLineCharCount(test1);
            counter.updateLineCharCount(test2);
            counter.updateLineCharCount(test3);

        String testStrings = test1+test2+test3;

        assertEquals("Antalet rader bör motsvara antalet uppdateringar", 3, counter.getLineCount());
        assertEquals(" Antalet bokstäver borde vara suman av test strängarnas längd", testStrings.length(), counter.getCharCount());
    }
}
