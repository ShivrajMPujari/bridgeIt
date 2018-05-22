package com.bridgeIt.objectOriented.cliniqueManagement.controller;

import com.bridgeIt.objectOriented.cliniqueManagement.service.DoctorImp;
import com.bridgeIt.utility.Utility;

/**PURPOSE:-Clinique management system
 * @author Shivraj Pujari
 * @date 13-5-2018
 * @version 1.0
 */
public class ControllerMain {

	public static void main(String[] args) {
		CliniqueManagementImp imp=new CliniqueManagementImp();
		DoctorImp doctorImp= new DoctorImp();
		System.out.println("Press the following to perform");
		System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4.Appointments\n5.Popular Doctor\n6.Popular specilization\n7.Exist");
		int choice=Utility.inputInt();
		int num=9;
		while(num==9){
			
			switch(choice){	
			case 1:{
				imp.addDoctor();
				System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4.Appointments\n5.Popular specilization\n6.Popular Doctor\n7.Exist");
				choice=Utility.inputInt();
				break;
			}
			case 2:{
				imp.viewDoctors();
				System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4.Appointments\n5.Popular specilization\n6.Popular Doctor\n7.Exist");
				choice=Utility.inputInt();
				break;
			}
			case 3:{
				imp.viewPatients();
				System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4.Appointments\n5.Popular specilization\n6.Popular Doctor\n7.Exist");
				choice=Utility.inputInt();
				break;
			}
			case 4:{
			//	imp.viewDoctors();
				doctorImp.readDoctorAppointments();
				System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4.Appointments\n5.Popular specilization\n6.Popular Doctor\n7.Exist");
				choice=Utility.inputInt();
				break;
				
			}
			case 5:{
				
				imp.popularDoctor();
				System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4. Appointments\n5.Popular specilization\n6.Popular Doctor\n7.Exist");
				choice=Utility.inputInt();
				break;
			}
			case 6:{
				
				imp.popularSpecialization();
				System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4. Appointments\n5.Popular specilization\n6.Popular Doctor\n7.Exist");
				choice=Utility.inputInt();
				break;
			}
			case 7:{		
				System.exit(0);
			}
			default:{
				System.out.println("Entered wrong option");
				break;
			}
			
			}
	
		}
	
	}
}
