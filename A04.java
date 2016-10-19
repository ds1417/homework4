import java.util.*;
 import java.io.*;
   class A04{
              void input(){
	                Scanner s = new Scanner(System.in);
			            System.out.print("coffee : ");
				                int coffee = s.nextInt();
						            System.out.print("milk : ");
							                int milk = s.nextInt();
									            System.out.print("T.O.P :  ");
										                int highRankCoffee = s.nextInt();
												            int price = (coffee*200)+(milk*300)+(highRankCoffee*500);
													                print("total price :  "+price);
															               }
																               void print(String str){
																	                     System.out.println(str);
																			                }
																					                    public static void main(String [] args) throws IOException{
																							                             System.out.print("===============================\n");
																										                                      new A04().input();
																														                                  }
																																		       }
