package org.lessons.java;

public class StringList {
    private String[] list;
    private int length;

    public StringList(){
        list = new String[5];
        length = 0;
    }

    public void add(String s){
        if (length == list.length){
            String[] newList = new String[list.length + 1];
            System.arraycopy(list,0,newList,0,list.length);
            list = newList;
        }
        list[length++] = s;
    }
    public int size(){
        return length;
    }
    public void clear(){
        list = new String[5];
        length = 0;
    }
    public void remove(int i) throws IndexOutOfBoundsException{
        if (i < 0 || i >= length){
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(list, i + 1, list, i, length - i - 1);
        list[--length] = null;
    }
    public String get(int i){
        if (i < 0 || i >= length){
            throw new IndexOutOfBoundsException();
        }
        return list[i];
    }
}
