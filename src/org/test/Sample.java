package org.test;

public class Sample {
public static void main(String[] args) {
int num =8;
for(int i=0;i<num;i++) 
{
for(int j=2*(num-i);j>=0;j--)
{
System.out.print(" ");
}
for(int k=0;k<i+1;k++)
{
	System.out.print("* ");
}
System.out.println();

}
}}
