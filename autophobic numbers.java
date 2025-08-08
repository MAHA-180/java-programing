public class AutophobicNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int square = i * i;
            String numberStr = Integer.toString(i);
            String squareStr = Integer.toString(square);
            if (squareStr.contains(numberStr)) {
                System.out.println(i + " squared is " + square + " -> " + numberStr + " is found in " + squareStr);
            }
        }
    }
}

OUTPUT:
1 squared is 1 -> 1 is found in 1
5 squared is 25 -> 5 is found in 25
6 squared is 36 -> 6 is found in 36
10 squared is 100 -> 10 is found in 100
25 squared is 625 -> 25 is found in 625
50 squared is 2500 -> 50 is found in 2500
60 squared is 3600 -> 60 is found in 3600
76 squared is 5776 -> 76 is found in 5776
100 squared is 10000 -> 100 is found in 10000
