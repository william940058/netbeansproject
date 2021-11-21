/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package istrunningclub;


/**
 *
 * @author macbookpro
 */
public class RunnersResult{
    private Runner runners;
    private Race races;
    private String finishTime;
    private String finishPos;

    public void setRunners(Runner runners) {
        this.runners = runners;
    }

    public void setRaces(Race races) {
        this.races = races;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public void setFinishPos(String finishPos) {
        this.finishPos = finishPos;
    }
    
    public Runner getRunners() {
        return runners;
    }

    public Race getRaces() {
        return races;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public String getFinishPos() {
        return finishPos;
    } 

    @Override
    public String toString() {
        return "FinishTime: " + finishTime + ", FinishPosition: " + finishPos + " " + runners + " " + races;
    }
    
}
