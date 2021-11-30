package assignments.assignment10;

public class SList <T>{
    T data;
    SList next;
    public SList(){
        next=null;
    }
    public SList(T data){
        this.data=data;
        next=null;
    }

    public SListIterator iterator(){
        return new SListIterator(next);
    }


    public String toString(){
        return data+"";
    }


}
