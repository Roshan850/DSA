import java.util.ArrayList;
import java.util.Arrays;

public class JobSequencingProblem {
    static class Jobs{
        int deadline;
        int profit;
        int Id;

        public Jobs(int id,int d,int p){
            Id = id;
            deadline = d;
            profit = p;
        };


    }

    public static void main(String[] args){

        int jobInfo[][] = {{1,40},{1,30},{4,20},{1,10}};

        ArrayList<Jobs> job = new ArrayList<>();

        for(int i = 0;i< jobInfo.length;i++){
            job.add(new Jobs(i,jobInfo[i][0],jobInfo[i][1]));
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int time =0;
        for(int i =0 ;i<job.size();i++){
            Jobs curr = job.get(i);
            if(curr.deadline > time){
                ans.add(curr.Id);
                time++;
            }
        }

        System.out.println("Max job ="+job.size());
        // printing sequence
        for(int i = 0 ;i< ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }

    }


}
