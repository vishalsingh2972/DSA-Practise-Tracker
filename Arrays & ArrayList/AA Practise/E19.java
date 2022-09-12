//https://leetcode.com/problems/maximum-population-year/
public class E19 {
    public static void main(String[] args) {
        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maximumPopulation(logs));
    }


        public static int maximumPopulation(int[][] logs) {
            //year = index + 1950
            int arr[] = new int[101];


            for (int log[] : logs) {
                int by = log[0]; //birthyear
                int dy = log[1]; //deathyear
                arr[by - 1950]++;//placed 1 on by
                arr[dy - 1950]--;//placed -1 on dy

            }

            int max = arr[0]; //int max =0; (both working and giving correct/same output on IDE; but max=0 not working on leetcode)
            int maxyear = 1950;
            for (int i = 1; i < 101; i++) {
                arr[i] += arr[i - 1];
                if (arr[i] > max) {

                    max = arr[i];
                    maxyear = i + 1950;


                }

            }


            return maxyear;

        }
    }
