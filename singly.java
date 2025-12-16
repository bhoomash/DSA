import java.util.*;
class Node{
    int val;
    Node next;
    
    Node(int val){
        this.val=val;
        this.next=null;
    }
}
public class singly{
     static class Single{
        Node head;
        void insertatend(int val){
            Node nn=new Node(val);
            if(head==null){
                head=nn;
                return;
            }
            Node t=head;
            while(t.next!=null){
                t=t.next;
            }
            t.next=nn;
        }
        void insertatbegin(int val){
            Node nn=new Node(val);
            nn.next=head;
            head=nn;
        }
        void insertatposition(int val,int pos){
            Node nn=new Node(val);
            if(pos==1){
                nn.next=head;
                head=nn;
                return;
            }
            Node t=head;
            for(int k=1;k<pos-1 && t!=null;k++){
                t=t.next;
            }
            if(t==null){
                System.out.print("Invalid position");
                return;
            }
            nn.next=t.next;
            t.next=nn;
        }
        void search(int key){
            Node t=head;
            int p=0;
            while(t!=null){
                if(t.val==key){
                    System.out.println("Key was found on the index "+p);
                    return;
                }
                t=t.next;
                p++;
            }
            System.out.println("Key was not found");
            return;
        }
        void deleteatbegin(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            head=head.next;
        }
        void deleteatend(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
            // if(head.next == null){
            // head = null;
            // return;
            // }
            Node t=head;
            while(t.next.next!=null){
                t=t.next;
            }
            t.next=null;
        }
        void display(){
            Node t=head;
            while(t!=null){
                System.out.print(t.val+" -> ");
                t=t.next;
                }
            System.out.print("null");
        }
    }
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Single l=new Single();
        for(int i=0;i<n;i++){
            l.insertatend(in.nextInt());
        }
        // int pos=in.nextInt();
        // int val=in.nextInt();
        // l.insertatposition(val,pos);
        
        // int key=in.nextInt();
        // l.search(key);
        
        // l.deleteatbegin();
        
        // l.deleteatend();

        l.display();
        in.close();
    }
}