public class Task4 {
    public void Run() {
        int[] values = new int[] {1, 5, 9};
        System.out.println(sum1(values));
    }

    private int sum1(int[] values){
        int sum = 0;
        for(int i = 0; i< values.length;i++){
           // sum+= values[i];
            sum = sum + values[i];
        }
        return sum;
    }
    private int sum2(int[] values) {
        int sum = 0;
        //for(int value in values){
        //    sum+= value;
        //}
        return sum;
    }
}

