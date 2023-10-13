public class Solution{
    static class Stack {
        int arr[];
        //pointer to stack top
        int top1 = -1;//Intially it is set to no elemnets
        int cap1 = 0;//Intial capacity is 0;
        Stack(int capacity) {
            arr = new int[capacity];
            cap1 = capacity;
        }
        public boolean push(int num) {
            if(top1==cap1-1){
                //if  the capacity of stack is full
                return false;//push failed
            }
            top1++;
            arr[top1]= num;
            return true;//push is success
        }
        public boolean pop() {
            if(top1==-1){
                return false;
                //Here setting -1 will have a conflict with popping a element -1
                //so using return type as boolean is ideal .but it won't able to know what element got deleted.But can be found using top()
            }
            int val = arr[top1];
            top1--;
            return true;
        }
        public int top() {
           if(top1 == -1){
                //Here setting -1 will have a conflict with top element as -1
               return ;
           }
           return arr[top1];
        }
        //both functions need to be using boolean return type
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
