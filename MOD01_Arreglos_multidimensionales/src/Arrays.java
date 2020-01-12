public class Arrays{

    public static void main(String[] args) {

        int[] arr1;
        arr1 = new int[10];

        int arr2[];
        arr2 = new int[10];

        int[] arr3 = new int[10];
        
        int arr4[] = new int[10];

        int[] arr5 = {0,0,0,0,0,0,0,0,0,0};

        int a = 0;
        int[] arr6 = new int[]{a, a, a, a, a, a, a, a, a, a};


        for (int i=0; i<arr1.length; i++){
            System.out.println("Count: " + arr1[i]);
        }


        int[][] x1 = new int[3][3];
        int x2[][] = new int[3][3];

        //Implicit declaration
        int[][] x3 = {{1,2,3},{4,5,6},{7,8,9}};

        int[][] x4 = new int[3][];
        x4[0] = new int[3];
        x4[1] = new int[3];
        x4[2] = new int[3];

        



    }

}