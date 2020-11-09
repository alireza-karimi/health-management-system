import java.util.ArrayList;
import java.util.HashMap;

/**
 * represents a doctor
 * @author alireza
 * @version 1.0.0
 */
public class Doctor extends User{
	
	//collection of all patients of this doctor (just main patients)
	private HashMap<Patient, ArrayList<Record>> patientData;
	
	//all setter and getter methods for this doctor
	
	/**
	 * printing name of all patients related to this doctor
	 */
	public void printPatientsName(){
		
	}
	
	/**
	 * adding a new record for specific patient
	 * @param patient
	 * @param record
	 */
	public void addRecord(Patient patient, Record record){
		
	}
	
	/**
	 * sharing all records of a patient with another doctor
	 * @param patient
	 * @param doctor doctor who we want to share records with
	 */
	public void shareRecordsToDoctor(Patient patient, Doctor doctor){
		
	}
	
	/**
	 * sharing all records of a type related to a patient with another doctor
	 * @param patient
	 * @param doctor doctor who we want to share records with
	 * @param diseaseType diseaseType
	 */
	public void shareRecordsToDoctor(Patient patient, Doctor doctor, DiseaseType diseaseType){
		
	}
}
