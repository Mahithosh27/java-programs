import java.util.Arrays;

public class majority { 
    public static void main(String[] args) {
        
    
    int arr[]= new int[]{1,2,1,10,10,10};
    int vistited[] = new int[100];
    for(int i=0;i<arr.length;i++){
        vistited[arr[i]]+=1;
    }
    int maxAns=0;
    int count = Arrays.stream(vistited).max().getAsInt();
    for (int i = 0; i < vistited.length; i++) {
        if(vistited[i]==count){
             maxAns=i;
            break;
        }
    }
    System.out.println(maxAns);
}
}
