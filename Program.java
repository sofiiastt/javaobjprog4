public class Program
{ public static void main(String[] args) {
     Account<String> acc1 = new Account<String>("11", 24); 
     String acc1Id = acc1.getId(); 
     System.out.println(acc1Id); 
      Account<Integer> acc2 = new Account<Integer>(11, 24);
       Integer acc2Id = acc2.getId(); System.out.println(acc2Id); 
    } 
} 
class Account<T>{ private T id; private int sum; 
    Account(T id, int sum){ this.id = id; this.sum = sum; 
    } 
    public T getId()
     { return id; } 
     public int getSum()
      { return sum; } 
     public void setSum(int sum)
      { this.sum = sum; 

        Integer integerElement = 11;
        String stringElement = "Hello";
        Double doubleElement = 3.14;

        printElement(integerElement);
        printElement(stringElement);
        printElement(doubleElement);
    }
    private void printElement(Double doubleElement) {
    }
    private void printElement(Integer integerElement) {
    }
    private void printElement(String stringElement) {
    }
}
    