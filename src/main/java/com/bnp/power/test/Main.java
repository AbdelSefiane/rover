package com.bnp.power.test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(Files.newBufferedReader(Paths.get(args[0])));
        int w = sc.nextInt() + 1;
        int h = sc.nextInt() + 1;

        PlateauTopology topology = new PlateauTopology(w, h);

        if (sc.hasNextLine()) {
            sc.nextLine();
        }

        while (sc.hasNextLine()) {
            Rover r = new Rover(sc.nextLine());
            int previousX=r.x;
            int previousY=r.y;
            r.setPlateauTopology(topology);
            String instructions = sc.nextLine();
            for (String s : instructions.split("")) {
                if ("L".equals(s) || "R".equals(s)) {
                    r.spin(s);
                } else {
                    r.move();
                }
            }
            System.out.println(r.x + " " + r.y + " " + r.direction.label);
        }
    }

}
