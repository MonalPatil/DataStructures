import java.util.ArrayList;
import java.util.Collections;

/*
 * 
 * Sort a linked list in O(n log n) time using constant space complexity.
 * 
 * Input: 4->2->1->3
 * Output: 1->2->3->4
 */


public class SortLinkedList {
	
	public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	 }
	
	 public ListNode sortList(ListNode head) {
	        
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        
	        ListNode temp = head;
	        
	        while(temp!=null){
	            list.add(temp.val);
	            temp = temp.next;
	            
	        }
	        
	        //list.sort();
	        Collections.sort(list);
	        ListNode currNode = new ListNode(0);
	        ListNode temp1 = currNode;
	        
	        for(int i=0;i<list.size();i++){
	            temp1.next = new ListNode(list.get(i));
	            temp1=temp1.next;
	        }
	        
	        return currNode.next;
	    }

}
