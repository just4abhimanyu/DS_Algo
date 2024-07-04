package com.av;

import java.util.ArrayList;
import java.util.List;

public final class ImmutaleObj {

    private final String name;
    private final Integer age;
    private final List<String>  list;

    public ImmutaleObj(String name , Integer age , List<String> nList) {
        this.name = name;
        this.age = age;
        this.list = nList;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getList() {
        return new ArrayList<>(list);
    }


}
