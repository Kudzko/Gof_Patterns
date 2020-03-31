package by.kudko.simple;

import lombok.*;

/**
 * https://vertex-academy.com/tutorials/ru/pattern-builder-java/
 */

@Data
@Setter(AccessLevel.NONE)
@NoArgsConstructor
public class A {
    private int id;
    private String name;
    private String surname;

    public static class Builder {
        private A newA;

        public Builder() {
            newA = new A();
        }

        public Builder withId(int id) {
            newA.id = id;
            return this;
        }

        public Builder withName(String name) {
            newA.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            newA.surname = surname;
            return this;
        }

        public A build(){
            return newA;
        }

    }
}
