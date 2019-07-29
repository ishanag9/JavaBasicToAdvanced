// HELP RAMU
// Ramu often uses public transport. The transport in the city is of two types: cabs and rickshaws.
// The city has n rickshaws and m cabs, the rickshaws are numbered by integers from 1 to n,
// the cabs are numbered by integers from 1 to m.

//Public transport is not free. There are 4 types of tickets:

//A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
//A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
//A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
//A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.

//Ramu knows for sure the number of rides he is going to make and the transport he is going to use.
// He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.

package Lecture4;

import java.util.*;

public class HelpRamu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int c1, c2, c3, c4, n, m;
        int rick[] = new int[1005];
        int cab[] = new int[1005];

        while (t > 0) {
            c1 = s.nextInt();
            c2 = s.nextInt();
            c3 = s.nextInt();
            c4 = s.nextInt();

            n = s.nextInt();
            m = s.nextInt();

            for (int i = 0; i < n; i++) {
                rick[i] = s.nextInt();
            }
            for (int i = 0; i < m; i++) {
                cab[i] = s.nextInt();
            }
            int rickCost = 0;
            for (int i = 0; i < n; i++) {
                rickCost += Math.min(c1 * rick[i], c2);
            }
            rickCost = Math.min(rickCost, c3);

            int cabCost = 0;

            for (int i = 0; i < m; i++) {
                cabCost += Math.min(c1 * cab[i], c2);
            }
            cabCost = Math.min(cabCost, c3);
            int ans = 0;
            ans = Math.min(c4, cabCost + rickCost);
            System.out.println(ans);
            ;

            t--;
        }

        return;
    }
}




