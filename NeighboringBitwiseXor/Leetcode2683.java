import java.util.Arrays;

public class Leetcode2683 {
    public boolean doesValidArrayExist(int[] derived) {
        return Arrays.stream(derived).reduce(0, (a, b) -> a ^ b) == 0;
    }
}