package com.vnk.LeetCode;
class ListNode {
	 int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class MergeToSortedList {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null||list2==null) {
        	return (list1==null?list2:list1);
        }
        if(list1.val>list2.val) {
        	ListNode list=list1;
        	list1=list2;
        	list2=list;
        }
        list1.next=mergeTwoLists(list1.next, list2);
        return list1;
    }
	public static void main(String[] args) {
		System.out.println(new MergeToSortedList().mergeTwoLists(null, null));
	}
}