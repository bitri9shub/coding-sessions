public class Main {
    public static int[] two_sum(int[] nums, int target){
        int[] resultat = new int[2];
        resultat[0] = -1;
        resultat[1] = -1;

        for (int j=0; j < nums.length; j++){
            for (int i=j; i < nums.length; i++){
                if (nums[i]+nums[j] == target){
                    resultat[0] = j;
                    resultat[1] = i;
                }
            }
        }

        return resultat;
    }

    public static void tooString(int[] result){
        for (int i=0; i < result.length; i++){
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }

    public static void main(String[] args) {
        int[] two_sum_1 = two_sum(new int[] {2,7,11,15}, 9);
        tooString(two_sum_1);
        int[] two_sum_2 = two_sum(new int[] {2,3,11,15}, 9);
        tooString(two_sum_2);
    }
}