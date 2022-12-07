/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10;

/**
 *
 * @author rodri
 */
public class Lab10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Node root = new Node(20);
       root.left = new Node(15);
       root.right = new Node(30);
       root.left.left = new Node(10);
       root.left.left.right = new Node(12);
       root.left.right = new Node(15);
       root.left.left.left = new Node(18);
    }
    
}
