package LL;

import java.util.*;

public class SelfLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
//        ll.add(6);
//        System.out.println(ll.get(2));

        int i=0,j=0;
        while(j<ll.size()){
            j+=2;
            i++;
        }
        i-=1;
        System.out.println(ll.get(i));
    }


}
