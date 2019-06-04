
package com.company;

public class Arrays {


    public static void main(String args[]) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        System.out.println(total(arr));
        System.out.println(totalOdd(arr));
        System.out.println(totalEven(arr));


        String[] strarr = {"foo", "bar", "baz", "qux"};
        String[] newstrarr = swapFirstAndLast(strarr);
        for (String element : newstrarr) {
            System.out.println(element);
        }


        int[] Arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] res = reverse(Arr);
        for (int ele : res) {
            System.out.println(ele);
        }


        String[] strArr = {"foo", "bar", "baz"};
        System.out.println(concatenateString(strArr));

        int[] Arr1 = {0, 1, 2, 3, 4, 5, 6, 7};

        int[] everythree = everyThird(Arr1);

        for (int i : everythree) {
            System.out.println(i);
        }


        int[] Arr2 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] res1 = lessThanFive(Arr2);
        for (int i : res1) {
            System.out.println(i);
        }

        int[] Arr3 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[][] res2 = splitAtFive(Arr3);
        for (int[] i : res2) {
            for (int j : i) {
                System.out.println(j);
            }
        }


        int[] Arr4 = {0, 1, 2, 3, 4, 5, 6, 7};
        int[][] res3 = evensAndOdds(Arr3);
        for (int[] i : res3) {
            for (int j : i) {
                System.out.println(j);
            }
        }

    }

    public static int total(int[] myarray) {
        int total = 0;
        for (int i = 0; i < myarray.length; i++) {
            total += myarray[i];
        }
        return total;
    }

    public static int totalOdd(int[] myarray) {
        int total = 0;
        for (int i = 0; i < myarray.length; i++) {
            if (i % 2 != 0) {
                total += myarray[i];
            }
        }
        return total;
    }

    public static int totalEven(int[] myarray) {
        int total = 0;
        for (int i = 0; i < myarray.length; i++) {
            if (i % 2 == 0) {
                total += myarray[i];
            }
        }
        return total;
    }

    public static String[] swapFirstAndLast(String[] myarray) {
        String first = myarray[0];
        myarray[0] = myarray[myarray.length - 1];
        myarray[myarray.length - 1] = first;
        return myarray;

    }

    public static int[] reverse(int[] myarray) {
        for (int i = 0, j = myarray.length - 1; i < myarray.length && j >= 0 && i < j; i++, j--) {
            int tmp = myarray[i];
            myarray[i] = myarray[j];
            myarray[j] = tmp;
        }
        return myarray;
    }

    public static String concatenateString(String[] myarray) {
        String mystr = "";
        for (int i = 0; i < myarray.length; i++) {
            mystr += myarray[i];
        }
        return mystr;
    }

    public static int[] everyThird(int[] myarray) {
        if (myarray.length < 3) {
            return null;
        } else {
            int[] arr = new int[myarray.length / 3];
            for (int i = 2, j = 0; i < myarray.length && j < arr.length; i += 3, j++) {
                arr[j] = myarray[i];
                // if the code does not work, please put j++ here instead of it being in the for loop.
            }
            return arr;
        }


    }

    public static int[] lessThanFive(int[] myarray) {
        int count = 0;
        for (int i : myarray) {
            if (i < 5) {
                count++;
            }
        }
        if (count == 0) {
            return null;
        } else {
            int[] res = new int[count];
            for (int i = 0, j = 0; i < myarray.length && j < res.length; i++, j++) {
                if (myarray[i] < 5) {
                    res[j] = myarray[i];
                    // if the code does not work, please put j++ here instead of it being in the for loop.
                }
            }
            return res;
        }

    }

    public static int[][] splitAtFive(int[] myarray) {
        int less5 = 0, great5 = 0;

        for (int i : myarray) {
            if (i < 5) {
                less5 += 1;


            } else {
                great5 += 1;
            }
        }

        int[] l5 = new int[less5];
        int[] g5 = new int[great5];
        for (int i = 0, j = 0, k = 0; i < myarray.length && (j < l5.length || k < g5.length); i++) {
            if (myarray[i] < 5) {
                l5[j] = myarray[i];
                j++;

            } else {
                g5[k] = myarray[i];
                k++;

            }
        }

        int[][] myres = {l5, g5};


        return myres;
    }


    public static int[][] evensAndOdds(int[] myarray) {
        int even = 0, odd = 0;

        for (int i = 0; i < myarray.length; i++) {
            if (i % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        int[] eve = new int[even];
        int[] od = new int[odd];
        for (int i = 0, j = 0, k = 0; i < myarray.length && (j < eve.length || k < od.length); i++) {
            if (i % 2 == 0) {
                eve[j] = myarray[i];
                j++;

            } else {
                od[k] = myarray[i];
                k++;

            }
        }

        int[][] myres = {eve, od};


        return myres;
    }

}
