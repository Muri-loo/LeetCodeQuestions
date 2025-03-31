import java.util.*;

class Solution {

    //ANAGRAM GROUP EXERCISE
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, ArrayList<String>> anagrams = new HashMap<>();
        for (int i=0; i<strs.length ; i++){
           
            char [] sortedword = strs[i].toCharArray();
            Arrays.sort(sortedword);
            String word = new String(sortedword);

            anagrams.putIfAbsent(word, new ArrayList<>());

            anagrams.get(word).add(strs[i]);
            
        }
        return new ArrayList<>(anagrams.values());
    }   

    //TWO SUM
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i< nums.length ; i++){
            int key = target - nums[i];
            if(map.containsKey(key)){
                return new int[]{map.get(key), i};
            }else{
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No possible target with the given parameters.");
    }


    public ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int FirstNumber, SecondNumber, i=1;
        l1 = reverseLinkedList(l1);
        l2 = reverseLinkedList(l2);
        while (l1 != null) {
            FirstNumber= l1.val*i;
            l1 = l1.next;
            i+=10;
        }
        while (l2 != null) {
            number2.add(l2.val);
            l2 = l2.next;
        }
        return l2;
        
    }

    public static void main(String[] args) {
        
    }
}