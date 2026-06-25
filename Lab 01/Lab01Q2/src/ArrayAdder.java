public class ArrayAdder {

    int[] A = {10,20,30,40,50};
    int[] B = {34,67,12,89,12};
    int[] C = new int[5];

    public void calculateSum(){
        for(int i=0;i<5;i++) {
            C[i] = A[i] + B[i];
        }
    }

    public void display(){
        System.out.print("Array C: [");
        for(int i=0;i<5;i++) {
            System.out.print(C[i]);

            if (i < 4){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

}
