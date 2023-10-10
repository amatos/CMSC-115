public class Location {
    private static int row;
    private static int column;
    private static double maxValue;

    /**
     * @param row
     * @param column
     * @param maxValue
     */
    public Location() {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    /**
     * @return the row
     */
    public static int getRow() {
        return row;
    }

    /**
     * @return the column
     */
    public static int getColumn() {
        return column;
    }

    /**
     * @return the maxValue
     */
    public static double getMaxValue() {
        return maxValue;
    }

    /**
     * @param a
     * @return Location
     */
    public static Location locateLargest(double[][] a) {
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for (int counter1 = 0; counter1 < a.length; counter1++) {
            for (int counter2 = 0; counter2 < a[counter1].length; counter2++) {
                if (a[counter1][counter2] > maxValue) {
                    maxValue = a[counter1][counter2];
                    row = counter1;
                    column = counter2;
                }
            }
        }
        return new Location();
    }
}
