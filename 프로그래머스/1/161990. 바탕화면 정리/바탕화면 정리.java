class Solution {
    public int[] solution(String[] wallpaper) {
        int keyMin = Integer.MAX_VALUE;
        int keyMax = -1;
        int valueMin = Integer.MAX_VALUE;
        int valueMax = -1;

        for (int i = 0; i < wallpaper.length; i++) {

            String[] arr = wallpaper[i].split("");

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("#")) {
                    keyMin = Math.min(keyMin, i);
                    valueMin = Math.min(valueMin, j);
                    keyMax = Math.max(keyMax, i);
                    valueMax = Math.max(valueMax, j);
                }
            }
        }

        return new int[] {keyMin, valueMin, keyMax + 1, valueMax + 1};
    }
}