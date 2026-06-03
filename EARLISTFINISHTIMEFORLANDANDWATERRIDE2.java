public class EARLISTFINISHTIMEFORLANDANDWATERRIDE2 {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;
        int earlyFinishLand = Integer.MAX_VALUE;
        int earlyFinishWater = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            earlyFinishLand = Math.min(earlyFinishLand, landStartTime[i] + landDuration[i]);
        }
        
        for (int i = 0; i < waterStartTime.length; i++) {
            earlyFinishWater = Math.min(earlyFinishWater, waterStartTime[i] + waterDuration[i]);
        }


        for (int i = 0; i < landStartTime.length; i++) {
            minTime = Math.min(minTime, Math.max(earlyFinishWater, landStartTime[i]) + landDuration[i]);
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            minTime = Math.min(minTime, Math.max(earlyFinishLand, waterStartTime[i]) + waterDuration[i]);
        }

        return minTime;

    }
}
