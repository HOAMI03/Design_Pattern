public class HTLList implements ListInterface{

    private ListNode root;
    private int size;

    @Override
    public void add(int value) {
        if(this.root == null){
            this.root = new ListNode(value);
            this.size++;
            return;
        }

        ListNode pointer = root;

        while(pointer.getNext()!= null ){
            pointer = pointer.getNext();
        }

        pointer.setNext(new ListNode(value));
        this.size++;
    }

    @Override
    public boolean remove(int value) {
        ListNode pointer = root;
        if(pointer.getValue() == value) {
            this.root = pointer.getNext();
            this.size--;
            return true;
        }

        for(int i = 0; i < this.size; i++){
            if(pointer.getNext() == null) return false;
            else if(pointer.getNext().getValue() == value){
                pointer.setNext(pointer.getNext().getNext());
                break;
            }
            pointer = pointer.getNext();
        }
        this.size--;
        return true;
    }

    @Override
    public int get(int index) {
        ListNode pointer = this.root;
        for (int i = 0; i < index; i++) {
            pointer = pointer.getNext();
        }
        return pointer.getValue();    }

    @Override
    public boolean removeAt(int index) {
        if(index >= this.size || index < 0) {
            return false;
        }

        ListNode pointer = root;

        for(int i = 0; i < index-1; i++){
            pointer = pointer.getNext();
        }

        pointer.setNext(pointer.getNext().getNext());

        this.size--;
        return true;
    }

    @Override
    public boolean contains(int value) {
        ListNode pointer = this.root;

        for(int i = 0; i < this.size; i++){
            if(pointer.getValue() == value){
                return true;
            }
            pointer = pointer.getNext();
        }

        return false;
    }

    public void peek(){
        System.out.println("Size: " + size);
    }
}
