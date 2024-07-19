import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Emp{

    private int empId;
    private String name;
    private int age;

    public Emp(int empId, String name, int age) {
        this.empId = empId;
        this.name = name;
        this.age = age;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(101,"yashveer",45));
        list.add(new Emp(103,"veer",34));
        list.add(new Emp(102,"abc",45));
        list.add(new Emp(1011,"def",56));
        list.stream().sorted(Comparator.comparing(Emp::getAge, Comparator.reverseOrder()).thenComparing(Emp::getName))
                .forEach(System.out::println);
    }

}