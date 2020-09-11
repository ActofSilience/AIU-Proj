
package itci321ip5_2;


import java.util.ArrayList; 
import java.util.Scanner; 

class Node<P , O> 
{ 
    P key; 
    O value; 
    
    Node<P, O> next; 
     
    public Node(P key, O value) 
    { 
        this.key = key; 
        this.value = value; 
    } 
} 

class MyTable<P, O> 
{ 
    
    private ArrayList<Node<P, O>> bucketList; 
  
    
    private int buckets; 
 
    private int size; 
  
    
    public MyTable() 
    { 
        bucketList = new ArrayList<>(); 
        buckets = 5; 
        size = 0; 
  
        
        for (int i = 0; i < buckets; i++) 
            bucketList.add(null); 
    } 

    
    private int BucketIndex(P key) 
    { 
        int myHash = key.hashCode(); 
        int index = myHash % buckets; 
        return index; 
    } 

    public O remove(P key) 
    { 
       
        int bucketIndex = BucketIndex(key); 
  
        
        Node<P, O> head = bucketList.get(bucketIndex); 
        Node<P, O> prev = null; 
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
            bucketList.set(bucketIndex, head.next); 
  
        return head.value; 
    } 
 
    public void add(P key, O value) 
    { 
        
        int bucketIndex = BucketIndex(key); 
        Node<P, O> head = bucketList.get(bucketIndex); 
  
        
        while (head != null) 
        { 
            if (head.key.equals(key)) 
            { 
                head.value = value; 
                return; 
            } 
            head = head.next; 
        } 
  
        
        size++; 
        head = bucketList.get(bucketIndex); 
        Node<P, O> newNode = new Node<P, O>(key, value); 
        newNode.next = head; 
        bucketList.set(bucketIndex, newNode); 
  
       
        if ((1.0*size)/buckets >= 2.8) 
        { 
            ArrayList<Node<P, O>> temp = bucketList; 
            bucketList = new ArrayList<>(); 
            buckets = 2 * buckets; 
            size = 0; 
            for (int i = 0; i < buckets; i++) 
                bucketList.add(null); 
  
            for (Node<P, O> headNode : temp) 
            { 
                while (headNode != null) 
                { 
                    add(headNode.key, headNode.value); 
                    headNode = headNode.next; 
                } 
            } 
        } 
    }
     public void printTable()
    {
        for (int i = 0; i < buckets; i++)
        {
            System.out.print("\nBucket "+ (i + 1) +" : ");
            Node entry = bucketList.get(i);
            while (entry != null)
            {
                System.out.print(entry.value +" ");
                entry = entry.next;
            }            
        }
    }
}

public class ITCO321IP_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
 Scanner scan = new Scanner(System.in);
 char ch;  
MyTable nt = new MyTable();
do
{
// TODO code application logic here
   System.out.println(" Options");
   System.out.println("1. Insert");
   System.out.println("2. Remove");
   System.out.println("3. Close ");
int decision = scan.nextInt();

switch (decision)
{
   case 1:
        System.out.println("Enter a key and a value:");
        nt.add(scan.next(), scan.nextInt());
        break; 
    case 2:
        System.out.println("Enter key");
        nt.remove( scan.next());
        break;
    case 3:
        System.exit(0);
    default:
        System.out.println("Invalid entry");
        break;
}
nt.printTable();
System.out.println("");
System.out.println("Type y to continue, or n to exit");
ch = scan.next().charAt(0);
} while (ch == 'Y'|| ch == 'y');
    }
}
  