package model;

/**
 * @author edward
 * @date 2022-06-23
 */
public class Student {

    private String name;
    private Integer age;
    private String gender;
    private String idNum;

    public Student(String name, Integer age, String gender, String idNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
}
