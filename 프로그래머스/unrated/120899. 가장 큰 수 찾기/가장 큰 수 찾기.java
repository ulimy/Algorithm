class Solution {
    public int[] solution(int[] array) {
        int index = 0;
        int num = array[0];

        for (int i = 1; i < array.length; i++) {
            if (num < array[i]) {
                index = i;
                num = array[i];
            }
        }

        return new int[] {num, index};
    }
}