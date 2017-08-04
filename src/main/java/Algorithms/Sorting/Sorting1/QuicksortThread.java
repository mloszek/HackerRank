package Algorithms.Sorting.Sorting1;


import java.util.List;

public class QuicksortThread extends Thread {

    List<String> tab;

    public List<String> getTab() {
        return tab;
    }


    public QuicksortThread(List<String> tab) {

        this.tab = tab;
    }

    @Override
    public void run() {
        quickSort(0, tab.size() - 1, tab);
    }

    private static void quickSort(int x, int y, List<String> table) {
        int i, j;
        String temp;
        String pivotValue = table.get((x + y) / 2);
        i = x;
        j = y;
        do {
            while (!isBigger(table.get(i), pivotValue)) {
                i++;
            }
            while (!isBigger(pivotValue, table.get(j))) {
                j--;
            }
            if (i <= j) {
                temp = table.get(i);
                table.set(i, table.get(j));
                table.set(j, temp);

                i++;
                j--;
            }
        } while (i <= j);
        if (x < j)
            quickSort(x, j, table);
        if (i < y)
            quickSort(i, y, table);
    }

    public static boolean isBigger(String a, String b){

        if (a.length() > b.length())
            return true;
        else if (a.length() < b.length())
            return false;
        else {
            for (int i = 0; i < a.length(); i++) {
                if (Integer.parseInt(String.valueOf(a.charAt(i))) < Integer.parseInt(String.valueOf(b.charAt(i)))) {
                    return false;
                }
            }
        }
        return true;
    }
}
