package composite;

public abstract class EmployeeComponent {

    public void print(){
        throw new UnsupportedOperationException();
    }

    public void sleep(){
        throw new UnsupportedOperationException();
    }

    public void addChild(EmployeeComponent e){
        throw new UnsupportedOperationException();
    }

    public void removeChild(int index){
        throw new UnsupportedOperationException();
    }
}
