package composite;

public class Developer extends EmployeeComponent {

    private String name;

    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println("Имя : " + name);
        System.out.println("Должность : " + position);
    }

}
