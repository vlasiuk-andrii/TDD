public class WordWrap {
    public String wrapText(String input, int n) {
        int indexFromBack = 0;
        StringBuilder output = new StringBuilder();
        StringBuilder cuted = new StringBuilder(input.substring(0,n));

        for (int i = cuted.length() - 1; i > 0; i--) {
            indexFromBack++;
            if (cuted.charAt(i) == ' ') {
                cuted.setCharAt(i, '\n');
                output = output.append(cuted);
            }
        }

        return output.toString();
    }
}
