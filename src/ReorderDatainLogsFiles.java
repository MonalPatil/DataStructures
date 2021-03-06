import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * You have an array of logs.  Each log is a space delimited string of words.
 * For each log, the first word in each log is an alphanumeric identifier.  Then, either:
 * Each word after the identifier will consist only of lower case letters, or;
 * Each word after the identifier will consist only of digits.
 * We will call these two varieties of logs letter-logs and digit-logs.  It is guaranteed that each log has at least one word after its identifier.
 * Reorder the logs so that all of the letter-logs come before any digit-log.  The letter-logs are ordered lexicographically ignoring identifier, with the identifier used in case of ties.  The digit-logs should be put in their original order.
 * Return the final order of the logs.
 * 
 * 
 * Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
 * Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
 * 
 */
public class ReorderDatainLogsFiles {
	public String[] reorderLogFiles(String[] logs) {
        TreeMap<String,String> tmap = new TreeMap<String,String>();
        LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();
        //String[] logarr = logs.split(",");
        String[] outputlogs = new String[logs.length];
        
        for(int i=0; i<logs.length;i++){
            String[] arr = logs[i].split(" ",2);
            char[] chararr =arr[1].toCharArray();
            
            if(Character.isLetter(chararr[0])){
            
                String[] firstarr = logs[i].split(" ",2);
                if(tmap.containsKey(firstarr[1])){
                    tmap.put(logs[i],logs[i]);
                }
                else{
                    tmap.put(firstarr[1],logs[i]);
                }
                
            }
                
            else if(Character.isDigit(chararr[0])){
                lmap.put(i,logs[i]);
            }
            
        }
        int i=0;
        
        for(Map.Entry<String,String> te : tmap.entrySet()){
            outputlogs[i]= te.getValue();
            i++;
            
        }
        
        for(Map.Entry<Integer,String> le: lmap.entrySet()){
            outputlogs[i]= le.getValue();
            i++;
        }
        
        return outputlogs;
        
        
    }

}
