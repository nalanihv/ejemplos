public class PilaArray {
    private static final int size=10;
    private int[] list;
    private int top;


    public PilaArray() {
        list = new int[size];
        top = -1;

    }

    public int getTop() {
        return top;
    }
    public void push(int data){
        top++;
        list[top]=data;
    }
}
