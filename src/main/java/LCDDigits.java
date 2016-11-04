public class LCDDigits {

    String n0 = "._.\n|.|\n|_|";
    String n1 = "...\n..|\n..|";
    String n2 = "._.\n._|\n|_.";
    String n3 = "._.\n._|\n._|";

    String [] arr = new String [] {n0,n1,n2,n3};

    public String printDigits(int index) {
        int smallDigit = 0;
        int bigDigit = 0;
        if (index > 9) {
            smallDigit = index % 10;
            bigDigit = (index - smallDigit) / 10;
            return printDigits(bigDigit, smallDigit);
        }
        return arr[index];
    }
    public String printDigits(int index0, int index1) {
                return makeFirstLine(index0,index1) + "\n" +
                makeSecondLine(index0,index1) + "\n" +
                makeThirdLine(index0,index1);
    }



    private String makeFirstLine(int i0, int i1){
        return String.valueOf(arr[i0].split("\n")[0]) + " " + String.valueOf(arr[i1].split("\n")[0]);
    }
    private String makeSecondLine(int i0, int i1){
        return String.valueOf(arr[i0].split("\n")[1]) + " " + String.valueOf(arr[i1].split("\n")[1]);
    }
    private String makeThirdLine(int i0, int i1){
        return String.valueOf(arr[i0].split("\n")[2]) + " " + String.valueOf(arr[i1].split("\n")[2]);
    }
}
