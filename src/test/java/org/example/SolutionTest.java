package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void canJumpTest() {
        Solution solution = new Solution();
        assertTrue(solution.canJump(new int[]{2, 3, 1,1, 4}));
        assertFalse(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

}