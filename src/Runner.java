public class Runner {
    public static void main(String[] args){
        long time = System.nanoTime();
        utils.bubbleSort(randIntArr);
        time=System.nanoTime() - time;

        System.out.println("Time Taken: " + time);
    }
}
