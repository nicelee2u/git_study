package nicelee.demo.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
@Component
@ConfigurationProperties(prefix = "student")
public class student {
    private String name;
    private int age;
    private Map<String,Object> location;
    private List<String> friends;
    private Pet pet;

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

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location=" + location +
                ", friends=" + friends +
                ", pet=" + pet +
                '}';
    }

    public student() {
    }

    public student(String name, int age, Map<String, Object> location, List<String> friends, Pet pet) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.friends = friends;
        this.pet = pet;
    }
}
