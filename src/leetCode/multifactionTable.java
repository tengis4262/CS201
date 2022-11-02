package leetCode;

public class multifactionTable{
    public static void main(String[] args) {
        int tableSize = 5;
        printMultiplicationTable(tableSize);
    }

    public static void printMultiplicationTable(int tableSize) {
        // first print the top header row
        System.out.println("\tMultification Table");
        System.out.format("      ");
        for(int i = 1; i<=tableSize;i++ ) {
            System.out.format("%4d",i);
        }
        System.out.println();
        System.out.println("------------------------------------------");

        for(int i = 1 ;i<=tableSize;i++) {
            // print left most column first
            System.out.format("%4d |",i);
            for(int j=1;j<=tableSize;j++) {
                System.out.format("%4d",i*j);
            }
            System.out.println();
        }
    }

}


