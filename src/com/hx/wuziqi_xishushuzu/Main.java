package com.hx.wuziqi_xishushuzu;

/**
 * Created by Zhanghongxin on 2020/7/12.
 */
public class Main {

    public static void main(String[] args) {

        int[][] qipan = new int[11][11];
        qipan[2][3]   = 5;
        qipan[5][6] = 2;
        qipan[7][8] = 10;

        System.out.println("五子棋棋盘如下：");

        int length = 0;
        for (int[] ints : qipan) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
                if (anInt!=0){
                    length++;
                }

            }
            System.out.println();
        }

        System.out.println(length);

        int[][] xishu = new int[length+1][3];
        xishu[0][0] = 11;
        xishu[0][1] = 11;
        xishu[0][2] = length;

        int sum = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (qipan[i][j]!=0){
                    xishu[sum][0] = i;
                    xishu[sum][1] = j;
                    xishu[sum][2] = qipan[i][j];
                    sum++;
                }
            }
        }
        System.out.println("稀疏数组如下:");
        for (int[] ints : xishu) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println( );
        }

        System.out.println("对稀疏数组进行恢复");

        int[][] xinqipan = new int[xishu[0][0]][xishu[0][1]];
        for (int i = 1;i<=xishu[0][2];i++){
            xinqipan[xishu[i][0]][xishu[i][1]] = xishu[i][2];
        }
        System.out.println("新五子棋盘如下：");
        for (int[] ints : xinqipan) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();

        }

    }
}
