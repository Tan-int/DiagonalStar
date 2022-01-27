public class DiagonalStar {
    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 0; row < number; row++) {
            for(int column = 0; column < number; column++) {
                //conditions for printing a star
                if(row == 0 || column == 0 || row == column || row == number - 1
                        || column == number - 1 || row + column == number - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // print a space if conditions aren't met
                }
            }
            System.out.println(); // move on to the next row after going through each column
        }
    }
}
