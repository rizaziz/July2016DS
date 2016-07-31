package datastructure;


import java.util.Iterator;

public class LinkedListImp implements Iterable{

    Node headNode;
    Node tailNode;

    private class Node{
        String data;
        Node nextNode;

        public Node(String data){
            this.data=data;
            this.nextNode=null;
        }

        public String toString(){
            return this.data;
        }
    }

    public void add(String str){

        Node node=new Node(str);

        if(headNode==null){
            headNode=node;
            tailNode=node;
        }else{
            tailNode.nextNode=node;
            tailNode=node;
        }
    }

    private class Iter implements Iterator{



        @Override
        public boolean hasNext(){
            if(headNode.nextNode==null){
                return false;
            }
            return true;
        }

        @Override
        public String next(){
            return "";
        }

        @Override
        public void remove(){
            throw new UnsupportedOperationException();
        }

    }

    public Iterator iterator(){
        return new Iter();
    }



    public static void main(String[] args){
        LinkedListImp list=new LinkedListImp();

        list.add("aziz");

        list.add("akbar");

        list.add("mamura");

        System.out.println(list.headNode);
        System.out.println(list.tailNode);
        System.out.println(list.headNode.nextNode.nextNode);




    }



}
