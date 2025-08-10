import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    void testTwoSum_BasicCase() {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result, "Should return indices [0, 1] for nums=[2, 7, 11, 15] and target=9.");
    }

    @Test
    void testTwoSum_NoSolution() {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        int target = 10;
        int[] expected = {};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result, "Should return an empty array if no solution exists.");
    }

    @Test
    void testTwoSum_NegativeNumbers() {
        Solution solution = new Solution();
        int[] nums = {-3, 4, 3, 90};
        int target = 0;
        int[] expected = {0, 2};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result, "Should handle negative numbers correctly.");
    }

    @Test
    void testTwoSum_DuplicateNumbers() {
        Solution solution = new Solution();
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result, "Should handle duplicate numbers correctly.");
    }

    @Test
    void testTwoSum_SingleSolution() {
        Solution solution = new Solution();
        int[] nums = {1, 5, 5, 10};
        int target = 10;
        int[] expected = {1, 2};
        int[] result = solution.twoSum(nums, target);
        assertArrayEquals(expected, result, "Should find the correct pair even with identical values.");
    }
}