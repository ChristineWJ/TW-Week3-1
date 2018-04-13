package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import javax.lang.model.type.IntersectionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> rst = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                rst.add(i);
            }
        } else if (left > right) {
            for (int i = left; i >= right; i--) {
                rst.add(i);
            }
        }
        return rst;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> rst = new ArrayList<>();
        if (left < right) {
            for (int i = left; i <= right; i++) {
                if (i % 2 == 0) {
                    rst.add(i);
                }
            }
        } else if (left > right) {
            for (int i = left; i >= right; i--) {
                if (i % 2 == 0) {
                    rst.add(i);
                }
            }
        }
        return rst;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> rst = new ArrayList<>();
        for (int x : array
                ) {
            if (x % 2 == 0) {
                rst.add(x);
            }
        }
        return rst;
    }

    public int popLastElment(int[] array) {
        int last = 0;
        int cur = array.length - 1;
        last = array[cur];
        return last;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        List<Integer> rst = new ArrayList<>();
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    rst.add(firstArray[i]);
                }
            }
        }
        return rst;
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        List<Integer> rst = new ArrayList<>();
        rst = Arrays.asList(firstArray);
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] == secondArray[j]) {
                    break;
                } else {
                    count++;
                }
            }
            if (count == secondArray.length) {
                rst.add(firstArray[i]);
            }
        }
        return rst;
    }
}
