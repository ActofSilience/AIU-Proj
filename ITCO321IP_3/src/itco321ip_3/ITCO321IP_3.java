/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itco321ip_3;

import java.util.ArrayList; 
import java.util.Scanner; 

class Node<K, V> 
{ 
    K key; 
    V value; 
  
   
    Node<K, V> next; 
  
   
    public Node(K key, V value) 
    { 
        this.key = key; 
        this.value = value; 
    } 
} 
  
 
class Map<K, V> 
{ 
    
    private ArrayList<Node<K, V>> bucketArray; 
  
    
    private int numBuckets; 
 
    private int size; 
  
    
    public Map() 
    { 
        bucketArray = new ArrayList<>(); 
        numBuckets = 10; 
        size = 0; 
  
        
        for (int i = 0; i < numBuckets; i++) 
            bucketArray.add(null); 
    } 
  
    public int size() { return size; } 
    public boolean isEmpty() { return size() == 0; } 
  
   
    private int getBucketIndex(K key) 
    { 
        int hashCode = key.hashCode(); 
        int index = hashCode % numBuckets; 
        return index; 
    } 
  
   
    public V remove(K key) 
    { 
       
        int bucketIndex = getBucketIndex(key); 
  
        
        Node<K, V> head = bucketArray.get(bucketIndex); 
  
       
        Node<K, V> prev = null; 
        while (head != null) 
        { 
           
            if (head.key.equals(key)) 
                break; 
  
            prev = head; 
            head = head.next; 
        } 
  
        
        if (head == null) 
            return null; 
  
       
        size--; 
  
     
        if (prev != null) 
            prev.next = head.next; 
        else
            bucketArray.set(bucketIndex, head.next); 
  
        return head.value; 
    } 
  
    // Returns value for a key 
    public V get(K key) 
    { 
        // Find head of chain for given key 
        int bucketIndex = getBucketIndex(key); 
        Node<K, V> head = bucketArray.get(bucketIndex); 
  
        // Search key in chain 
        while (head != null) 
        { 
            if (head.key.equals(key)) 
                return head.value; 
            head = head.next; 
        } 
  
        // If key not found 
        return null; 
    } 
  
    // Adds a key value pair to hash 
    public void add(K key, V value) 
    { 
        // Find head of chain for given key 
        int bucketIndex = getBucketIndex(key); 
        Node<K, V> head = bucketArray.get(bucketIndex); 
  
        // Check if key is already present 
        while (head != null) 
        { 
            if (head.key.equals(key)) 
            { 
                head.value = value; 
                return; 
            } 
            head = head.next; 
        } 
  
        // Insert key in chain 
        size++; 
        head = bucketArray.get(bucketIndex); 
        Node<K, V> newNode = new Node<K, V>(key, value); 
        newNode.next = head; 
        bucketArray.set(bucketIndex, newNode); 
  
       
        if ((1.0*size)/numBuckets >= 0.7) 
        { 
            ArrayList<Node<K, V>> temp = bucketArray; 
            bucketArray = new ArrayList<>(); 
            numBuckets = 2 * numBuckets; 
            size = 0; 
            for (int i = 0; i < numBuckets; i++) 
                bucketArray.add(null); 
  
            for (Node<K, V> headNode : temp) 
            { 
                while (headNode != null) 
                { 
                    add(headNode.key, headNode.value); 
                    headNode = headNode.next; 
                } 
            } 
        } 
    }
}
/**
 *
 * @author Jumbo Moose
 */
public class ITCO321IP_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   Scanner scan = new Scanner(System.in);
   System.out.println("Enter size: ");
   
   Map ht = new Map(scan.nextInt());
   
 char ch;  

do
{
// TODO code application logic here
   System.out.println("Hash Table Options");
   System.out.println("1. Insert");
   System.out.println("2. Remove");
   System.out.println("3. Clear");
   System.out.println("4. Retrieve");
   System.out.println("5. Show size");
   System.out.println("6. Close ");
int decision = scan.nextInt();
switch (decision)
    case 1:
        System.out.println("Enter a key and a value:")
        ht.add(scan.next(), scan.nextInt());
        break;
    }
    

