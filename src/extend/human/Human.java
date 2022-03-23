package extend.human;

public class Human {
	private String name; // 自分自身の身からアクセス可能
    protected int age; // サブクラスからもアクセス可能

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
