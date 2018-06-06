package project;

public class Node 
{
    String ask;
    int value;

    //Apuntadores 
    Node right = null;
    Node left = null;
    Node next = null;

    public Node(String ask ,int value)
    {
        this.ask = ask;
        this.value = value;
    }
  
    public String toString()
    {
        return " " + this.ask + " " + this.value + "\n"; 
    }

    public Node clone()
    {
        return new Node(this.ask, this.value);
    }	
}