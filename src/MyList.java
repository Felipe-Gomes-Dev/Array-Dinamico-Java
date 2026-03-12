
class MyList{
    int index;
    int[] list;

    public MyList(int index){
        this.index = index;
        this.list = new int[2];
    }
    public void add(int valor){
        list[index] = valor;
    }
    public void remove(){

    }
    public void get(){

    }
    public void set(){

    }
    public Boolean contains(){
        return true;
    }
    public void indexOf(){

    }
    public void toArray(){

    }
    public void print(){
        System.out.println("--inicio lista--");
        for (int i=0; i<list.length;i++){
            System.out.println(list[i]);
        }
        System.out.println("--fim lista--");
    }
}
