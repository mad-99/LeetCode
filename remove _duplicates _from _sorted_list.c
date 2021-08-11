/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* deleteDuplicates(struct ListNode* head){
    struct ListNode **loc = &head;
    if(head != NULL){
	    while((*loc)->next != NULL){
        if ((*loc)->val == ((*loc)->next)->val){
		      *loc = (*loc)->next;
	      }
        else{
            loc = &(*loc)->next; 
        }
        
      }
    }
    return head;
}
