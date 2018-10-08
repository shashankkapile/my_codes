package DynamicConnectivity;

/**
 *
 * @author ShawShank
 */
public class QuickUnion {

    public int array[];

    public QuickUnion() {
        array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
    }

    //check if both are anyhow connected or not
    boolean connected(int a, int b) {
        return (getRoot(a) == getRoot(b));
    }

    //returns the main root of any element
    int getRoot(int num) {
        while (array[num] != num)
            num = array[num];
        return num;
    }

    //
    void union(int a, int b) {

        int num1 = getRoot(a);
        int num2 = getRoot(b);

        array[num1] = num2;
    }

    public static void main(String... s) {

        QuickUnion qU = new QuickUnion();
        qU.union(2, 3);
        qU.union(6, 8);
        qU.union(3, 4);
        qU.union(4, 5);
        qU.union(0, 9);
        qU.union(1, 7);
        qU.union(0, 1);
        qU.union(5, 6);
//
//        for(int i=0;i<10;i++){
//            System.out.print(i);
//            System.out.print(qU.array[i]+"  ");
//
//        }
        System.out.println("0,5 " + qU.connected(0, 5));
        System.out.println("2,5 " + qU.connected(2, 5));
        System.out.println("2,8 " + qU.connected(2, 8));

    }
}
