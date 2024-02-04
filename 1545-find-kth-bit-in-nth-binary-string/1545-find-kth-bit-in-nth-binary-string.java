public class Solution {

    public char findKthBit(int n, int k) {
        List<String> arr = new ArrayList<>();
        arr.add("0");

        for (int i = 1; i <= n; i++) {
            String temp = arr.get(arr.size() - 1);
            StringBuilder str = new StringBuilder();
            str.append(temp).append("1").append(invertAndReverse(temp));
            arr.add(str.toString());
        }

        String result = arr.get(n - 1);
        return result.charAt(k - 1);
    }

    private String invertAndReverse(String str) {
        StringBuilder result = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '0') {
                result.append('1');
            } else if (currentChar == '1') {
                result.append('0');
            }
        }

        return result.reverse().toString();
    }

}