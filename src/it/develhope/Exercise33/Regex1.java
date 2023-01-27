package it.develhope.Exercise33;

public class Regex1 {
    public static void main(String[] args) {
        String myFriend = "I Like to code near the Lake with my friend Luke";
        myFriend = myFriend.replaceAll("L[^u]ke","BLA");

        System.out.println(myFriend);
    }
}