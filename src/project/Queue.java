package project;
import java.io.*;

public class Queue 
{
    Node head = null; //

    /**
     * 
     * @return
     */
    public boolean isEmpty()
    {
        return head == null ? true : false;
    }

    /**
     * 
     * @param newNode
     */
    public void enqueue(Node newNode)
    {
        if(isEmpty())
            head = newNode;
	else
        {
            Node temp = head;
            
            while(temp.next != null)
                temp = temp.next;
            
		temp.next = newNode;
        }
    }

    /**
     * 
     * @return
     */
    public String dequeue()
    {
        Node temp = head;
	head = head.next;
        String info = temp.toString();
	//temp = null;
        System.gc();
        return info;
    }
    
    /**
     * 
     * @return 
     */
    public String Peek()
    {
        Node temp = head;
	String info = temp.toString();	
        return info;
    }
    
    /**
     * 
     */
    public void printQueue()
    {	
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
	try
        {   
            while(!isEmpty())
		
            bw.write(dequeue());
			
            bw.flush();
	}
        catch(Exception ex) {ex.printStackTrace();}
    }
}