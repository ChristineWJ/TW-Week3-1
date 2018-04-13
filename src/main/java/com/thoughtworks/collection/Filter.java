package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Filter {

    List<Integer> array;

    public Filter(List<Integer> array) {
        this.array = array;
    }

    public List<Integer> filterEven() {
        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                rst.add(array.get(i));
            }
        }
        return rst;
    }

    public List<Integer> filterMultipleOfThree() {
        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i <array.size() ; i++) {
            if(array.get(i)%3==0){
                rst.add(array.get(i));
            }
        }
        return rst;
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i <firstList.size() ; i++) {
            if(secondList.contains(firstList.get(i))){
                rst.add(firstList.get(i));
            }
        }
        return rst;
    }

    public List<Integer> getDifferentElements() {
        Set<Integer> testset = new HashSet<>(array);
        List<Integer> rst = new ArrayList<>();
        rst.addAll(testset);
        return rst;
    }
}