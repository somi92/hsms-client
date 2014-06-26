package com.github.somi92.hsms.webservice;

import java.util.List;

public class HSMSClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HSMSWebServiceService ws = new HSMSWebServiceService();
		
		HSMSServices service = ws.getHSMSWebServicePort();
		List<Hsms> hsms = service.listActionsByPriority(2);
//		List<Hsms> hsms = service.listAllActions();
		
		System.out.printf("%-5s%-70s%-15s%-15s%-50s%-10s","RB","Opis","SMS broj","Cena poruke","Organizacija","Prioritet"+'\n');
		System.out.println("=====================================================================================================================================================================");
		
		int c = 0;
		for (Hsms i : hsms) {
			System.out.printf("%-5s%-70s%-15s%-15s%-50s%-10s",++c,i.getDesc(),i.getNumber(),i.getPrice(),i.getOrganisation(),i.getPriority());
			System.out.println();
		}
	}

}
