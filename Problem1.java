public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        int sizeArr =8;
        System.out.println(missingEllement(arr,sizeArr));
    }
    public static int missingEllement(int[] arr,int size){
        int start =0;
        int end = arr.length-1;
        int mid =-1;
        if(size==end || arr==null||arr.length==0){
            return -1;
        }
        while(end-start>=1){
            mid = start +(end-start)/2;
            if(end-start==1){
                if(arr[mid]==mid+2){
                    return mid+1;
                }else{
                    return arr[mid]+1;
                }
            }
            if(arr[mid]>mid+1){
                end = mid;
            }else{
                start =mid;
            }
        }
        return -1;
    }
}
