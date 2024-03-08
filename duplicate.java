public class duplicate {
    public static void main(String[] args) {
        int arr []=new int[]{500,200,500,300,300,200};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
              if (arr[i]!=0) {
                System.out.println(arr[i]);
                
              }
        }


    }

}
