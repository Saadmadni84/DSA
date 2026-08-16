class Solution {
    public List<String> stringMatching(String[] words) {
        // Sort array by word length ascending
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        List<String> result = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            // Only check against words longer than words[i]
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].contains(words[i])) {
                    result.add(words[i]);
                    break;
                }
            }
        }

        return result;
    }
}
