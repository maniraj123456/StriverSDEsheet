public class Solution{
    static class Stack {
        int arr[];
        int top1 = -1;
        int cap1 = 0;
        Stack(int capacity) {
            arr = new int[capacity];
            cap1 = capacity;
        }
        public boolean push(int num) {
            if(top1==cap1-1){
                return false;
            }
            top1++;
            arr[top1]= num;
            return true;
        }
        public int pop() {
            if(top1==-1){
                System.out.println("no elements in stack");
                return -1;
            }
            int val = arr[top1];
            top1--;
            return val;
        }
        public int top() {
           if(top1 == -1){
               System.out.println("no elements in stack");
                return ;
           }
           return arr[top1];
        }
        public boolean isEmpty() {
            if(top1==-1)
                return true;
            return false;
        }
        
        public boolean isFull() {
           if(top1==cap1-1)
                return true;
           return false;
        }
    }
}
