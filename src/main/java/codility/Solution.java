package codility;

import codility.interviews.ArrayToRangesString;
import codility.lessons.lesson4.MaxCounters;
import codility.lessons.lesson4.MissingInteger;
import codility.lessons.lesson4.PermCheck;
import codility.lessons.lesson5.CountDiv;
import codility.lessons.lesson5.GenomicRangeQuery;
import codility.lessons.lesson5.MinAvgTwoSlice;
import codility.lessons.lesson5.PassingCars;
import codility.lessons.lesson6.Distinct;
import codility.lessons.lesson6.MaxProductOfThree;
import codility.lessons.lesson6.Triangle;

import java.util.Arrays;

class Solution {
    public static void main(String[] arg) {

        System.out.println(PermCheck.solution(new int[]{4, 1, 3, 2}));
        System.out.println(PermCheck.solution(new int[]{4, 1, 3}));
        System.out.println(PermCheck.solution(new int[]{1, 4, 1}));

        System.out.println(Arrays.toString(MaxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));

        System.out.println(MissingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(MissingInteger.solution(new int[]{4, 5, 6, 2}));
        System.out.println(MissingInteger.solution(new int[]{1, 2, 3}));
        System.out.println(MissingInteger.solution(new int[]{-1, -2, -3}));
        System.out.println(MissingInteger.solution(new int[]{0, 0, 2}));
        System.out.println(MissingInteger.solution(new int[]{10, 30, 60, 40, 10, 20}));

        System.out.println(PassingCars.solution(new int[]{0, 1, 0, 1, 1}));

        System.out.println(Arrays.toString(GenomicRangeQuery.solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(GenomicRangeQuery.solution("AC", new int[]{0, 0, 1}, new int[]{0, 1, 1})));

        System.out.println(MinAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8}));//1
        System.out.println(MinAvgTwoSlice.solution(new int[]{8, 0, 0, 8}));//1
        System.out.println(MinAvgTwoSlice.solution(new int[]{4,-10,5,10,-5,8}));//0
        System.out.println(MinAvgTwoSlice.solution(new int[]{-3, -5, -8, -4, -10}));//2

        System.out.println(CountDiv.solution(6, 11, 2));//3
        System.out.println(CountDiv.solution(11, 345, 17));//20
        System.out.println(CountDiv.solution(0, 0, 11));//0
        System.out.println(CountDiv.solution(1, 1, 11));//0
        System.out.println(CountDiv.solution(10, 10, 5));//1
        System.out.println(CountDiv.solution(10, 10, 7));//0
        System.out.println(CountDiv.solution(10, 10, 20));//0

        System.out.println(Distinct.solution(new int[]{2, 1, 1, 2, 3, 1}));//3

        System.out.println(Triangle.solution(new int[]{10, 2, 5, 1, 8, 20}));//1
        System.out.println(Triangle.solution(new int[]{10, 50, 5, 1}));//0
        System.out.println(Triangle.solution(new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE}));//0

        System.out.println(MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));//60

        System.out.println(ArrayToRangesString.solution(new int[]{1}));//0
        System.out.println(ArrayToRangesString.solution(new int[]{1, 4}));//0
        System.out.println(ArrayToRangesString.solution(new int[]{1, 0}));//0
        System.out.println(ArrayToRangesString.solution(new int[]{1, 2, 3}));//0
        System.out.println(ArrayToRangesString.solution(new int[]{1, 2, 3, 5, 6}));//0
        System.out.println(ArrayToRangesString.solution(new int[]{1, 4, 5, 2, 3, 9, 8, 11, 0}));//0
    }
}