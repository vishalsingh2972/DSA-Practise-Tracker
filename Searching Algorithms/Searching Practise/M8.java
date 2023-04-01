//https://leetcode.com/problems/reach-a-number/
public class M8 {
    public static void main(String[] args) {

//        System.out.println(reachNumber(3));
//        System.out.println(reachNumber(-2));
//        System.out.println(reachNumber(8)); //here in the end we will reverse (sum-target)/2 = (10-8)/2 = 1st jump, i.e we will reverse 1st jump in order to reach target 8
//        System.out.println(reachNumber(5)); //here in the end we will reverse (sum-target)/2 = (15-5)/2 = 5th jump, i.e we will reverse 5th jump in order to reach target 5

        System.out.println(reachNumber2(3));
        System.out.println(reachNumber2(-2));
        System.out.println(reachNumber2(8));
        System.out.println(reachNumber2(5));

    }

    //Binary Search
    public static int reachNumber2(int target){

        target =  Math.abs(target); //convert all input to positive in order to search in positive search space

        long start = 1; //minimum we can take is 1 steps and maximum is 'target' steps
        long end = target;
        long pos = 0;
        long jumps = 0;


        while(start <= end){ //this while loop for finding pos greater than target and with minimum value of pos-target i.e this while loop for finding the nearest pos greater than target
            //the maximum number that we can reach in 'n' jumps is n(n+1)/2....suppose for n = 5 by mixing and matching positive and negative directions of each jump, I can reach all these values : -15, -13, -11, -9, -7, -5, -3, -1, 1, 3, 5, 7, 9, 11, 13, 15, among all these as you can see the maximum value that I can reach after making 5 jumps is 15 , therefore when n = 5 jumps the maximum value that I can reach after making 'n' jumps (here 5 jumps) = n(n+1)/2 = 5(5+1)/2 = 5(6)/2 = 15 = (1+2+3+4+5) case == all positive/right jumps case  //Basically starting from 0, the maximum number we can reach after making 'n' jumps is n(n+1)/2

            long mid = start + (end - start)/2;

            if(mid*(mid+1)/2 >= target){
                pos = mid*(mid+1)/2;
                jumps = mid;
                end = mid - 1;
            }
            else { //mid*(mid+1)/2 < target case
                start = mid + 1;
            }
        }

        long diff = pos - target;

//        if (diff%2 == 0){ //if diff is even //this if is redundant as if it does not enter diff%2 != 0 loop it will directly reach LAST
//            return jumps; //if diff is even, number of jumps will be same just direction of one jump will change in order to reach target
//        }

        if(diff%2 != 0){ //if diff is odd

            if(jumps%2 != 0){
                jumps = jumps + 2;
            }

            else { //when jumps%2 == 0 case
                jumps = jumps + 1;
            }
        }

        //for detailed explanation check https://youtu.be/frjYWZRs624
        return (int)jumps; //LAST //when diff is even it will reach this
    }


    //Brute Force
    public static int reachNumber(int target) {

        target =  Math.abs(target); //as it is symmetrical answers will be same for both negative and positive values, for example, number of steps for finding target +50 is same as number of steps for finding target -50, so better whatever the input positive or negative, make it positive and search as number os steps remain same
                                    //like for instance, The distance between -10 and 0 = 10, also the difference between 10 and 0 is 10, This implies that the sign of the target value doesn't matter since it's at the same distance from the origin. So to make our task easier, if we get a negative target value as input, we can take its positive value and search that positive value instead
                                    //and also, suppose for target = -2, if we don't put this step ---> target =  Math.abs(target), then code behaves abnormally as comparison operators behave different, so to avoid these unnecessary complexities and as we know no. of steps for finding positive target is same for no of steps required to find negative target, isliye kyu faltu ka dimag kharab karna best hain ki jo bhi input aa raha hain usko positive bana do using Math.abs aur phir number of steps dhundo for positive input ,SIMPLE!
                                    //for target = -2 as input hide "target =  Math.abs(target)" and debug you'll understand where error is happening!
        int sum = 0; //sum of total number of steps in all the jumps
        int jumps = 0;

        while(sum < target) {
            jumps++;
            sum = sum + jumps;

//            if (sum == target) { //redundant step //try for target = 3 debug and see
//                break;
//            }

        }

        while((sum-target)%2 != 0){
            jumps++;
            sum =  sum + jumps;
        }
        
        //in the end once we reach (sum-target)%2 == 0 condition and it exits the while((sum-target)%2 != 0 loop, we now know how many jumps are required to reach target, the only thing required now is to change the direction of one of the jumps, number of jumps required will be same nonetheless, for example if target = 8, and we start from 0....after 4 positive jumps(i.e jump order = 1st jump positive,2nd jump positive,3rd jump positive,4th jump positive----->so total jumps = 4) we reach 10, we need to reach 10 ,but we have reached 8, (10-8) %2 == 0 so we need to reverse one of the jumps, and which jumps we need to do reverse in order to reach target = (sum-target)/2, here = (10-8)/2 = 1st jump, so jump order becomes 1st jump negative,2nd jump positive,3rd jump positive,4th jump positive----->so total jumps = 4 as you can see number of jumps remain same i.e 4 just the order of one changes that's all
        //for detailed explanation check https://www.youtube.com/watch?v=kz_0GjhFOzc&t=385s&ab_channel=DineshKumar
        return jumps;
    }


}
