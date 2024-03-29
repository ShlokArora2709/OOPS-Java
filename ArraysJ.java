public class ArraysJ {
    public static void main(String[] args){
        //Declare
        int[] arr;
        //int []arr1;
        //int arr2[];
        // all 3 valid

        //Instantiation(allocates space in memory)
        arr=new int[10];

        //doing both together
        int arr4[]= new int[10];

        //Array Literal(declare + instantiate+give values)
        int arr5[]=new int[]{ 1,2,3,4,5,6,7,8,9,10};

        for(int i=0; i<arr5.length;i++){
            System.out.println(i+"-"+arr5[i]);
        }

        //Another way
        //for(int i:arr){
            //System.out.println(i);
            // works like "for item in list" in py
        //}
        maxi(arr5);
        maxi(new int[]{5,54,45,83,7,67});  //Anonymous array
        

        //Multi dim arr
        //int multiDim[][]=new int[3][3];

        //jagged array - inconsistent no of columns
        int multiDim[][]=new int[3][];
        multiDim[0]=new int[1];
        multiDim[1]=new int[3];
        multiDim[2]=new int[2];


        //Copy
        System.arraycopy(arr5, 0, arr4, 0, 7);
        for(int i:arr4){
            System.out.println(i);
        }
    }

    //func for pssing arr as method
    static void maxi(int arr[]){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.println(max);
    }
}

