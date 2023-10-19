
public class TestSort {

    /**
     * testing the Sort.sort method to see if it sorts alphabetically
     */
    public static void testSort() {
        String[] input = {"I", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};

        Sort.sort(input);

        for (int i=0; i < input.length; i++) {
            if (input[i] != expected[i]) {
                System.out.println("Mismatch in position " + i + ", expected: " + expected[i] + ", but got: " + input[i]);
                return;
            }
        }
    }

    public static void main(String[] args) {
        testSort();
    }



}