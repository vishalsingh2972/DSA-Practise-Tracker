public class M8 {
    public static void main(String[] args) {

        System.out.println(reachNumber(3));
        System.out.println(reachNumber(-2));
        System.out.println(reachNumber(8)); //here in the end we will reverse (sum-target)/2 = (10-8)/2 = 1st jump, i.e we will reverse 1st jump in order to reach target 8
        System.out.println(reachNumber(5)); //here in the end we will reverse (sum-target)/2 = (15-5)/2 = 5th jump, i.e we will reverse 5th jump in order to reach target 5




    }


    //Brute Force
    public static int reachNumber(int target) {

        target =  Math.abs(target); //as it is symmetrical answers will be same for both negative and positive values, for example, number of steps for finding target +50 is same as number of steps for finding target -50, so better whatever the input positive or negative, make it positive and search as number os steps remain same
                                    //suppose for target = -2, if we don't put this step ---> target =  Math.abs(target), then code behaves abnormally as comparison operators behave different, so to avoid these unnecessary complexities and as we know no. of steps for finding positive target is same for no of steps required to find negative target, isliye kyu faltu ka dimag kharab karna best hain ki jo bhi input aa raha hain usko positive bana do using Math.abs aur phir number of steps dhundo for positive input ,SIMPLE!
                                    //for target = -2 as input hide "target =  Math.abs(target)" and debug you'll understand where error is happening!
        int sum = 0; //total number of steps
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
        // for detailed explanation check https://www.youtube.com/watch?v=kz_0GjhFOzc&t=385s&ab_channel=DineshKumar
        return jumps;
    }


}
