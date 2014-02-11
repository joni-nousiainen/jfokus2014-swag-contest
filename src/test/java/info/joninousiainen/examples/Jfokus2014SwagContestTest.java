package info.joninousiainen.examples;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Jfokus2014SwagContestTest {
    Jfokus2014SwagContest contest = new Jfokus2014SwagContest();

    @Test
    public void testRemoveOddNumbersAndNumberEight() {
        List<Integer> result = contest.removeOddNumbersAndNumberEight(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        assertEquals("Wrong total amount of numbers", 3, result.size());
        assertEquals(Integer.valueOf(2), result.get(0));
        assertEquals(Integer.valueOf(4), result.get(1));
        assertEquals(Integer.valueOf(6), result.get(2));
    }

    @Test
    public void testGetReverseEncryption() {
        String result = contest.getReverseEncryption().applyEncryptionTo("Learning Java 8 is fun!");

        assertEquals("!nuf si 8 avaJ gninraeL", result);
    }
}
