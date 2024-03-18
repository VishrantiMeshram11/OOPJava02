/* Aim:Practical No. 5
Author:Vishranti Meshram 
Version: 5.0
Date: 27 Feb 2024 */

class Emerging_Technologie {
void forum() {
System.out.println("Forum: General Emerging Technologies Forum");
}
}

class AIML extends Emerging_Technologie {
@Override
void forum() {
System.out.println("Forum President: Ojas Pimpalkar");
System.out.println("Forum Vice President:Muskan Shahu");
System.out.println("Forum Secretary: Sejal Patil");
System.out.println("Forum Treasurer: Sanyami Sukhdeve");
System.out.println("Event Head: Sneha Waghmare");
}
}

class AIDS extends Emerging_Technologie {
@Override
void forum() {
System.out.println("Forum President: Rutika Joge");
System.out.println("Forum Vice President: Vishranti Meshram");
System.out.println("Forum Secretary: Mitanshi Bokade");
System.out.println("Forum Treasurer: Sakshi Darokar ");

System.out.println("Event Head: Anisha Bobade");
}
}

class CSE extends Emerging_Technologie {
@Override
void forum() {
System.out.println("Forum President: Himanshi Nandeshwar");
System.out.println("Forum Vice President: Kuldeep Tiwari");
System.out.println("Forum Secretary: Riya Walde");
System.out.println("Forum Treasurer:Ansh Nagare");
System.out.println("Event Head: Ayush Upadhyay ");
}
}

public class PracticalNo5 {
public static void main(String[] args) {
AIML aimlForum = new AIML();
AIDS aidsForum = new AIDS();
CSE cseForum = new CSE();

System.out.println("AIML Forum Details:");
aimlForum.forum();
System.out.println();

System.out.println("AIDS Forum Details:");
aidsForum.forum();
System.out.println();

System.out.println("CSE Forum Details:");
cseForum.forum();
}
}