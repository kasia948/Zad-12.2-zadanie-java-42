import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class NumbersInQueue {
    public static void main(String[] args) {

        Queue<Integer> liczby = new PriorityQueue<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <10 ; i++) {
            liczby.offer(input.nextInt());
        }
        int sum=0;

        while (!liczby.isEmpty()){
            sum = sum+liczby.peek();
            System.out.print(liczby.poll()+"+");
        }
        System.out.println("="+sum);
    }
}