class BrowserHistory {
    ListNode ls;
    
    public BrowserHistory(String homepage) {
        ls = new ListNode(homepage); 
    }
    
    public void visit(String url) {
        ListNode temp = ls;
        temp.next = new ListNode(url);
        temp=temp.next;
        temp.prev=ls;
        ls=temp;
    }
    
    public String back(int steps) {
       ListNode temp = ls;
       while(temp.prev!=null && steps!=0){
           steps--;
           temp=temp.prev;
       }
       
       ls=temp;
       return ls.val;
    }
    
    public String forward(int steps) {
        ListNode temp = ls;
        while(temp.next!=null && steps!=0){
           steps--;
           temp=temp.next;
       }
       
       ls=temp;
       return ls.val;
    }
}
class ListNode {
     String val;
     ListNode next;
     ListNode prev;
     ListNode() {}
     ListNode(String val) { this.val = val; }
     ListNode(String val, ListNode next) { this.val = val; this.next = next; this.prev=prev;}
 }

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */