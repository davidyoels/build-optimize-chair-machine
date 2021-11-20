/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package targil_1;

/**
 *
 * @author david salmon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BuildBase buildBase;
        PaintingChair paintingSeat;
        AssemblyChair assemblySeat;
        CoverChair coverSeat;
        int n = 4;//4 chairs
        for (int k = 1; k < n + 4; k++) {
            if (k == 1) {
                buildBase = new BuildBase(k);
                try {
                    buildBase.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k == 2) {
                buildBase = new BuildBase(k);
                paintingSeat = new PaintingChair(k - 1);
                try {
                    buildBase.join();
                    paintingSeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k == 3) {
                buildBase = new BuildBase(k);
                paintingSeat = new PaintingChair(k - 1);
                assemblySeat = new AssemblyChair(k - 2);
                try {
                    buildBase.join();
                    paintingSeat.join();
                    assemblySeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k == 4) {
                buildBase = new BuildBase(k);
                paintingSeat = new PaintingChair(k - 1);
                assemblySeat = new AssemblyChair(k - 2);
                coverSeat = new CoverChair(k - 3);
                try {
                    buildBase.join();
                    paintingSeat.join();
                    assemblySeat.join();
                    coverSeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k == n + 1) {
                paintingSeat = new PaintingChair(k - 1);
                assemblySeat = new AssemblyChair(k - 2);
                coverSeat = new CoverChair(k - 3);
                System.out.println("Finished Chair Number: " + (k - 4));
                try {
                    paintingSeat.join();
                    assemblySeat.join();
                    coverSeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k == n + 2) {
                assemblySeat = new AssemblyChair(k - 2);
                coverSeat = new CoverChair(k - 3);
                System.out.println("Finished Chair Number: " + (k - 4));
                try {
                    assemblySeat.join();
                    coverSeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k == n + 3) {
                coverSeat = new CoverChair(k - 3);
                System.out.println("Finished Chair Number: " + (k - 4));
                try {
                    coverSeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            } else if (k >= 5) {
                buildBase = new BuildBase(k);
                paintingSeat = new PaintingChair(k - 1);
                assemblySeat = new AssemblyChair(k - 2);
                coverSeat = new CoverChair(k - 3);
                System.out.println("Finished Chair Number: " + (k - 4));
                try {
                    buildBase.join();
                    paintingSeat.join();
                    assemblySeat.join();
                    coverSeat.join();
                } catch (InterruptedException excp) {
                    System.out.println(excp.getMessage());
                }
            }

            if (k == n + 3) {
                System.out.println("Finished Chair Number: " + n);
                System.out.println("Finished building all chairs");
            } else {
                System.out.println("Finished the " + k + " iterarion");
            }
        }
    }
}
