package max.garcia.appminhaideia.model;

//class Pojo
public class Client {

    //attributes
    private  String name;
    private  String email;
    private  String phone;
    private  int age;
    private  boolean sex;

    // data types:  primitive and not primitive

    //constructor
    public Client(String name, String email, String phone, int age, boolean sex) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
