package Algorithms.Implementation.Implementation8;

import java.util.*;

import static java.util.stream.Collectors.toList;

/**
 * Implementation: Migratory Birds
 */
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }

        System.out.println(migratoryBirds(n, ar));
    }

    static int migratoryBirds(int n, int[] ar) {

        Bird bird1 = new Bird(1, 0);
        Bird bird2 = new Bird(2, 0);
        Bird bird3 = new Bird(3, 0);
        Bird bird4 = new Bird(4, 0);
        Bird bird5 = new Bird(5, 0);

        for (int i = 0; i < n; i++) {
            switch (ar[i]){
                case 1:
                    bird1.setNumber(bird1.getNumber() + 1);
                    break;
                case 2:
                    bird2.setNumber(bird2.getNumber() + 1);
                    break;
                case 3:
                    bird3.setNumber(bird3.getNumber() + 1);
                    break;
                case 4:
                    bird4.setNumber(bird4.getNumber() + 1);
                    break;
                case 5:
                    bird5.setNumber(bird5.getNumber() + 1);
                    break;
            }
        }

        List<Bird> birds = Arrays.asList(bird1, bird2, bird3, bird4, bird5);

        Comparator<Bird> isMore = (a, b) -> {

            if (a.getNumber() > b.getNumber())
                return 1;
            else if (a.getNumber() < b.getNumber())
                return -1;
            else {
                return 0;
            }


        };

        birds = birds.stream().sorted(isMore.reversed()).collect(toList());

        return birds.get(0).getType();
    }
}
