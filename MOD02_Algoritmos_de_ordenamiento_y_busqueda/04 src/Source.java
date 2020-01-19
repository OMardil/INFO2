public class Source{

    public static void main(String[] args){

        int[] data = new int[10];
        fillArray(data, 1);
        fillArray(data, 0);
        fillArray(data, 15);
        fillArray(data, 30);
        fillArray(data, 1);

        for(int out: data){
            System.out.println(out);
        }
    }


    public static int findElement(int[] array, int target){
        for(int i=0; i<array.length; i++){
            if (array[i] == target)
                return  i;
        }
        
        return -1;
    } 


}