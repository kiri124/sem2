package practica;
public class persona {
    private int age;
private String name;

public persona()
{
System.out.println("persona()");
age = 0;
name = "ninguno";

}
public persona(int ageInput) {
    age = ageInput;
    name = "ninguno";
    }
    public persona(String nameInput) {
    age = 0;
    name = nameInput;
    }
    public persona(int ageInput, String nameInput) {
    age = ageInput;
    name = nameInput;
    }

public void setAge(int age) {
    this.age = age;
}

public void setName(String name) {
    this.name = name;
}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}