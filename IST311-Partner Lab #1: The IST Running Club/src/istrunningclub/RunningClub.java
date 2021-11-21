/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;


import java.util.HashSet;


/**
 *
 * @author macbookpro
 */
public class RunningClub{
    
    private HashSet<Runner>runners = new HashSet();
    private HashSet<Race>races = new HashSet();
    private HashSet<RunnersResult> runnerResults = new HashSet();
    
    public boolean addRunner(int runnerID, String firstName, String lastName, String gender, int age){
        
        Runner runner1 = new Runner(runnerID, firstName, lastName, gender, age);
        if(runners.isEmpty()){
            runners.add(runner1);
            return true;
        }
        else{
            for(Runner ru : runners) {
                runners.add(runner1);
                return true;
            }
            return false;
        }
    }
    public boolean addRace(int raceID, String raceLocation, int raceDate){
        Race race1 = new Race(raceID, raceLocation, raceDate);
        if(races.isEmpty()){
            races.add(race1);
            return true;
        }
        else{
            for(Race ra : races) {
                    races.add(race1);
                    return true;
                }
            }
            return false;
        }
    public void recordCompletedRace(Runner run, Race rac, String finishTime, String finishPos){
        RunnersResult runnersresult = new RunnersResult();
        runnersresult.setRunners(run);
        runnersresult.setRaces(rac);
        runnersresult.setFinishTime(finishTime);
        runnersresult.setFinishPos(finishPos);
        runnerResults.add(runnersresult);
    }
    public void showAll(){
        for(Runner run : runners){
            System.out.println(run);
        }
        for(Race rac : races){
            System.out.println(rac);
        }
        for(RunnersResult R: runnerResults){
            System.out.println(R);
        }
    }
    
}
