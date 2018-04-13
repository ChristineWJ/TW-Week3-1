package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        if (leftBorder <= rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else if (leftBorder > rightBorder) {
            for (int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sum = 0;
        if (leftBorder <= rightBorder) {
            for (int i = leftBorder; i <= rightBorder; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        } else if (leftBorder > rightBorder) {
            for (int i = rightBorder; i <= leftBorder; i++) {
                if (i % 2 != 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        int sum = 0;
        Iterator<Integer> iter = arrayList.iterator();
        for (int i = 0; i < arrayList.size(); i++) {
            int temp = iter.next() * 3 + 2;
            sum = sum + temp;
        }
        return sum;
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        Iterator<Integer> iter = arrayList.iterator();
        List<Integer> rst = new ArrayList<>();
        int temp = 0;
        while (iter.hasNext()) {
            temp = iter.next();
            if (temp % 2 != 0) {
                rst.add(temp * 3 + 2);
            } else {
                rst.add(temp);
            }
        }
        return rst;
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sum = 0;
        int temp = 0;
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()) {
            temp = iter.next();
            if (temp % 2 != 0) {
                sum = sum + temp * 3 + 5;
            }
        }
        return sum;
    }

    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        double midnum = 0;
        Iterator<Integer> iter = arrayList.iterator();
        List<Integer> rst = new ArrayList<>();
        int temp = 0;
        while (iter.hasNext()) {
            temp = iter.next();
            if (temp % 2 != 0) {
                rst.add(temp);
            }
        }
        int mid = (0 + rst.size()) / 2;
        midnum = rst.get(mid);
        return midnum;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double avg = 0;
        int temp = 0;
        int sum = 0;
        int count = 0;
        Iterator<Integer> iter = arrayList.iterator();
        while (iter.hasNext()) {
            temp = iter.next();
            if (temp % 2 == 0) {
                sum += temp;
                count++;
            }
        }
        avg = sum / count;
        return avg;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        boolean flag = false;
        Iterator<Integer> iter = arrayList.iterator();
        List<Integer> rst = new ArrayList<>();
        int temp;
        while (iter.hasNext()) {
            temp = iter.next();
            if (temp % 2 == 0) {
                rst.add(temp);
            }
        }
        if(rst.contains(specialElment)){
            flag=true;
        }
        return flag;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {

        Set<Integer> testSet = new HashSet<Integer>();
        Iterator<Integer> iter = arrayList.iterator();
        int temp = 0;
        while(iter.hasNext()){
            temp = iter.next();
            if (temp % 2 == 0) {
                testSet.add(temp);
            }
        }
        List<Integer> rst = new ArrayList<>(testSet);
        //rst.addAll(testSet);     //将Set转List
        return rst;
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        List<Integer> even = new ArrayList<>();
        List<Integer> old = new ArrayList<>();
        Iterator<Integer> iter = arrayList.iterator();
        int temp = 0;
        while(iter.hasNext()){
            temp = iter.next();
            if(temp %2==0){
                even.add(temp);
            }else{
                old.add(temp);
            }
        }
        Collections.sort(even);
        Collections.sort(old,Collections.reverseOrder());
        even.addAll(old);
        return even;
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> rst = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            temp = (arrayList.get(i) + arrayList.get(i + 1)) * 3;
            rst.add(temp);
        }
        return rst;
    }
}
