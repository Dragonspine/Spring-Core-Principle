package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.annotation.processing.Generated;

@Getter
@Setter
@ToString
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setName("asdasd");

        System.out.println("helloLombok = " + helloLombok);

        String name = helloLombok.getName();
        System.out.println("name = " + name);
    }
}
