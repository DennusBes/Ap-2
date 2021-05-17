package dennis.com.ap2;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    private String naam;
    private Node currentnode;
    private String code;

    public String getCode() {
        return code; }
    public void setCode(String code) {
        this.code = code; }
    public void setCurrentnode(Node currentnode) {
        this.currentnode = currentnode; }
    public Node getCurrentnode() {
        return currentnode; }
    public void setNaam(String Value) {
        naam = Value; }
    public String getNaam() {
        return naam; }
    public Node(String nm) {
        this.naam = nm; }

    // Hashmap in which all the connections are set
    HashMap<Character, Node> connection = new HashMap<Character, Node>();

    //arraylist in which the travel history will be gathered
    ArrayList<String> travelhist = new ArrayList<>();

    // start at start node
    // start looping through code  ( code example = "ABBA" )
    // check if currentnode contains that character
    // if it contains the character, set current  node to next node, and save the travel history
    public void  FSM(){

        //loop through characters in 'code'
        for (int i = 0; i < code.length(); i++){
            char c = code.charAt(i);
            //print current nodenaam
            System.out.println(getCurrentnode().getNaam());
            //print to check current letter in code
            System.out.println(c);

            if (getCurrentnode().connection.containsKey(c)){
                System.out.println("key bestaat");
                //save node that has been visited
                travelhist.add(getCurrentnode().getNaam());
                // update current node
                setCurrentnode(getCurrentnode().connection.get(c));
            }
            else{
                System.out.println("ongeldige key, aborting mission");
                // add e to travel hist to show there has been an exception
                travelhist.add("e");
                break;
            }
        }
        System.out.println(travelhist);
    }
}

