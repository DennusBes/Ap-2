package dennis.com.ap2;

import java.util.HashMap;

public class Main {

    public static void main(String args[]) {
        //Make all nodes
        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        //make all connections. The Key's are the trigger letters, the value is the name of the node that it will travel to.
        s0.connection.put('A', s2);
        s0.connection.put('B', s1);
        s1.connection.put('A', s1);
        s1.connection.put('B', s2);
        s2.connection.put('B', s3);
        s3.connection.put('B', s0);
        s3.connection.put('A', s3);

        //makes a Code
        s0.setCode("ABABBAXBBAABB");
        //set starting node in currentnode
        s0.setCurrentnode(s0);
        s0.FSM();
    }
}