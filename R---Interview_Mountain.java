package com.worksap.company.hue.scm.biz.procurement.service.ordermanagement.ordermanagement.search;

public class Mountain {

    /**
     * 
     * 正の整数Nがあたえられたとき、  N個の山を作るアルゴリズムを書きなさい
        なお、山の高さは1ずつ減ることとする

            N=1 
            /\
            N=2
             /\
            /  \/\
            N=3
              /\
             /  \  /\
            /    \/  \/\
     */

    static final String SPACE = " ";
    static final String UP = "/";
    static final String DOWN = "\\";

    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Argument must be one");
        }
        String heightStr = args[0];
        int height = Integer.parseInt(heightStr);
        int length = 2 * height;
        int upPoint = height;
        int downPoint = height + 1;
        for (int i = 0; i < height; i++) {
            String rowString = "";
            int nextDownPoint = downPoint;
            int nextLength = length;
            for (int j = i; j >= 0; j--) {
                rowString += generateMountain(nextLength, upPoint, nextDownPoint);
                nextDownPoint -= 2;
                nextLength -= 2;
            }
            upPoint--;
            downPoint++;
            System.out.println(rowString);
        }
    }

    private static String generateMountain(int length, int upPoint, int downPoint) {
        String rowString = "";
        for (int j = 1; j <= length; j++) {
            if (j == upPoint) {
                rowString += UP;
            } else if (j == downPoint) {
                rowString += DOWN;
            } else {
                rowString += SPACE;
            }
        }
        return rowString;
    }
}
