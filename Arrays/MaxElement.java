class Main {
    public static void main(String[] args) {
        // System.out.println("Try programiz.pro");
        int[] arr={-9,2,-6,-4,-1,-2};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){  
                max=arr[i];
           
            } 
        }
        System.out.println(max);
    }
}
