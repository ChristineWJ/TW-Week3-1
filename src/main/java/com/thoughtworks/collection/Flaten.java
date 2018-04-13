package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Flaten {

    Integer[][] array;
    public Flaten(Integer[][] array) {
        this.array = array;
    }

    public List<Integer> transformToOneDimesional() {
        List<Integer> rst = new ArrayList<>();
        for (Integer[] integer:array
             ) {
            for (int i:integer
                 ) {
                rst.add(i);
            }

        }
        return rst;
    }

    public List<Integer> transformToUnrepeatedOneDimesional() {
        Set<Integer> getset = new HashSet<>();
        for (Integer[] integer:array
             ) {
            for (int i:integer
                 ) {
                getset.add(i);
            }
        }
        System.out.println(getset);
        List<Integer> rst  =new ArrayList<>(getset);
        return rst;
    }
}
