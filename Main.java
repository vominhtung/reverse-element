import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        reverseIntegers();
        reverseString();
    }
    public static  void  reverseIntegers(){
        Stack<Integer> stackIntegers = new Stack();
        Stack<Integer> newStackIntegers = new Stack();
        stackIntegers.push(5);
        stackIntegers.push(12);
        stackIntegers.push(3);
        stackIntegers.push(4);
        stackIntegers.push(15);
        System.out.println("Stack");
        System.out.println(stackIntegers);

        System.out.println("Stack size:"+ stackIntegers.size());
        int stackSize = stackIntegers.size();
        for (int i = 0; i < stackSize;i++){
            Integer a = stackIntegers.pop();
            newStackIntegers.push(a);
        }
        System.out.println("Stack after-sorted");
        System.out.println(newStackIntegers);
    }
    private static void reverseString(){
        Stack<String> wStack = new Stack();
        Stack<String> newWStack = new Stack();

        String string = "Tha thiết liễu in hồ gợn sóng";
        String[] arrList = string.split(" ");
        for (String mWord:arrList){
            wStack.push(mWord);
        }
        System.out.println("Array before-sorted ");
        System.out.println(wStack);

        int stackSize = wStack.size();
        for (int i = 0; i < stackSize; i++){
            String el = wStack.pop();
            newWStack.push(el);
        }
        System.out.println("Array after-sorted");
        System.out.println(newWStack);
    }


}