package assignments.assignment10;

public class SListIterator {
    SList head;
    public SListIterator(){}
    public SListIterator(SList head){
        this.head=head;
    }

    public void insert(SList list){
            SList temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=list;

    }

    public SList delete(){
        if(head.next==null){
            System.out.println("List is Empty");
            return new SList(-1);
        }else{
            SList temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            SList del_node=temp.next;
            temp.next=null;
            return del_node;
        }
    }

    public void display(){
        if(head.next==null){
            System.out.println("List is Empty");
        }else{
            System.out.println("List Elements Are :: ");
            SList temp=head.next;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

}
