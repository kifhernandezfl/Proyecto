package project;
import java.util.*;
import javax.swing.JOptionPane;

public class BinaryTree
{
    Node root = null;
    Scanner sc = new Scanner(System.in);
    String respuesta = "";
    
    // Imagenes
    MyIcon icon = new MyIcon();
    Messi m = new Messi();
    Keylor k = new Keylor();
    Marcelo m12 = new Marcelo();
    Casemiro c = new Casemiro();
    Kroos t = new Kroos();
    Isco i = new Isco();
    Modric l = new Modric();
    KB kb = new KB();
    CR7 cr = new CR7();
    Bale b = new Bale();
    Ramos r = new Ramos();
    Varane v = new Varane();
    Kiko ki = new Kiko();
    Dani d = new Dani();
    Suarez s = new Suarez();
    Mina y = new Mina();
    Cou co = new Cou();
    Paulinho p = new Paulinho();
    Dembele o = new Dembele();
    Umtiti u = new Umtiti();
    Ter st = new Ter();
    Rakitic ir = new Rakitic();
    Busquets sb = new Busquets();
    Jorid ja = new Jorid();
    Pique gp = new Pique();
    
    public BinaryTree(){}

    /**
     * 
     * @param ask
     * @param value 
     */
    public void insert(String ask, int value)
    {
        Node node = new Node(ask, value);

        if(root == null) // si el arbol esta vacio ponemos el nodo en la raiz
        {
            root = node;
        }
        else
        {
            Node temp = root;
            Node parent = null;
            boolean left = false;

            while(temp != null)
            {
                parent = temp;

                if(value < temp.value)
                {
                    temp = temp.left;
                    left = true;
                }
                else
                {
                        temp = temp.right;
                    left = false;
                }

            }

            temp = node;

            if(left) parent.left = temp;
            else parent.right = temp;
        }
    }
    
    /**
    * 
    * @param raiz
    * @return raiz
    */  
    public Node Questions(Node raiz)
    {
        if(raiz.left == null && raiz.right == null)
        {
            int rta = JOptionPane.showConfirmDialog(null, raiz.ask , "Respuesta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);
            
            if(rta == 0)
            {
                if(raiz.value == 83)
                    m.setVisible(true);
                    
                if(raiz.value == 21)
                    k.setVisible(true);
                    
                if(raiz.value == 13)
                    m12.setVisible(true);
                    
                if(raiz.value == 17)
                    c.setVisible(true);
                    
                if(raiz.value == 32)
                    t.setVisible(true);
                    
                if(raiz.value == 36)
                    i.setVisible(true);
                
                if(raiz.value == 38)
                    l.setVisible(true);
                
                if(raiz.value == 45)
                    kb.setVisible(true);
                
                if(raiz.value == 41)
                    cr.setVisible(true);
                
                if(raiz.value == 44)
                    b.setVisible(true);
                
                if(raiz.value == 48)
                    r.setVisible(true);
                
                if(raiz.value == 50)
                    v.setVisible(true);
                
                if(raiz.value == 54)
                    ki.setVisible(true);
                
                if(raiz.value == 52)
                    d.setVisible(true);
                
                if(raiz.value == 87)
                    s.setVisible(true);
                
                if(raiz.value == 93)
                    y.setVisible(true);
                
                if(raiz.value == 97)
                    co.setVisible(true);
                
                if(raiz.value == 99)
                    p.setVisible(true);
                
                if(raiz.value == 74)
                    o.setVisible(true);
                
                if(raiz.value == 72)
                    u.setVisible(true);
                
                if(raiz.value == 76)
                    st.setVisible(true);
                
                if(raiz.value == 79)
                    ir.setVisible(true);
                
                if(raiz.value == 63)
                    sb.setVisible(true);
                
                if(raiz.value == 66)
                    ja.setVisible(true);
                
                if(raiz.value == 68)
                    gp.setVisible(true);
            }
                       
            if(rta == 1)
            {
                int rt = JOptionPane.showConfirmDialog(null, "Desea agregar a su personaje?" , "Respuesta!", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);
                if(rt == 0) 
                    respuesta = JOptionPane.showInputDialog("Escribe su nombre");
                    //personajes.enqueue(node);
                if(rt == 1)
                    JOptionPane.showMessageDialog(null, "Bien!! juego terminado");
            }
        }else
        {
            int rta = JOptionPane.showConfirmDialog(null, raiz.ask, "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE, icon);
          
            if(rta == 0)
                raiz.left = Questions(raiz.left);
            if(rta == 1)
                raiz.right = Questions(raiz.right);
        }    
        return raiz;
    }
    
    public void mostrar()
    {
        //personajes.printQueue();
    }
}