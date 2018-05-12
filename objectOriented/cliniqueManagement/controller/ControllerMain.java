package com.bridgeIt.objectOriented.cliniqueManagement.controller;

import com.bridgeIt.utility.Utility;

public class ControllerMain {

	public static void main(String[] args) {
		CliniqueManagementImp imp=new CliniqueManagementImp();
		System.out.println("Press the following to perform");
		System.out.println("1.Add Doctor \n2.View Doctors\n3.View Patients\n4.Appointments\n5.Popular specilization\n6.Popular Doctor");
		int choice=Utility.inputInt();
		int num=9;
		while(num==9){
			
			System.out.println();
			switch(choice){	
			case 1:{
				imp.addDoctor();
				break;
			}
			case 2:{
				imp.viewPatients();
				break;
			}
			case 3:{
				imp.viewDoctors();
				break;
			}
			case 4:{
				
				
				
			}
			
			
			
			
			
			}
			
			
		}
		
		
		
		
	}
}
