import java.io.IOException;
import java.util.*;

public class BankQueue {  

    private Integer smsNumber;

    public BankQueue(int smsNumber) {
        this.smsNumber = smsNumber;
    }

    public int getSmsNumber() {
        return this.smsNumber;
    }
  
  public static void main(String[] args) throws IOException {
    
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    scanner.nextLine();
    int peopleOnQueue;
    ArrayList<Integer> currentQueue = new ArrayList<>();
    HashMap<Integer, Integer> numToIndexOriginal = new HashMap<>();
    int currentSmsNumber;
    int numSwitches;

    for(int i = 0; i < N; i++) {
      
        peopleOnQueue = scanner.nextInt();
        numSwitches = 0;

        for(int j = 0; j < peopleOnQueue; j++) {
        
            currentSmsNumber = scanner.nextInt();
            currentQueue.add(currentSmsNumber);
            numToIndexOriginal.put(currentSmsNumber, currentQueue.size() - 1);
      
        }

      
        SmsNumberComparator comparator = new SmsNumberComparator();
        Collections.sort(currentQueue, comparator);


      
        for(int j = 0; j < currentQueue.size(); j++) {
        
            int originalIndex = numToIndexOriginal.get(currentQueue.get(j));
        
        
            if(originalIndex != j) {
          
                numSwitches++;
        
            }
      
        }

        System.out.println(peopleOnQueue - numSwitches);
        currentQueue = new ArrayList<>();
    
    }
    
    scanner.close();
  
}

static class SmsNumberComparator implements Comparator<Integer> {

    public SmsNumberComparator() {}

    @Override
    public int compare(Integer num0, Integer num1) {
      
        int res = num0.compareTo(num1);
        return -res;
    
    }
  
}
}