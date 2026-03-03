import java.util.Arrays;

public class addone {
    public static int[] main(String[] args) {
        // int arr[] = {4,3,2,9};int l = arr.length-1;
        // if(arr[arr.length-1] < 9){
        //     arr[arr.length-1] = arr[arr.length-1]+1;
        //     System.out.println(Arrays.toString(arr));
        // }
           
        // else if(arr[l] == 9){
        //     arr[l] = 0 ;
        //     for(int i = l-1 ; i >= 0 ; i-- ){
        //         if(arr[l-1]<9){
        //             arr[l-1] = arr[l-1]+1;
        //             break;
        //         }
        //         else if(arr[l-1]==9){
        //             arr[l-1] = 0 ;
        //         }
        //     }
        //     System.out.println(Arrays.toString);
        // }
        // int arr[] = {9,9,9};
        // int carry = 0 ;
        // int l = arr.length-1;
        // int count = 0 ;
        // if(arr[l]<9){
        //     arr[l] = arr[l]+1;
        //     System.out.println(Arrays.toString(arr));
        // }
        // else if(arr[l] == 9){
        //     carry = 1 ;
        //     arr[l] = 0 ;
        //     for(int i = 0 ; i < arr.length ; i++){
        //         if(arr[i]==9){
        //             count++;
        //         }
        //     }
        //     if(count != l+1){
        //         for(int i = arr[l-1] ; i <= 0 ; i--){
        //             if(arr[i] < 9){
        //                 arr[i] = arr[i]+carry;
        //                 carry = 0 ;
        //             }
        //             else if(arr[i] == 9){
        //                 arr[i] = 0 ;
        //             }
        //         }
        //         System.out.println(Arrays.toString(arr));
        //     }
        //     else if(count == l+1){
        //         int output[] = new int[l+2];
        //         output[0] = 1 ;
        //         for(int i = 1 ; i < output.length ;i++){
        //             output[i] = 0 ;
        //         }
        //         System.out.println(Arrays.toString(output));
        //     }
        // int sum = 0 ; int carry = 0;
        // int arr[] = {9 , 9 , 9 };
        
        // for(int i = arr.length-1 ; i >= 0 ;i++){
        //     sum = arr[i]+1 ;
        //     if(sum < 10){
        //         arr[i] = sum+carry ;
        //         break ;
        //     }
        //     else if(sum == 10){
        //         arr[i] = 0 ;
        //         carry = 1;
        //     }
        // }


        // average - O(3N)

        // int arr[] = {3,2,9,9};
        // int sum = 0 ;
        // int carry = 0 ;
        // sum = arr[arr.length-1]+1 ;
        // if(sum < 10){
        //     arr[arr.length-1] = sum ;
        //     System.out.println(Arrays.toString(arr));
        // }
        // else if(sum == 10){
        //     carry = 1 ;
        //     arr[arr.length-1] = 0 ;
        //     for(int i = arr.length-2 ; i >= 0 ; i--){
        //         sum = arr[i] + carry ;
        //         if(sum == 10){
        //             arr[i] = 0 ;
        //             carry = 1 ;
        //         }
        //         else if(sum < 10){
        //             arr[i] = sum ;
        //             carry = 0 ;
        //             break ;
        //         }  
        //     }
            
        //     if(carry == 1){
        //         int output[] = new int[arr.length+1];
        //         output[0] = 1;
        //         for(int i = 1 ; i < output.length ; i++){
        //             output[i] = 0 ;
        //         }
        //         System.out.println(Arrays.toString(output));
        //     }
        //     else{
        //         System.out.println(Arrays.toString(arr));
        //     }
        // }



        // OPTIMAL SOLUTION 


        int arr[] = {9,9,9,3,9,9,9};
        int len = arr.length;
        for(int i = len-1 ; i >= 0 ; i-- ){
            if(arr[i]<9){
                arr[i]++;
                System.out.println(Arrays.toString(arr));//return arr
            }
            arr[i] = 0 ;
        }
        int output[] = new int[len+1];
        output[0] = 1 ;
        System.out.println(Arrays.toString(output)); //return output
        
    }
}
