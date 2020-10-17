import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem2Test {
    @Test
    public void testRemoveDuplicates() {
        int[][] inputs = {
                // DO NOT REMOVE OR CHANGE THE GIVEN TEST CASES!
                {0, 0, 1, 1, 1, 2, 2, 4, 4, 6},
                // add more test cases
                {},
                {100},
                {1,1,1,1},
                {5,5,6,7,9,9,9,10,10,11},
                {12,12,14,14,14,14,15,15,17},
                {-5,-5,-4,-4,-4,-2,-1},
                {-5,-5,0,0,0,2,3,3,4,5,5,6},
                {2,2,3,4,4,4,5,9,9,20,24}

        };

        int[][] expects = {
                {0, 1, 2, 4, 6},
                // add more test cases
                {},
                {100},
                {1},
                {5,6,7,9,10,11},
                {12,14,15,17},
                {-5,-4,-2,-1},
                {-5,0,2,3,4,5,6},
                {2,3,4,5,9,20,24}
        };

        assertEquals(expects.length, inputs.length);

        for (int i = 0; i < inputs.length; i++) {
            int actualLength = Problem2.remove(inputs[i]);
            String caseId = "case " + i;
            assertEquals(caseId + " output length FAILED", expects[i].length, actualLength);
            for (int j = 0; j < actualLength; j++) {
                assertEquals(caseId + " element comparison FAILED", expects[i][j], inputs[i][j]);
            }
        }
    }
}
