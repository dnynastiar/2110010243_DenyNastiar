/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class DataPenjualan {
    
DataPenjualan obj = new DataPenjualan();
  String k ="Program Penjualan [y/n]:";
  System.out.println("\n");
  System.out.print(k);
 
  Scanner input = new Scanner(System.in);
  String ans= input.next();
 while(ans.equals("y")) {
   obj.getVal();
   obj.display();
   obj.clear();
   System.out.print("Ingin Lanjut "+k);
   ans = input.next();
 
   if(ans.equals("n")){
   System.out.println("program selesai");
   }
  }
 }
}
