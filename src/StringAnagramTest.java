import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by ARPITHA RAO on 26-02-2016.
 */

public class StringAnagramTest {

    @Test
    public void testIsAnagram() {
        assertTrue(AnagramCheck.isAnagram("word", "wrdo"));
        assertTrue(AnagramCheck.isAnagram("mary", "army"));
        assertTrue(AnagramCheck.isAnagram("stop", "tops"));
        assertTrue(AnagramCheck.isAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.isAnagram("pure", "in"));
        assertFalse(AnagramCheck.isAnagram("fill", "fil"));
        assertFalse(AnagramCheck.isAnagram("b", "bbb"));
        assertFalse(AnagramCheck.isAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.isAnagram("a", "a"));
        assertFalse(AnagramCheck.isAnagram("sleep", "slep"));
    }
}

