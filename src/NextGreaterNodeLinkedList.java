import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author mpatil
 * 
 * Next Greater Node In Linked List
 * We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.
 * Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val, and j is the smallest possible choice.  If such a j does not exist, the next larger value is 0.
 * Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).
 * Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the serialization of a linked list with a head node value of 2, second node value of 1, and third node value of 5.
 *
 *
 *Input: [2,1,5]
 *Output: [5,5,0]
 *
 *Input: [2,7,4,3,5]
 *Output: [7,0,5,5,0]
 */
public class NextGreaterNodeLinkedList {
	
	public class ListNode{
		int val;
		ListNode next; 
		ListNode(int x){
			val= x;
		}
	}
	
	 public int[] nextLargerNodes(ListNode head) {
	        
	        ListNode temp = head;
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        Stack<Integer> st= new Stack<Integer>();
	        
	        
	        while(temp!=null){
	            list.add(temp.val);
	            temp= temp.next;
	            
	        }
	        
	        int[] result = new int[list.size()];
	        for(int i=0; i<list.size();i++){
	            
	            while(!st.isEmpty() && list.get(st.peek())< list.get(i)){
	                result[st.pop()] = list.get(i);
	                
	            }
	            st.push(i);
	        }
	        return result;
	    }

}
