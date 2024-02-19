package Stack;

public class Main {
    public static void main(String[]args){
        Stack st = new Stack(3);
        st.getHeight();
        st.getTop();
        st.printStack();
        System.out.println();
        st.push(5);
        st.printStack();
        System.out.println();
        System.out.println(st.pop().value);
        //st.printStack();
        System.out.println(st.pop().value);
        System.out.println(st.pop());
    }
}
