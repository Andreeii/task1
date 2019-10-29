public class main {
    public static void main(String[] args) {
        
        int a = 9 ;
        int  arr[] = {2,7,11,4,5};

        for (int i = 0 ; i < arr.length ; i++){

            for(int j = 0 ; j < arr.length ; j ++){
                if( arr[i]+ arr[j] == a ){
                    System.out.print(i);
                    System.out.print(" ");
                    System.out.print(j);
                    System.out.print(" | ");
                }
            }
        }

    }
}

