package club.banyuan.demo2;

public class test {
    public static void main(String[] args) {

       Person P = new Person();
        Integer a = Integer.valueOf(11);
        Integer b = Integer.valueOf("12");
        System.out.println(a);
        System.out.println(b);

    }
}

class Person{
    //属性
    private int age;
    String name;
    //构造器
    Person(){}
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    //方法
    public void study(){
        System.out.println("读书");
    }

    public void setAge(int age) {
        if(age>=0&&age<=100){
        this.age = age;
        }else{
            System.out.println("输入数据有误");
        }
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
