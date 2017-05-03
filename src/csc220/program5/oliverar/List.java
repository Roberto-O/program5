package csc220.program5.oliverar;
import csc220.list.AddIterator;
import csc220.list.Node;

public class List<E> extends csc220.list.List<E> { 
       
   @Override
   public AddIterator<E> addIterator(){return new ListAddIterator<>();}
   
   
   //  This nested class replaces the one in csc220.list.List
   protected class ListAddIterator<T extends E> extends csc220.list.List<E>.ListAddIterator<E> {
        
        protected Node<E> prevNode = null;
        
        @Override
        public E next() {
            prevNode = nextNode;
            return super.next();
        }
        
        @Override 
        public void addBeforeNext(E e) {
            Node<E> tmp = new Node<>();
            tmp.data = e;
            
            if (nextNode != null) {
                if(first.data.equals(nextNode.data)){    // just goes back and forth two points *BUG*
                    first.next = tmp;
                    tmp.next = nextNode;
                }
                else{ //in between
                    prevNode.next = tmp; 
                    tmp.next = nextNode;
                }
            }else{ //last 
                prevNode.next = tmp;
                tmp.next = nextNode;
            }
        }
        
        @Override
        public void remove() { //you need to click in order
            Node<E> tmp = new Node<>();
            tmp = prevNode.next;
            
            if(prevNode == nextNode){
                tmp.next = tmp;
                
            }else if(first == prevNode){
                first = tmp;
            }else if(last == prevNode){
                last = tmp;
            }
        }
     } 
}
