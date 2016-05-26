package test;

public class Test {

public static void main(String[] args) {
		
		
		//public static String parseHBDataFileAndGenerateXMLResponse(String fileNameWithPath) {
			
			StringBuilder xmlString = new StringBuilder("");
			
			xmlString.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			xmlString.append("<bookingRQxmlns=\"http://www.hotelbeds.com/schemas/messages\"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">");
			xmlString.append("<holder name=\"Holder Name\"surname=\"Holder Surname\"/>");
			xmlString.append("<rooms>");
			xmlString.append("<room rateKey=\"126177|SGL-E10|CG-MERCHANT|1|ST|BB-E10||1~1~0|20150427#1033102103\">");
			xmlString.append("<paxes>");
			xmlString.append("<paxtype=\"AD\"age=\"30\"name=\"Adult Name\"surname=\"Auldt Surname\"/>");
			xmlString.append("</paxes>");
			xmlString.append("</room>");
			xmlString.append("</rooms>");
			xmlString.append("<paymentData>");
			xmlString.append("<paymentCard>");
			xmlString.append("<cardType>VI</cardType>");
			xmlString.append("<cardNumber>4444333322221111</cardNumber>");
			xmlString.append("<expiryDate>0615</expiryDate>");
			xmlString.append("<cardCVC>123</cardCVC>");
			xmlString.append(" </paymentCard>");
			xmlString.append("<contactData>");
			xmlString.append("<email>integration@test.com</email>");
			xmlString.append("<phoneNumber>654654654</phoneNumber>");
			xmlString.append(" </contactData>");
			xmlString.append("</paymentData>");
			xmlString.append("<clientReference>My booking reference</clientReference>");
			xmlString.append("</bookingRQ>");
			
			
			System.out.println(xmlString);		

	}
}
