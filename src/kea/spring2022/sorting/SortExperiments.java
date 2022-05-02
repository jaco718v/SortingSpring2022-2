package kea.spring2022.sorting;

import java.util.Arrays;

public class SortExperiments {
    public static void main(String[] args) {
        SortExperiments app = new SortExperiments();
        //app.sort1();
        //app.sort2();
        //app.sortBalls1();
        //app.sort3();
        //app.sort4();
        //app.sortBalls2();
        //app.sortBalls3();

        //app.sortPersons1();
        //app.sortPersons2();

        app.sortBalls4();
    }

    public void sort1() {
        int[] tal = {4,9,2,5,8,7,2,1};

        System.out.println("Før sortering "+ Arrays.toString(tal));
        Arrays.sort(tal);
        System.out.println("Efter sortering "+ Arrays.toString(tal));
    }
    public void sort2() {
       String[] ord = {"Kage", "ost", "Franskbrød", "citronmåne", "Crumble", "juice","Cola"};
        System.out.println("Før sortering "+ Arrays.toString(ord));
        Arrays.sort(ord);
        System.out.println("Efter sortering "+ Arrays.toString(ord));
    }

    public void sortBalls1() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }
        System.out.println("Før sortering " + Arrays.toString(ballsarray));

        System.out.println("Efter sortering " + Arrays.toString(ballsarray));

    }

    public void sort3() {
        int[] tal = {4,9,2,5,8,7,2,1};

        System.out.println("Før sortering "+ Arrays.toString(tal));
        QuickSort qs = new QuickSort();
        qs.sort(tal);
        System.out.println("Efter sortering "+ Arrays.toString(tal));

    }

    public void sort4() {
        String[] ord = {"Kage", "Ost", "Franskbrød", "Citronmåne", "Crumble", "Juice","Cola"};

        System.out.println("Før sortering "+ Arrays.toString(ord));
        QuicksortString qs = new QuicksortString();
        qs.sort(ord);
        System.out.println("Efter sortering "+ Arrays.toString(ord));
    }

    public void sortBalls2() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }
        System.out.println("Før sortering "+ Arrays.toString(ballsarray));
        QuicksortBalls qs = new QuicksortBalls();
        qs.sort(ballsarray);
        System.out.println("Efter sortering "+ Arrays.toString(ballsarray));


    }

    public void sortBalls3() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }
        QuickSortSammenlignbar qs = new QuickSortSammenlignbar();
        System.out.println("Før sortering "+ Arrays.toString(ballsarray));
        qs.sort(ballsarray);
        System.out.println("Efter sortering "+ Arrays.toString(ballsarray));

    }

    public void sortPersons1() {
        Person[] arr = new Person[6];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");
        arr[3] = new Person("Parry", "Hotter");
        arr[4] = new Person("Won", "Reasley");
        arr[5] = new Person("Germione", "Hranger");

        QuickSortSammenlignbar qs = new QuickSortSammenlignbar();
        System.out.println("Før sortering: " + Arrays.toString(arr));
        qs.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortPersons2() {
        Person[] arr = new Person[6];
        arr[0] = new Person("Hermione", "Granger");
        arr[1] = new Person("Ron", "Weasley");
        arr[2] = new Person("Harry", "Potter");
        arr[3] = new Person("Parry", "Hotter");
        arr[4] = new Person("Won", "Reasley");
        arr[5] = new Person("Germione", "Hranger");

        System.out.println("Før sortering: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Efter sortering: " + Arrays.toString(arr));

    }

    public void sortBalls4() {
        // Opret array af Ball objekter (med tilfældig brightness)
        Ball[] ballsarray = new Ball[8];
        for(int i=0; i < ballsarray.length; i++) {
            ballsarray[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(ballsarray));
        Arrays.sort(ballsarray);
        System.out.println("Efter sortering: " + Arrays.toString(ballsarray));

    }


}
