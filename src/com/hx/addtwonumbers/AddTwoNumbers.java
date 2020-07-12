package com.hx.addtwonumbers;

/**
 * Created by Zhanghongxin on 2020/6/5.
 *
 * input(2->4->3)+(5->6->4)
 * output7->0->8
 * 342+465 = 807
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        Node first = new Node(3,null);
        Node second = new Node(4,first);
        Node three = new Node(2,second);

        Node first1 = new Node(4,null);
        Node second1 = new Node(6,first1);
        Node three1 = new Node(5,second1);
        System.out.println(three.toString());
        System.out.println(three1.toString());
        addTwoNumbers(three1,three);
    }

    static void addTwoNumbers(Node list1,Node list2){
        if (list1==null){
            System.out.println(list2.toString());
        }
        if (list2==null){
            System.out.println(list1.toString());
        }
        Node start = new Node(0,null);
        Node current = new Node(0,null);

        int carry = 0;
        while (list1!=null||list2!=null||carry!= 0 ){
            int sum = (list1==null?0:list1.value)+(list2==null?0:list2.value+carry);
            int value = sum%10;
            carry = sum/10;

        }


    }

   static class Node{
        Integer value;
        Node next;

       @Override
       public String toString() {
           String str = this.value+"";
           Node node = this;
           while (node.next!=null){
               node = node.next;
               str = str + "->"+node.value;
           }
           return str;

       }

       public Node(Integer value, Node next) {
           this.value = value;
           this.next = next;
       }

       public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
