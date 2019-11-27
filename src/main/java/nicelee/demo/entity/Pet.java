package nicelee.demo.entity;

public class Pet {
    private String name;
    private String nickName;

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
