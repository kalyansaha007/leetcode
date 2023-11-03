package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ChessPawnMovement {

    public static String movePawn(String startPosition, int rows, int cols){
        String endPosition = "";

        int vEndPos = 0;
        int hEndPos = 0;


        Integer nStartPos = Integer.parseInt(startPosition.substring(0,1));
        String sStartPos = startPosition.substring(1,2);

        List<String> listPosArr = new ArrayList<String>();
        listPosArr.add("a");
        listPosArr.add("b");
        listPosArr.add("c");
        listPosArr.add("d");
        listPosArr.add("e");
        listPosArr.add("f");
        listPosArr.add("g");
        listPosArr.add("h");

        if(8 < rows){
            vEndPos = 8;
        }else{
            vEndPos = nStartPos + rows;
        }

        if(8 < vEndPos){
            vEndPos = 8;
        }

        if(8 < cols){
            hEndPos = 8;
        }else{
            hEndPos = listPosArr.indexOf(sStartPos) + cols;
        }

        if(8 < hEndPos){
            hEndPos = 8;
        }

        endPosition = ""+vEndPos+listPosArr.get(hEndPos-1);

        return endPosition;
    }


    public static void main(String[] args) {

        System.out.println("Case 1:"+ movePawn("5h", 11, 25));
        System.out.println("Case 2:"+ movePawn("2b", 3, 2));
        System.out.println("Case 3:"+ movePawn("4h", 21, 54));
    }
}
