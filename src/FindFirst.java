import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirst {
    public static void main(String args[]) {
        String[] E1 = {"T1", "E2"}; // E prime == E2
        String[] E2 = {"+", "T1", "R"};
        String[] E3 = {"#"}; // # epsilon
        String[] T1 = {"F1", "T2"}; // T prime = T2
        String[] T2 = {"*", "F1", "T2"};
        String[] T3 = {"#"};// # epsilon
        String[] F1 = {"(", "E1", ")"};
        String[] F2 = {"id"};
        String[] ar = {"R2", "Z2", "F2"};
        String[] ar2 = {"E1", "E2", "E3", "T1", "T2", "T3", "F1", "F2"};
        //find the first of E, E prime(R), T , T prime(Z) , E




        findTheFirstOfE1(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfE2(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfE3(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfT1(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfT2(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfT3(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfF1(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
        findTheFirstOfF2(E1, E2, E3, T1, T2, T3, F1, F2, ar, ar2);
    }

    private static void findTheFirstOfF2(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {
    }

    private static void findTheFirstOfF1(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {


        ArrayList<String> first_F = new ArrayList<>();
        String[] noTerminal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", ",", "(", ")", "="};
        String temp, temp2, t1, t2;
        temp = String.valueOf(F1[0]);
        for (int i = 0; i < arr2.length; i++) {
            if (temp.equals(arr2[i])) {
                if (arr2[i].equals("E1")) {

                }
                if (arr2[i].equals("E2")) {

                }
                if (arr2[i].equals("E3")) {

                }
                if (arr2[i].equals("T1")) {
                }
            }
            if (arr2[i].equals("T2")) {

            }
            if (arr2[i].equals("T3")) {

            }
            if (arr2[i].equals("F1")) {
                String f1m;
                f1m = String.valueOf(F1[0]);

                for (int pp = 0; pp < arr2.length; pp++) {
                    if (f1m.equals(arr2[pp])) {

                    } else {
                        first_F.add(f1m);

                    }

                }
                String f2m;
                f2m = String.valueOf(F2[0]);
                for (int ppp = 0; ppp < arr2.length; ppp++) {
                    if (f2m.equals(arr2[ppp])) {

                    } else {
                        first_F.add(f2m);

                    }

                }


            }
            if (arr2[i].equals("F2")) {

            }
            else {

                String e3;
                e3 = F2[0];
                first_F.add(temp);
                first_F.add(e3);

            }


        }

        System.out.println("Frist of F");
        Set<String> s = new LinkedHashSet<String>(first_F);
        System.out.println(s);




    }

    private static void findTheFirstOfT3(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {

    }

    private static void findTheFirstOfT2(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {

        ArrayList<String> first_T_prime = new ArrayList<>();
        String[] noTerminal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", ",", "(", ")", "="};
        String temp, temp2, t1, t2;
        temp = String.valueOf(T2[0]);
        for (int i = 0; i < arr2.length; i++) {
            if (temp.equals(arr2[i])) {
                if (arr2[i].equals("E1")) {

                }
                if (arr2[i].equals("E2")) {

                }
                if (arr2[i].equals("E3")) {

                }
                if (arr2[i].equals("T1")) {
                }
            }
            if (arr2[i].equals("T2")) {

            }
            if (arr2[i].equals("T3")) {

            }
            if (arr2[i].equals("F1")) {



            }
            if (arr2[i].equals("F2")) {

            }
            else {

                String e3;
                e3 = T3[0];
                first_T_prime.add(temp);
                first_T_prime.add(e3);

            }


        }

        System.out.println("Frist of T prime");
        Set<String> s = new LinkedHashSet<String>(first_T_prime);
        System.out.println(s);





    }

    private static void findTheFirstOfT1(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {


        ArrayList<String> first_T = new ArrayList<>();
        String[] noTerminal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", ",", "(", ")", "="};
        String temp, temp2, t1, t2;
        temp = String.valueOf(T1[0]);
        for (int i = 0; i < arr2.length; i++) {
            if (temp.equals(arr2[i])) {
                if (arr2[i].equals("E1")) {

                }
                if (arr2[i].equals("E2")) {

                }
                if (arr2[i].equals("E3")) {

                }
                if (arr2[i].equals("T1")) {
                    }
            }
            if (arr2[i].equals("T2")) {

            }
            if (arr2[i].equals("T3")) {

            }
            if (arr2[i].equals("F1")) {
                String f1m;
                f1m = String.valueOf(F1[0]);

                for (int pp = 0; pp < arr2.length; pp++) {
                    if (f1m.equals(arr2[pp])) {

                    } else {
                        first_T.add(f1m);

                    }

                }
                String f2m;
                f2m = String.valueOf(F2[0]);
                for (int ppp = 0; ppp < arr2.length; ppp++) {
                    if (f2m.equals(arr2[ppp])) {

                    } else {
                        first_T.add(f2m);

                    }

                }


            } else if (arr2[i].equals("F2")) {

            }

        }

        System.out.println("Frist of T");
        Set<String> s = new LinkedHashSet<String>(first_T);
        System.out.println(s);


    }

    private static void findTheFirstOfE3(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {

    }

    private static void findTheFirstOfE2(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {

        ArrayList<String> first_E_prime = new ArrayList<>();
        String[] noTerminal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", ",", "(", ")", "="};
        String temp, temp2, t1, t2;
        temp = String.valueOf(E2[0]);
        for (int i = 0; i < arr2.length; i++) {
            if (temp.equals(arr2[i])) {
                if (arr2[i].equals("E1")) {

                } else if (arr2[i].equals("E2")) {

                } else if (arr2[i].equals("E3")) {

                } else if (arr2[i].equals("T1")) {
                    String t1m, t2m;
                    t1m = String.valueOf(T1[0]);
                    for (int p = 0; p < arr2.length; p++) {
                        if (t1m.equals(arr2[p])) {
                            if (arr2[p].equals("E1")) {

                            } else if (arr2[p].equals("E2")) {

                            } else if (arr2[p].equals("E3")) {

                            } else if (arr2[p].equals("T1")) {

                            } else if (arr2[p].equals("T2")) {

                            } else if (arr2[p].equals("T3")) {

                            } else if (arr2[p].equals("F1")) {
                                String f1m;
                                f1m = String.valueOf(F1[0]);
                                for (int pp = 0; pp < arr2.length; pp++) {
                                    if (f1m.equals(arr2[pp])) {

                                    } else {
                                        first_E_prime.add(f1m);

                                    }

                                }
                                String f2m;
                                f2m = String.valueOf(F2[0]);

                                for (int ppp = 0; ppp < arr2.length; ppp++) {
                                    if (f2m.equals(arr2[ppp])) {

                                    } else {
                                        first_E_prime.add(f2m);

                                    }

                                }
                            }

                        } else if (arr2[i].equals("F2")) {


                        } else {


                        }
                    }

                }

            } else if (arr2[i].equals("T2")) {

            } else if (arr2[i].equals("T3")) {

            } else if (arr2[i].equals("F1")) {

            } else if (arr2[i].equals("F2")) {

            } else {

                String e3;
                e3 = E3[0];
                first_E_prime.add(temp);
                first_E_prime.add(e3);

            }

        }

        System.out.println("Frist of E prime");
        Set<String> s = new LinkedHashSet<String>(first_E_prime);
        System.out.println(s);

    }


    private static void findTheFirstOfE1(String[] E1, String[] E2, String[] E3, String[] T1, String[] T2, String[] T3, String[] F1, String[] F2, String[] arr, String[] arr2) {
        ArrayList<String> first_E = new ArrayList<>();
        String[] noTerminal = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", ",", "(", ")", "="};
        String temp, temp2, t1, t2;
        temp = String.valueOf(E1[0]);
        for (int i = 0; i < arr2.length; i++) {
            if (temp.equals(arr2[i])) {
                if (arr2[i].equals("E1")) {

                } else if (arr2[i].equals("E2")) {

                } else if (arr2[i].equals("E3")) {

                } else if (arr2[i].equals("T1")) {
                    String t1m, t2m;
                    t1m = String.valueOf(T1[0]);
                    for (int p = 0; p < arr2.length; p++) {
                        if (t1m.equals(arr2[p])) {
                            if (arr2[p].equals("E1")) {

                            } else if (arr2[p].equals("E2")) {

                            } else if (arr2[p].equals("E3")) {

                            } else if (arr2[p].equals("T1")) {

                            } else if (arr2[p].equals("T2")) {

                            } else if (arr2[p].equals("T3")) {

                            } else if (arr2[p].equals("F1")) {
                                String f1m;
                                f1m = String.valueOf(F1[0]);
                                for (int pp = 0; pp < arr2.length; pp++) {
                                    if (f1m.equals(arr2[pp])) {

                                    } else {


                                                            first_E.add(f1m);



                                            }


                                }
                                String f2m;
                                f2m = String.valueOf(F2[0]);
                                for (int ppp = 0; ppp < arr2.length; ppp++) {
                                    if (f2m.equals(arr2[ppp])) {

                                    } else {

                                                first_E.add(f2m);


                                                }

                                            }

                                        }






                        } else if (arr2[i].equals("F2")) {


                        } else {

                        }
                    }

                }

            } else if (arr2[i].equals("T2")) {

            } else if (arr2[i].equals("T3")) {

            } else if (arr2[i].equals("F1")) {

            } else if (arr2[i].equals("F2")) {

            }

        }
        System.out.println("Frist of E");
        Set<String> s = new LinkedHashSet<String>(first_E);
        System.out.println(s);

    }


}

