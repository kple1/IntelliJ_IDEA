package io.leeple;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] data;
        String N = bf.readLine();
        String init = bf.readLine();

        int max = -1000000;
        int min = 1000000;

        data = Arrays.stream(init.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < Integer.parseInt(N); i++) {
            if (data[i] > max) max = data[i];
            if (data[i] < min) min = data[i];
        }
        bw.write(min + " " + max);
        bw.close();
    }
}