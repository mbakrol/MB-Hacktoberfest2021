import java.util.Scanner;

public class Selection_Sort {

    void solution(int[] array){

        for(int i=0; i<array.length-1; i++){
            int pos = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<array[i]) {
                    pos = j;
                }
            }
            int temp = array[pos];
            array[pos] = array[i];
            array[i] = temp;
        }
    }

    void display(int[] array){

        for (int i=0; i<array.length; ++i){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Selection_Sort sort = new Selection_Sort();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter size of array");
        int size = sc.nextInt();

        System.out.println("Enter elements");
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        sort.solution(array);
        sort.display(array);
    }
}
