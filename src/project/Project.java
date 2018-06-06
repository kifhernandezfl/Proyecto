package project;
import java.util.*;
import javax.swing.*;

public class Project 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        BinaryTree testTree = new BinaryTree();
        testTree.insert("¿Tu personaje juega en el Real Madrid? ", 60);
        testTree.insert("¿Tu personaje es americano? ", 30);
        testTree.insert("¿Tu personaje es de Brasil? ", 20);
        testTree.insert("¿Tu personaje es de Costa Rica? ", 25);
        testTree.insert("¿Tu personaje juega de lateral?", 15);
        testTree.insert("¿Tu personaje es arquero? ", 22);
        testTree.insert("¿Tu personaje es Keylor Navas? ", 21);
        testTree.insert("¿Tu personaje es Marcelo? ", 13);
        testTree.insert("¿Tu personaje es Casemiro?", 17);
        testTree.insert("¿Tu personaje juega de volante?",40);
        testTree.insert("¿Tu personaje es aleman?",35);
        testTree.insert("¿Tu personaje es Tony Kroos?  ",32);
        testTree.insert("¿Tu personaje es español?  ",37);
        testTree.insert("¿Tu personaje es Isco?  ",36);
        testTree.insert("¿Tu personaje es Luka Modric?  ",38);
        testTree.insert("¿Tu personaje juega de delantero?  ",47);
        testTree.insert("¿Tu personaje jugo en la liga Inglesa?  ",45);
        testTree.insert("¿Tu personaje es Karim Benzema?  ",45);
        testTree.insert("¿Tu personaje tiene el dorsal 7?  ",43);
        testTree.insert("¿Tu personaje es Cristiano Ronaldo? ",41);
        testTree.insert("¿Tu personaje es Bale? ",44);
        testTree.insert("¿Tu personaje juega como defensa central? ",51);
        testTree.insert("¿Tu personaje es Español? ",49);
        testTree.insert("¿Tu personaje es Sergio Ramos? ",48);
        testTree.insert("¿Tu personaje es Varane? ",50);
        testTree.insert("¿Tu personaje juega como lateral? ",53);
        testTree.insert("¿Tu personaje es Arquero? ",55);
        testTree.insert("¿Tu personaje juega Kiko Casilla? ",54);
        testTree.insert("¿Tu personaje es Dani Carvajal? ",52);
        testTree.insert("¿Tu personaje es europeo? ",80);
        testTree.insert("¿Tu personaje es delantero? ",90);
        testTree.insert("¿Tu personaje es Argentino? ",85);
        testTree.insert("¿Tu personaje es Lionel Messi? ",83);
        testTree.insert("¿Tu personaje es Luis Suarez? ",87);
        testTree.insert("¿Tu personaje juega de defensa? ",95);
        testTree.insert("¿Tu personaje es Yerry Mina? ",93);
        testTree.insert("¿Tu personaje jugo en el Liverpool? ",98);
        testTree.insert("¿Tu personaje jugo en el Coutinho? ",97);
        testTree.insert("¿Tu personaje es Paulinho? ",99);
        testTree.insert("¿Tu personaje es español? ",70);
        testTree.insert("¿Tu personaje es Frances? ",75);
        testTree.insert("¿Tu personaje juega en la defensa? ",73);
        testTree.insert("¿Tu personaje es Ousmane Dembele? ",74);
        testTree.insert("¿Tu personaje es Samuel Umtiti? ",72);
        testTree.insert("¿Tu personaje es arquero? ",77);
        testTree.insert("¿Tu personaje es Marc Andre Ter Stegen? ",76);
        testTree.insert("¿Tu personaje es volante? ",78);
        testTree.insert("¿Tu personaje es Ivan Rakitic? ",79);
        testTree.insert("¿Tu personaje es volante? ",65);
        testTree.insert("¿Tu personaje es Sergio Busquets? ",63);
        testTree.insert("¿Tu personaje es lateral? ",67);
        testTree.insert("¿Tu personaje es Jordi Alba? ",66);
        testTree.insert("¿Tu personaje es Gerard Pieque? ",68);
    
        System.out.println(testTree.Questions(testTree.root));
        testTree.mostrar();
        NewJFrame m = new NewJFrame();
        
        
    }
}
