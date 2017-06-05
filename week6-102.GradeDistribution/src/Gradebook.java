/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nikol
 */

import java.util.ArrayList;

public class Gradebook {
    private ArrayList<Integer> grades = new ArrayList<Integer>();
    private int[] distribution = {0,0,0,0,0,0}; 
    private int accepted;
    private int validNumGrades;
    
    public Gradebook(){
        
    }
    
    public void printDistribution(){
        for(int i=0;i<6;i++){                   //reset all the variables to 0
            this.distribution[i] = 0;
        }
        this.accepted = 0;
        this.validNumGrades = this.grades.size();
        
        for(int i=0;i<this.grades.size();i++){
            if(this.grades.get(i) > 60 || this.grades.get(i)< 0){
                this.validNumGrades--;
            }
            else if (this.grades.get(i) < 30) {
                this.distribution[0] += 1;
            } else if (this.grades.get(i) < 35) {
                this.distribution[1] += 1;
                this.accepted++;
            } else if (this.grades.get(i) < 40) {
                this.distribution[2] += 1;
                this.accepted++;
            } else if (this.grades.get(i) < 45) {
                this.distribution[3] += 1;
                this.accepted++;
            } else if (this.grades.get(i) < 50) {
                this.distribution[4] += 1;
                this.accepted++;
            } else {
               this.distribution[5] += 1;
               this.accepted++;
            }
            
        }
        
        System.out.println("Grade distribution: ");

        for(int j=5;j>=0;j--){
            System.out.print(j+": ");
            printStars(this.distribution[j]);
            System.out.println("");
        }
        
        System.out.println("Acceptance percentage: " + (100*((double)this.accepted/this.validNumGrades)));
        
    }
    
    private void printStars(int count){
        for(int i=0;i<count;i++){
            System.out.print("*");
        }
    }
    
    public void addGrade(int grade){
        grades.add(grade);
    }
}
