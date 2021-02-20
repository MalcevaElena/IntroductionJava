package by.java_online.modul2.decomposition;

/*На плоскости заданы своими координатами n точек.
 * Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */
public class Task4 {
    public static void main(String[] args) {
        int n = 5;
        double distance;
        double maxDistance = 0;
        int x1=0;
        int x2=0;

        int[][] arrayXY = new int[2][n];

        for (int i = 0; i < arrayXY.length; i++) {
            for (int j = 0; j < arrayXY[i].length; j++) {
                arrayXY[i][j] = (int) (Math.random() * 10);
            }
        }

        System.out.println("На плоскости заданы своими координатами " + n + " точек.");
        printMatrix(arrayXY);

        for (int i = 1; i < arrayXY.length; i++) {   // i0=x; i1=y
            for (int j = 0; j < arrayXY[i].length; j++) {
                for (int k = arrayXY[i].length - 1; k > j; k--) {
                    distance =  distance(arrayXY[0][j], arrayXY[0][k],
                           arrayXY[1][j], arrayXY[1][k]);
                    if (maxDistance<distance){
                        maxDistance=distance;
                        x1=j;
                        x2=k;
                    }
                }
            }
        }

        System.out.printf("Самое большое расстояние = %.2f между точками АВ(%d,%d) и АВ(%d,%d).",
                maxDistance, arrayXY[0][x1],arrayXY[1][x1],arrayXY[0][x2],arrayXY[1][x2]);
    }

    public static double distance(int x1, int x2, int y1, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void printMatrix(int[][] arrays) {
        for (int i = 1; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print("AB(" + arrays[i-1][j] + "," + arrays[i][j] + "), ");
            }
        }
        System.out.println();
    }
}
