/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentManage;

/**
 *
 * @author group9
 */
public class Drug {
    private String drugID;
    private String drugName;
    private int drugDosage;
    private String drugForm;
    private String drugInstructions;
    private String sideEffects;
    private String manufacturer;
    
      /**
     * This creates a drug for a prescription
     * @param drugID  Set  drug ID for the drug
     * @param drugName set grug name for the grug
     * @param drugDosage set drug dosage  for the drug
     * @param drugForm  set drug form  for the drug
     * @param drugInstructions set drug instructions  for the drug
     * @param sideEffects set drug effects  for the drug
     * @param manufacturer set drug manufacturer  for the drug
   */ 
    
    public Drug(String drugID, String drugName, int drugDosage, String drugForm, String drugInstructions, String sideEffects, String manufacturer   ){
        this.drugID = drugID ;
        this.drugName = drugName;
        this.drugDosage = drugDosage;
        this.drugForm = drugForm;
        this.drugInstructions =drugInstructions;
        this.sideEffects =  sideEffects;
        this.manufacturer = manufacturer;
        
    }
    
     /**
     * Returns  Drug ID  
     * @return   A String representing the drug ID  
     */
    public String getDrugID(){
        return drugID;
    }
    
     /**
     * Returns  Drug Name  
     * @return   A String representing the drug Name  
     */
    public String getDrugName(){
        return drugName;
    }
    
     /**
     * Returns  Drug dosage
     * @return   A String representing the drug dosage  
     */
    public int getDrugDosage(){
        return drugDosage;
    }
    
    /**
     * Returns  Drug form
     * @return   A String representing the drug form  
     */
    public String getDrugForm(){
        return drugForm;
    }
    
     /**
     * Returns  Drug instructions
     * @return   A String representing the drug instructions 
     */
    public String getDrugInstructions(){
        return drugInstructions;
    }
    
     /**
     * Returns  Drug effects
     * @return   A String representing the drug effects 
     */
    public String getDrugsideEffects(){
        return sideEffects;
    }
    
     /**
     * Returns  Drug manufacturer
     * @return   A String representing the drug manufacturer
     */
    public String getManufacturer(){
        return manufacturer;
    }
    
}

