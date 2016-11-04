public class HarryPotter {
    public double count(int[] books) {
        double total = 0;
        int zeros = 5;
        for(int i=0; i<5; i++){
            if (books[i] == 0)
                zeros--;
            total+= books[i]*8;
        }
        switch (zeros){
            case 0: total-= total * 0.25;
                break;
            case 1: total-= total * 0.2;
                break;
            case 2: total-= total * 0.1;
                break;
            case 3: total-= total * 0.05;
        }
        return total;
    }
}
