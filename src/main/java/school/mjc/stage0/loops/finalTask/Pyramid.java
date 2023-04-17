package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            int delta=0;
            for (int j = 1; j <=cathetusLength+i ; j++) {
                if (j<cathetusLength-i){
                    System.out.print(" ");
                }else {
                    System.out.print(i+1-delta);
                    if (j<cathetusLength){
                        delta++;
                    }else {
                        delta--;
                    }
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(2);
    }
}
