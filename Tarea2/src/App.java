public class App {
    public static void main(String[] args) throws Exception {
        int maxNum = 0;
        int average = 0;

        int[] array = new int[5];
        int[] aInvert = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50) + 1;
        }

        System.out.print("Array: [");

        for (int i = 0; i < array.length; i++) {
            average += array[i];
            if (i == array.length - 1) {
                System.out.print(array[i]);
                average /= array.length;
            } else {
                System.out.print(array[i] + ", ");
            }
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        System.out.println("]\n");
        System.out.println("El numero mas alto del array es: " + maxNum);
        System.out.println("El promedio es: " + average);

        // for (int i = 0; i < array.length / 2; i++) {
        // int aux = array[i];
        // array[i] = array[array.length - i - 1];
        // array[array.length - i - 1] = aux;
        // }

        // for (int i = 0; i < array.length - 1; i++) {
        // System.out.println(array[i]);
        // }

        for (int i = 0; i < array.length; i++) {
            aInvert[array.length - i - 1] = array[i];
        }

        for (int i = 0; i < aInvert.length; i++) {
            System.out.println(aInvert[i]);
        }
    }
}
