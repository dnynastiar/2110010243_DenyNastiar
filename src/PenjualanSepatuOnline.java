/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PenjualanSepatuOnline {
    
ArrayList<PenjualanSepatu> list;
   String merk = null,ukr = null;
   int harga = 0,ukuran,qty = 0,total=0,subtotal=0,jmlbayar=0,kembali=0,ppn,grandtotal;;
   Scanner scan;
   Scanner pilih = new Scanner(System.in);
   Scanner masukan = new Scanner(System.in);
   Scanner jumlah = new Scanner(System.in);
   Scanner bayar = new Scanner(System.in);
   int no = 1;
   int n;
 
void getVal() {
   list = new ArrayList<PenjualanSepatu>();
   scan = new Scanner(System.in);
   System.out.println("Selamat Datang di Toko Sepatu Deny Official");
   System.out.print("\nMasukan Jumlah Barang Transaksi : ");
   n = Integer.parseInt(scan.nextLine());
 for(int i=0; i<n; i++) {
     System.out.print("Pilih Kode Barang A.Nike B.Adidas C.Specs : ");
     String kode = pilih.next();
  switch (kode){
      case "A":
               merk="Nike";
               System.out.print("Silahkan pilih ukuran 1.Kecil 2.Sedang 3.Besar : ");
               ukuran=masukan.nextInt();
               if (ukuran==1) {
                  ukr="Kecil";
                  harga=500000;
               }else if (ukuran==2) {
                  ukr="Sedang";
                  harga=600000;
               }else if (ukuran==3) {
                  ukr="Besar";
                  harga=650000;
               }else{
                  System.out.println("Ukuran yg anda pilih tidak ada!!!");
               }
                  System.out.print("Silahkan masukan jumlah : ");
                  qty=masukan.nextInt();
               break;
      case "B":
              merk="Adidas";
              System.out.print("Silahkan pilih ukuran 1.Kecil 2.Sedang 3.Besar : ");
              ukuran=masukan.nextInt();
              if (ukuran==1) {
                  ukr="Kecil";
                  harga=450000;
              }else if (ukuran==2) {
                  ukr="Sedang";
                  harga=550000;
              }else if (ukuran==3) {
                  ukr="Besar";
                  harga=620000;
              }else{
                  System.out.println("Ukuran yg anda ppilih tidak ada!!!");
              }
                  System.out.print("Silahkan masukan jumlah : ");
                  qty=masukan.nextInt();
                  break;
     case "C":
             merk="Specs";
             System.out.print("Silahkan pilih ukuran 1.Kecil 2.Sedang 3.Besar : ");
             ukuran=masukan.nextInt();
             if (ukuran==1) {
                 ukr="Kecil";
                 harga=700000;
             }else if (ukuran==2) {
                 ukr="Sedang";
                 harga=750000;
             }else if (ukuran==3) {
                 ukr="Besar";
                 harga=800000;
             }else{
                 System.out.println("Ukuran yg anda ppilih tidak ada!!!");
             }
                 System.out.print("Silahkan masukan jumlah : ");
                 qty=masukan.nextInt();
             break;
    default :
             System.out.println("Kode barang adalah yang anda pilih salah. Silahkan ulangi");
           break;
   }
        total=qty*harga;
        list.add(new PenjualanBarang(no,kode,merk,ukr,harga,qty,total));
        no++;
  }
}
 
void display() {
   System.out.println("\n\n");
   System.out.println(" TOKO SEPEDA LUXMART SHOP ");
   System.out.println(" JOMBANG TANGSEL ");
   System.out.println(" APRIL 2018 ");
   System.out.println("--------------------------------------------------------------");
   System.out.println("|No.| Kode |"+" Merk |"+" Ukuran |"+" Harga |"+" Jumlah |"+" Total |");
   System.out.println("--------------------------------------------------------------");
 
   if(list.isEmpty()) {
        System.out.println("ArrayList kosong..");
   }else {
       for(int i=0; i<list.size(); i++) {
          System.out.println("|"+list.get(i).getNo() +" |"+list.get(i).getKode() +" |"
                    +list.get(i).getMerk()+" |"+list.get(i).getUkr()+" |"+list.get(i).getHarga()
                    +" |"+list.get(i).getQty()+" |"+list.get(i).getTotal()+" |");
          subtotal+=list.get(i).getTotal();
          ppn=(int) ((int) subtotal* 0.1);
          grandtotal=subtotal+ppn;
       }
   System.out.println("--------------------------------------------------------------");
   System.out.println("\t\t\t\t\t Subtotal : Rp. "+subtotal);
   System.out.println("\t\t\t\t\t ppn : Rp. "+ppn);
   System.out.println("\t\t\t\t\t Grandtotal: Rp. "+grandtotal);
   System.out.print("\t\t\t\t\t Pembayaran: Rp. ");
       jmlbayar=bayar.nextInt();
       kembali=(int) (jmlbayar-grandtotal);
   System.out.println("\t\t\t\t\t Kembalian : Rp. "+kembali);
    System.out.print("\n");
 
  }
}
 
 void clear(){
   for(int j=0; j<list.size(); j++) {
   list.removeAll(list);
   no=1;
   subtotal=0;
   ppn=0;
   grandtotal=0;
   }
 }
 
}
