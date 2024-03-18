/* Aim: Practical No. 4
Author:Vishranti Meshram
Version:4.0
Date:20 Feb 2024 */

public class PracticalNo4
{
public static void main(String[] args) 
{
 printName("Bill Joy");
}

public static void printName(String name)
 {

 name = name.trim();

 String[] parts = name.split("\\s+");

 String firstName = parts[0];
 String lastName = parts[parts.length - 1];

 String formattedName = lastName + "," + firstName;
System.out.println(formattedName);
 }
}

