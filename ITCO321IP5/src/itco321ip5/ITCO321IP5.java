package itco321ip5;
import java.util.Scanner;

 
class HashEntry 
{
    String key;
    int value;
    HashEntry next;
 
    
    HashEntry(String key, int value) 
    {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
 

class HashTable
{
    private int TABLE_SIZE;
    private int size; 
    private HashEntry[] table;
 
    
    public HashTable(int ts) 
    {
        size = 0;
        TABLE_SIZE = ts;
        table = new HashEntry[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    } 
    
    public int getSize()
    {
        return size;
    }
    
    public void Empty()
    {
        for (int i = 0; i < TABLE_SIZE; i++)
            table[i] = null;
    }
    
    public int get(String key) 
    {
        int hash = (myhash( key ) % TABLE_SIZE);
        if (table[hash] == null)
            return -1;
        else 
        {
            HashEntry entry = table[hash];
            while (entry != null && !entry.key.equals(key))
                entry = entry.next;
            if (entry == null)
                return -1;
            else
                return entry.value;
        }
    }
    
    public void insert(String key, int value) 
    {
        int hash = (myhash( key ) % TABLE_SIZE);
        if (table[hash] == null)
            table[hash] = new HashEntry(key, value);
        else 
        {
            HashEntry entry = table[hash];
            while (entry.next != null && !entry.key.equals(key))
                entry = entry.next;
            if (entry.key.equals(key))
                entry.value = value;
            else
                entry.next = new HashEntry(key, value);
        }
        size++;
    }
 
    public void remove(String key) 
    {
        int hash = (myhash( key ) % TABLE_SIZE);
        if (table[hash] != null) 
        {
            HashEntry prevEntry = null;
            HashEntry entry = table[hash];
            while (entry.next != null && !entry.key.equals(key)) 
            {
                prevEntry = entry;
                entry = entry.next;
            }
            if (entry.key.equals(key)) 
            {
                if (prevEntry == null)
                    table[hash] = entry.next;
                else
                    prevEntry.next = entry.next;
                size--;
            }
        }
    }
    
    private int myhash(String x )
    {
        int hashVal = x.hashCode( );
        hashVal %= TABLE_SIZE;
        if (hashVal < 0)
            hashVal += TABLE_SIZE;
        return hashVal;
    }
    
    public void printTable()
    {
        for (int i = 0; i < TABLE_SIZE; i++)
        {
            System.out.print("\nBucket "+ (i + 1) +" : ");
            HashEntry entry = table[i];
            while (entry != null)
            {
                System.out.print(entry.value +" ");
                entry = entry.next;
            }            
        }
    }
}

public class ITCO321IP5 {

   
    
    public static void main(String[] args) {
       
        
Scanner scan = new Scanner(System.in);
   System.out.println("Enter size");
   
   HashTable ht = new HashTable(scan.nextInt());
   
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
   

int decision = scan.nextInt();
switch (decision)
{
    case 1:
        System.out.println("Choose a key and a value");
        ht.insert(scan.next(), scan.nextInt());
        break;
    case 2:
        System.out.println("Enter key");
        ht.remove( scan.next());
        break;
    case 3:
        ht.Empty();
        System.out.println("Cleared");
        break; 
    case 4:
        System.out.println("Enter key");
        System.out.println("Value = " + ht.get(scan.next()));
    break;
    
    case 5:
    System.out.println("Size = " + ht.getSize());
    break;
   
    default:
        System.out.println("Invalid entry");
        break;
}
ht.printTable();

System.out.println("Type y to continue, or n to exit");
ch = scan.next().charAt(0);
} while (ch == 'Y'|| ch == 'y');
    
    
    }}


