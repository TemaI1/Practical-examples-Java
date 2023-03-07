public class Practical5 {

    public static void main(String[] args) {
        int[] array1 = new int[] {94, 812, 258, 171, 566, 782, 365, 784};
        int[] array2 = new int[] {91, 858, 22, 111, 556, 22, 323, 445};
        int[] array3 = new int[] {945, 18, 232, 551, 576, 200, 436, 884};

        bubbleSort(array1);
        directSort(array2);
        insertSort(array3);

        System.out.print("bubbleSort: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.print("directSort: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.print("insertSort: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }

    }

    public static void bubbleSort(int[] num){
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]){
                    int save = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = save;
                }
            }
        }
    }

    public static void directSort(int[] num){
        for (int i = 0; i < num.length; i++) {
            int posMin = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[posMin]){
                    posMin = j;
                }
            }
            if(posMin != i){
                int save = num[posMin];
                num[posMin] = num[i];
                num[i] = save;
            }
        }
    }

    public static void insertSort(int[] num){
        for (int i = 1; i < num.length; i++) {
            for (int j = i; j > 0; j--) {
                if (num[j] < num[j - 1]){
                    int save = num[j];
                    num[j] = num[j - 1];
                    num[j - 1] = save;
                } else {
                    break;
                }
            }
        }
    }

}

