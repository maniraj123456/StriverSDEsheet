public class Solution{
    static class Stack {
        int arr[];
        int top1 = -1;
        int cap1 = 0;
        Stack(int capacity) {
            arr = new int[capacity];
            cap1 = capacity;
        }
        public void push(int num) {
            if(top1==cap1-1){
                return;
            }
            top1++;
            arr[top1]= num;
        }
        public int pop() {
            if(top1==-1){
                return -1;
            }
            int val = arr[top1];
            top1--;
            return val;
        }
        public int top() {
           if(top1 == -1){
               return -1;
           }
           return arr[top1];
        }
        public int isEmpty() {
            if(top1==-1)
                return 1;
            return 0;
        }
        public int isFull() {
           if(top1==cap1-1)
                return 1;
           return 0;
        }
    }
}